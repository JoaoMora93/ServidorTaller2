/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.controladores.dto;

/**
 *
 * @author seba
 */
public class RespuestaMO {
    private String enunciado;
    private boolean escorrecta;

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public boolean isEscorrecta() {
        return escorrecta;
    }

    public void setEscorrecta(boolean escorrecta) {
        this.escorrecta = escorrecta;
    }
    
    
    
}
