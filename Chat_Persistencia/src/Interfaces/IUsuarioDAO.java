/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Usuario;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author arturo
 */
public interface IUsuarioDAO {
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
}
