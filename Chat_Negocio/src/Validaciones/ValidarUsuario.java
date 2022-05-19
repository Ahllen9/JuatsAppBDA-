/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

import Entidades.Chat;
import Entidades.Usuario;
import FachadaPersistencia.FachadaDAO;
import Implementaciones.ChatDAO;
import Implementaciones.ConexionBD;
import Implementaciones.UsuarioDAO;
import Interfaces.IChatDAO;
import Interfaces.IUsuarioDAO;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
    
    public boolean validarFormatoEmail(String email){
        Pattern pattern =Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
    
    public void mostrarMensajes(){
        fachada.consultarMensajes();
    }
    
    public ObjectId getIdChatSeleccionado(JTable tablaChats){
        int indiceFilaSeleccionada = tablaChats.getSelectedRow();
        if (indiceFilaSeleccionada != -1) {
            DefaultTableModel modeloTabla = (DefaultTableModel) tablaChats.getModel();
            int indiceColumnaId = 0;
            ObjectId IdChatSeleccionado = (ObjectId)modeloTabla.getValueAt(indiceFilaSeleccionada, indiceColumnaId);
            return IdChatSeleccionado;
        }
        else {
            return null;
        }       
    }
    
    public boolean validarUsuarioNombre(String nombre){
        return fachada.consultarNombre(nombre);
    }
    
    public Usuario regresarUsuarioNombre(String nombre){
        return fachada.consultarUsuarioNombre(nombre);
    }
    
    public void llenarTabla(JTable tabla){
        List<Chat> listaUsuarios = fachada.consultarChats();
        DefaultTableModel modelo= (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        listaUsuarios.forEach(chat -> {
            Object[] fila = new Object[3];
            fila[0]= chat.getId().toString();
            fila[1]=chat.getNombre();
            fila[2]= chat.getUsuarioReceptor().getNombre();
            modelo.addRow(fila);
        });
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    public boolean crearChat(Chat chat){
        return fachada.agregarChat(chat);
    }
}
