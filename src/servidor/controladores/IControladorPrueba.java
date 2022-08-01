/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.controladores;

import java.util.Date;
import java.util.List;

/**
 *
 * @author seba
 */
public interface IControladorPrueba {

    void crearPrueba(String login, List<Integer> preguntas, int grupo, Date inicio );
    
    void eliminarPrueba( String login, int codigo);
    
    void listarCodigosDePreuba( String login ); 
    
}
