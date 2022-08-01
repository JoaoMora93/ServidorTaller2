/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.controladores;

import servidor.controladores.dto.DetallePregunta;
import java.util.List;
import servidor.controladores.dto.RespuestaMO;

/**
 *
 * @author seba
 */
public interface IControladorPregunta {
    
    void crearPreguntaVF(String login, String nombre, String enunciado, boolean respuestaCorrecta);
    
    void eliminarPregunta(String login, int codigo);
    
    List<Integer> listarCodigosDePreguntas(String login);
    
    DetallePregunta obtenerPregunta(String login, int codigo);
     void crearPreguntaMO(String login, String nombre, String enunciado, List <RespuestaMO> respuestas);

    
    
    
}
