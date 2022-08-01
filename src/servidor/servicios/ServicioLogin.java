/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class ServicioLogin {

    private Map<String, String> sesiones;

    String crearSesion(String doc) {
        String token = UUID.randomUUID().toString();
        if (sesiones == null) {
            sesiones = new HashMap<>();
        }
        sesiones.put(token, doc);
        return token;
    }

    boolean esSesionValida(String token) {
        return sesiones != null && sesiones.containsKey(token);
    }

}
