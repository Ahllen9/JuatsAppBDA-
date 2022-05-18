/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

import Entidades.Usuario;
import FachadaPersistencia.FachadaDAO;
import Implementaciones.ConexionBD;
import Implementaciones.UsuarioDAO;
import Interfaces.IUsuarioDAO;
import org.bson.types.ObjectId;

/**
 *
 * @author arturo
 */
public class ValidarUsuario {
    FachadaDAO fachada = new FachadaDAO();
    
    public ValidarUsuario() {
    }

    public boolean validarNombreUsuario(String nombreUsuario){
        if (fachada.consultarNombre(nombreUsuario) == true) {
            return false;
        }
        else return true;
    }
    
    public boolean validarEmail(String nombreUsuario){
        if (fachada.consultarNombre(nombreUsuario) == true) {
            return false;
        }
        else return true;
    }
    
    public boolean validarContrasenia(String email, String password){
        Usuario user = fachada.consultarUsuario(email, password);
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            return true;
        }
        else return false;
    }
    
    public Usuario IniciarPerfil(String email, String password){
        return fachada.consultarUsuario(email, password);
    }
    
    public boolean validarUsuario(String email, String password){
        if (fachada.consultarExisteUsuario(email, password)) {
            return true;
        }
        else return false;
    }
    
    public boolean buscarID(ObjectId id){
        if (fachada.consultarIDUsuario(id)) {
            return true;
        }
        else return false;
    }
    
    public void actualizarUsuario(Usuario usuario){
        fachada.actualizar(usuario);
    }
    
    public boolean agregarUsuario(Usuario usuario){
        return fachada.agregar(usuario);
    }
}
