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
public class EntidadPrueba1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    
    private int codigo;   // clave primaria
    private long cedIdent;
    private String nombre;
    private boolean finalizada;
    boolean estaAsignada;
    int fecha_Asignacion; 
    int hora_Asignacion;

    public Long getId() {
        return id;
    }

    public EntidadPrueba1() {
    }

    public EntidadPrueba1(int codigo, long cedIdent, String nombre, boolean finalizada, boolean estaAsignada, int fecha_Asignacion, int hora_Asignacion) {
        this.codigo = codigo;
        this.cedIdent = cedIdent;
        this.nombre = nombre;
        this.finalizada = finalizada;
        this.estaAsignada = estaAsignada;
        this.fecha_Asignacion = fecha_Asignacion;
        this.hora_Asignacion = hora_Asignacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public long getCedIdent() {
        return cedIdent;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public boolean isEstaAsignada() {
        return estaAsignada;
    }

    public int getFecha_Asignacion() {
        return fecha_Asignacion;
    }

    public int getHora_Asignacion() {
        return hora_Asignacion;
    }

    
    
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public void setEstaAsignada(boolean estaAsignada) {
        this.estaAsignada = estaAsignada;
    }

    public void setFecha_Asignacion(int fecha_Asignacion) {
        this.fecha_Asignacion = fecha_Asignacion;
    }

    public void setHora_Asignacion(int hora_Asignacion) {
        this.hora_Asignacion = hora_Asignacion;
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
        if (!(object instanceof EntidadPrueba1)) {
            return false;
        }
        EntidadPrueba1 other = (EntidadPrueba1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "servidor.persistencia.EntidadPrueba1[ id=" + id + " ]";
    }
    
}
