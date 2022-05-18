/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Mensaje;
import java.util.List;

/**
 *
 * @author arturo
 */
public interface IMensajeDAO {
    /**
     * Método que agrega el usuario dado por parámetro
     * @param mensaje 
     */
    void agregar(Mensaje mensaje);
    /**
     * Método que regresa todos los mensajes registrados
     * @return 
     */
    List<Mensaje> consultarMensajes();
}
