/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.controladores;

import java.util.List;

/**
 *
 * @author seba
 */
public interface IControladorUsuario {
    
    String login(int doc, String clave);
    List<Integer> obtenerGruposAsociados(String login);
    
    
    
}
