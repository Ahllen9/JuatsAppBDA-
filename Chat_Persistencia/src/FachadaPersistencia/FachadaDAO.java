/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FachadaPersistencia;

import Entidades.Chat;
import Entidades.Mensaje;
import Entidades.Usuario;
import Implementaciones.ChatDAO;
import Implementaciones.MensajeDAO;
import Implementaciones.UsuarioDAO;
import Interfaces.IFachada;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author arturo
 */
public class FachadaDAO implements IFachada{
    private DAOsFactory fabrica;
    private UsuarioDAO usuario;
    private MensajeDAO mensaje;
    private ChatDAO chat;

    public FachadaDAO() {
        fabrica = new DAOsFactory();
        
        this.usuario = fabrica.crearUsuariosDAO();
        this.mensaje = fabrica.crearMensajeDAO();
        this.chat = fabrica.crearChatDAO();
    }
    
    @Override
    public boolean agregar(Usuario usuario) {
        return this.usuario.agregar(usuario);
    }

    @Override
    public boolean actualizar(Usuario usuario) {
        return this.usuario.actualizar(usuario);
    }

    @Override
    public Usuario consultarUsuario(String email, String password) {
        return this.usuario.consultarUsuario(email, password);
    }

    @Override
    public boolean consultarExisteUsuario(String email, String password) {
        return this.usuario.consultarExisteUsuario(email, password);
    }

    @Override
    public boolean consultarEmail(String email) {
        return this.usuario.consultarEmail(email);
    }

    @Override
    public boolean consultarNombre(String nombre) {
        return this.usuario.consultarNombre(nombre);
    }

    @Override
    public boolean consultarIDUsuario(ObjectId id) {
        return this.usuario.consultarIDUsuario(id);
    }

    @Override
    public List<Usuario> consultarTodos() {
        return this.usuario.consultarTodos();
    }

    @Override
    public void agregar(Mensaje mensaje) {
        this.mensaje.agregar(mensaje);
    }

    @Override
    public List<Mensaje> consultarMensajes() {
        return this.mensaje.consultarMensajes();
    }

    @Override
    public boolean agregarChat(Chat chat) {
        return this.chat.agregarChat(chat);
    }

    @Override
    public List<Usuario> consultarChatsUsuarios() {
        return this.chat.consultarChatsUsuarios();
    }

    @Override
    public List<Mensaje> consultarChatsMensajes() {
        return this.chat.consultarChatsMensajes();
    }

    @Override
    public List<Chat> consultarChats() {
        return this.chat.consultarChats();
    }

    @Override
    public List<Chat> consultarChat(Chat chat) {
        return this.chat.consultarChat(chat);
    }

    @Override
    public Usuario consultarUsuarioNombre(String nombre) {
        return this.usuario.consultarUsuarioNombre(nombre);
    }
}
