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
public class EntidadPregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    private long cedIdent;
    private int codigo;
    private String nombre;
    private String enunciado;

    public EntidadPregunta() {
    }

    public EntidadPregunta(long cedIdent, int codigo, String nombre, String enunciado) {
        this.cedIdent = cedIdent;
        this.codigo = codigo;
        this.nombre = nombre;
        this.enunciado = enunciado;
    }
     
           
    public Long getId() {
        return id;
    }

    public long getCedIdent() {
        return cedIdent;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEnunciado() {
        return enunciado;
    }

    
    
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
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
        if (!(object instanceof EntidadPregunta)) {
            return false;
        }
        EntidadPregunta other = (EntidadPregunta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "servidor.persistencia.EntidadPregunta[ id=" + id + " ]";
    }
    
}
