/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.controladores.impl;

import java.util.List;
import servidor.controladores.IControladorPregunta;
import servidor.controladores.dto.DetallePregunta;
import servidor.controladores.dto.RespuestaMO;

/**
 *
 * @author seba
 */
public class ControladorPregunta implements IControladorPregunta {

    @Override
    public void crearPreguntaVF(String login, String nombre, String enunciado, boolean respuestaCorrecta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPregunta(String login, int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Integer> listarCodigosDePreguntas(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetallePregunta obtenerPregunta(String login, int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearPreguntaMO(String login, String nombre, String enunciado, List<RespuestaMO> respuestas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
