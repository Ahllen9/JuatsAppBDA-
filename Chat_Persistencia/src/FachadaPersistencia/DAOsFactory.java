/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FachadaPersistencia;


import Implementaciones.ChatDAO;
import Implementaciones.ConexionBD;
import Implementaciones.MensajeDAO;
import Implementaciones.UsuarioDAO;
import Interfaces.IChatDAO;
import Interfaces.IConexionBD;
import Interfaces.IMensajeDAO;
import Interfaces.IUsuarioDAO;
import implementaciones.*;

/**
 *
 * @author ricardosn saavedra
 */
public class DAOsFactory {
    private IConexionBD conexion;

    public DAOsFactory() {
        this.conexion = new ConexionBD();
    }
    
    public UsuarioDAO crearUsuariosDAO(){
        return new UsuarioDAO(conexion);
    }
    
    public MensajeDAO crearMensajeDAO(){
        return new MensajeDAO(conexion);
    }
    
    public ChatDAO crearChatDAO(){
        return new ChatDAO(conexion);
    }
}
