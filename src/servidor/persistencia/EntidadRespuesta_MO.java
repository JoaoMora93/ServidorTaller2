/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.persistencia;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author gonza
 */
@Entity
public class EntidadRespuesta_MO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    private long ced_Ident; 
    private int cod_Preg;
    private int CODRESP;
    private String opcion; 
    private boolean esCorrecta;

    
   
    
    public EntidadRespuesta_MO() {
    }

    public EntidadRespuesta_MO(long ced_Ident, int cod_Preg, int codResp, String opcion, boolean esCorrecta) {
      
        this.ced_Ident = ced_Ident;
        this.cod_Preg = cod_Preg;
        this.CODRESP = codResp;
        this.opcion = opcion;
        this.esCorrecta = esCorrecta;
    }

     
    
    
    public Long getId() {
        return id;
    }

    public long getCed_Ident() {
        return ced_Ident;
    }

    public int getCod_Preg() {
        return cod_Preg;
    }

    public int getCodResp() {
        return CODRESP;
    }

    public String getOpcion() {
        return opcion;
    }

    public boolean isEsCorrecta() {
        return esCorrecta;
    }

      
    
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }

    
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntidadRespuesta_MO)) {
            return false;
        }
        EntidadRespuesta_MO other = (EntidadRespuesta_MO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "servidor.persistencia.EntidadRespuesta_MO[ id=" + id + " ]";
    }
    
}
