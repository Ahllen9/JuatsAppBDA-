/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Chat;
import Entidades.Mensaje;
import Entidades.Usuario;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author arturo
 */
public interface IChatDAO {
    /**
     * Método que agrega los datos dados por parámetro
     * @param usuario
     * @param mensaje 
     */
    boolean agregarChat(Chat chat);
    /**
     * Método que regresa todos los chats registrados
     * @return 
     */
    List<Usuario> consultarChatsUsuarios();
    /**
     * Método que regresa todos los mensajes registrados
     * @return 
     */
    List<Mensaje> consultarChatsMensajes();
    /**
     * Método que regresa todos los chats registrados
     * @return 
     */
    List<Chat> consultarChats();
    /**
     * Método que regresa un chat
     * @return 
     */
    Chat consultarChat(ObjectId id);
    /**
     * Comprueba si el cha existe
     * @return 
     */
    boolean chatExiste(ObjectId id);
}
