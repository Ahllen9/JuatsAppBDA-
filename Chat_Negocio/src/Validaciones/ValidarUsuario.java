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

/**
 *
 * @author arturo
 */
public class ValidarUsuario {
    FachadaDAO fachada = new FachadaDAO();
    
    public ValidarUsuario() {
    }

//    public boolean validarNombreUsuario(){
//        
//    }
    
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
}
