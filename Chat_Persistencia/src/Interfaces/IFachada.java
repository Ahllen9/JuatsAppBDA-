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
public interface IFachada {
    /**
     * Método que agrega el usuario dado por parámetro
     * @param usuario 
     */
    boolean agregar(Usuario usuario);
    /**
     * Método que regresa todos los usuarios registrados
     * @param usuario
     * @return 
     */
    boolean actualizar(Usuario usuario);
    /**
     * Método que regresa el usuario que contenga los valores dados por paramtro
     * @param email
     * @param password
     * @return 
     */
    Usuario consultarUsuario(String email,String password);
    /**
     * Método que regresa true en caso de que encuentre el usuario con los datos dados por parametro
     * @param email
     * @param password
     * @return 
     */
    boolean consultarExisteUsuario(String email,String password);
    /**
     * Métodp que regresa true en caso de que encuentre el usuario con el email dado por parametro
     * @param email
     * @return 
     */
    boolean consultarEmail(String email);
    /**
     * Métodp que regresa true en caso de que encuentre el usuario con el nombre dado por parametro
     * @param nombre
     * @return 
     */
    boolean consultarNombre(String nombre);
    /**
     * Métodp que regresa true en caso de que encuentre el usuario con el id dado por parametro
     * @param id
     * @return 
     */
    boolean consultarIDUsuario(ObjectId id);
    /**
     * Método que regresa el usuario dado por parámetro en caso de existir
     * @return 
     */
    List<Usuario> consultarTodos();
    /**
     * Método que agrega el usuario dado por parámetro
     * @param mensaje 
     */
    void agregar(Mensaje mensaje);
    /**
     * Metodo que regresa el usuario buscado por el nombre dado por parametro
     * @param nombre
     * @return 
     */
    Usuario consultarUsuarioNombre(String nombre);
    /**
     * Método que regresa todos los mensajes registrados
     * @return 
     */
    List<Mensaje> consultarMensajes();
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
     * Método que regresa todos un chat
     * @return 
     */
    List<Chat> consultarChat(Chat chat);
    
}
