package servidor.persistencia;

import javax.persistence.EntityManager;

public interface IAccesoPersistencia {

    void guardarPregunta(long cedIdent, int codigo, String nombre, String enunciado);
    void guardar(Object entidad);

}
