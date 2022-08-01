package servidor.controladores.dto;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seba
 */
public class DetallePregunta {
    private String enunciado;
    private TipoPregunta tipo;
    private List<RespuestaMO> respuestas;
    private boolean esCorrecto;

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public TipoPregunta getTipo() {
        return tipo;
    }

    public void setTipo(TipoPregunta tipo) {
        this.tipo = tipo;
    }

    public List<RespuestaMO> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<RespuestaMO> respuestas) {
        this.respuestas = respuestas;
    }

    public boolean isEsCorrecto() {
        return esCorrecto;
    }

    public void setEsCorrecto(boolean esCorrecto) {
        this.esCorrecto = esCorrecto;
    }

    
}
