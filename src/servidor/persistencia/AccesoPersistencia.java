package servidor.persistencia;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.metamodel.EntityType;

import java.util.Date;

public class AccesoPersistencia implements IAccesoPersistencia {

    private static AccesoPersistencia INSTANCIA = null;
    private final EntityManager em;

    private AccesoPersistencia() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("servidorPU");
        this.em = emf.createEntityManager();
    }

    public static AccesoPersistencia getInstancia() {
        if (INSTANCIA == null) {
            INSTANCIA = new AccesoPersistencia();
        }
        return INSTANCIA;
    }

    // persiste los datos en EntidadPreguntaPrueba1
    private void guardarPreguntasPrueba( int codPrueba, int codPregunta, int punto) {
    
       
        System.out.println ("codigo de prueba " + codPrueba + " codigo de pregunta " + codPregunta + " puntaje " + punto + " ");
        EntidadPreguntaPrueba1 p = new EntidadPreguntaPrueba1 (codPrueba, codPregunta, punto);
        this.guardar(p);
    }
    
    // persiste los datos en EntidadPrueba1
    public void guardarPruebas(long cedIdent,String nombre, int[] codPreguntas, int[] puntaje){
        
    int codPrueba = (this.devolverMaxCodEntidadPrueba1());
    codPrueba++;
    boolean finalizada = false;
    boolean estaAsignada = false;
    int fechaAsignacion = 0;
    int horaAsignacion = 0;


    System.out.println ("persistencia de la entidad Prueba1");
    System.out.println ("codigo de prueba " + codPrueba + " cedula " + cedIdent + " " +  
            nombre +  " finalizada " + finalizada + " asignada " + estaAsignada +" fecha " + fechaAsignacion + " hora " + horaAsignacion);
    
    
    EntidadPrueba1 p1 = new EntidadPrueba1 (codPrueba,cedIdent, nombre, finalizada, estaAsignada, fechaAsignacion, horaAsignacion);
    this.guardar(p1);
    
    // persistir datos en EntidadPreguntas_Prueba1
    System.out.println ("persistencia de la entidad PreguntasPrueba1");
    for (int i=0; i < codPreguntas.length; i++)
        this.guardarPreguntasPrueba(codPrueba, codPreguntas[i], puntaje[i]);
    
    }
    
    
    public void guardarPregunta(long cedIdent, int codigo, String nombre, String enunciado) {
    
        EntidadPregunta pregunta = new EntidadPregunta (cedIdent, codigo, nombre, enunciado);
        this.guardar(pregunta);
    
    }
    
    
    // guarda las respuestas de una pregunta multiple opcion en la entidad EntidadRespesta_MO
    public void guardarRespuestasMultipleOpcion(long cedIdent,int codPreg, int codResp, String opcion, boolean esCorrecta) {
    
        EntidadRespuesta_MO respuesta = new EntidadRespuesta_MO (cedIdent, codPreg, codResp, opcion, esCorrecta);
        this.guardar(respuesta);
    
    }
    
    @Override
    public void guardar(Object entidad) {                                 // en el parámetro entidad se pasa la tabla
       // System.out.println("Guardado de " + ((EntidadPrueba) entidad).getDocumento());
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
       // System.out.println("------------------");
    }

       
    public  List <String> devolverPreguntasDocente(long cedIdent) {
    
     Query query = em.createQuery("SELECT p.nombre FROM EntidadPregunta p WHERE p.cedIdent="+cedIdent+"");
     List <String> preguntas = (List<String>) query.getResultList();
     
     return preguntas;
     
     }
    
     public   ArrayList<Integer> devolverCodigoPreguntasDocente(long cedIdent) {
    
        Query query = em.createQuery("SELECT e FROM EntidadPregunta e");       // SE PONE EL NOMBRE DE LA TABLA:"EntidadPrueba"
        List<EntidadPregunta> entidades = (List<EntidadPregunta>) query.getResultList();
        ArrayList<Integer> preguntas = new ArrayList<Integer>(entidades.size());
        
        int i = 0;
        for (EntidadPregunta e : entidades) {
        
            if (e.getCedIdent() == cedIdent)
                preguntas.add(e.getCodigo()); 
                
        }
           
        return preguntas;
     
     }
    
    // devuelve el mayor codigo de pregunta que está guardado EntidadPregunta
    public int devolverMaxCodEntidadPregunta() {
    
        int maxPK = 0;
      
        Query query = em.createQuery("SELECT MAX (p.codigo) FROM EntidadPregunta P" );
        
        Object obj = query.getSingleResult();
        if (obj != null) {
            Integer result = Integer.parseInt(obj.toString());
            return result;
            }

        return Integer.valueOf(0);
      
    
    }

   
   
    
      // devuelve el mayor codigo de pregunta que está guardado EntidadPrueba
    public int devolverMaxCodEntidadPrueba1() {
    
        int maxPK = 0;
      
        Query query = em.createQuery("SELECT MAX (p.codigo) FROM EntidadPrueba1 p" );
        
        Object obj = query.getSingleResult();
        if (obj != null) {
            Integer result = Integer.parseInt(obj.toString());
            return result;
            }

        return Integer.valueOf(0);
      
    
    }
    
    
    
  // METODOS PARA PROBAR LA PERSISTENCIA   
    
 public void listarPruebaEnTerminal() {
        System.out.println("Pruebas guardadas: ");
        Query query = em.createQuery("SELECT e FROM EntidadPrueba e");       // SE PONE EL NOMBRE DE LA TABLA:"EntidadPrueba"
        List<EntidadPrueba> entidades = (List<EntidadPrueba>) query.getResultList();
        for (EntidadPrueba e : entidades) {
            System.out.println(e.getDocumento());
        }
        System.out.println("------------------");
    }
 
 
 
 public void listarRespuestasMO_EnTerminal() {
        System.out.println("Respuestas multiple opcion en EntidadRespuesta_MO: ");
        Query query = em.createQuery("SELECT e FROM EntidadRespuesta_MO e");       // SE PONE EL NOMBRE DE LA TABLA:"EntidadPrueba"
        List<EntidadRespuesta_MO> entidades = (List<EntidadRespuesta_MO>) query.getResultList();
        for (EntidadRespuesta_MO e : entidades) {
            System.out.println(e.getCed_Ident() +" " + e.getCod_Preg() + " " + e.getCodResp() +" " + e.getOpcion() + " " + e.isEsCorrecta());
        }
        System.out.println("------------------");
    }
 
 
 public void listarPruebas() {
        System.out.println("Pruebas en EntidadPruebas1: ");
        Query query = em.createQuery("SELECT e FROM EntidadPrueba1 e");       // SE PONE EL NOMBRE DE LA TABLA:"EntidadPrueba"
        List<EntidadPrueba1> entidades = (List<EntidadPrueba1>) query.getResultList();
        for (EntidadPrueba1 e : entidades) {
            System.out.println(e.getCodigo()+" " + e.getCedIdent() + " " + e.getNombre());
        }
        System.out.println("------------------");
    }
 
 
  public void borrarRespuestasMO() {
        System.out.println("Se borrará la información de la EntidadRespuesta_MO: ");
        
        try {
        
           Query q = em.createQuery("DELETE FROM EntidadRespuesta_MO AS e");
           int cantBorrados = q.executeUpdate(); // NO FUNCIONA - VER em.
               
             
            System.out.println(" Se borraron los  registros");
        
           }
        
        catch (Exception e) {
        
            System.out.println (" No se pudo borrar la tabla EntidadRespuesta_MO");
        
        }
        
        
      
       
    }
   
  // borra una entidad pasada como parámetro
  public void borrar(Object entidad) {                                 // en el parámetro entidad se pasa la tabla
       
        em.getTransaction().begin();
        em.remove(entidad);
        em.getTransaction().commit();
      
    }
  
  
}  