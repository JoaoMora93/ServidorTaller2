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
 * @author gonzalo
 */
@Entity
public class EntidadPreguntaPrueba1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int codPrueba;
    private int codPregunta;
    private int puntaje;

    public EntidadPreguntaPrueba1() {
    }

    public EntidadPreguntaPrueba1(int codPrueba, int codPregunta, int puntaje) {
        this.codPrueba = codPrueba;
        this.codPregunta = codPregunta;
        this.puntaje = puntaje;
    }

    public int getCodPrueba() {
        return codPrueba;
    }

    public int getCodPregunta() {
        return codPregunta;
    }

    public int getPuntaje() {
        return puntaje;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    
    
    
    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof EntidadPreguntaPrueba1)) {
            return false;
        }
        EntidadPreguntaPrueba1 other = (EntidadPreguntaPrueba1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "servidor.persistencia.EntidadPreguntaPrueba1[ id=" + id + " ]";
    }
    
}
