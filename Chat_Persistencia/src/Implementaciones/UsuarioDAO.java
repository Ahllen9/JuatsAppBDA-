/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones;

import Entidades.Usuario;
import Interfaces.IConexionBD;
import Interfaces.IUsuarioDAO;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.regex;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bson.BSON;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author arturo
 */
public class UsuarioDAO implements IUsuarioDAO{
    private IConexionBD conexion;
    private MongoDatabase baseDatos;
    
    public UsuarioDAO(IConexionBD conexion){
        this.conexion = conexion;
        this.baseDatos = conexion.crearConexion();
    }
    /**
     * Devuelve la coleccion de usuarios de la base de datos
     * @return 
     */
    private MongoCollection<Usuario> getColeccion(){
        return this.baseDatos.getCollection("Usuarios",Usuario.class);
    }
    
    @Override
    public boolean agregar(Usuario usuario) {
        MongoCollection<Usuario> coleccion = this.getColeccion();
        coleccion.insertOne(usuario);
        return true;
    }

    @Override
    public Usuario consultarUsuario(String email, String password) {
        FindIterable<Usuario> registros = this.getColeccion().find(new Document().append("email",email)
                .append("password",password));
        Usuario user = registros.first();
        return user;
    }

    @Override
    public List<Usuario> consultarTodos() {
        MongoCollection<Usuario> coleccion = this.getColeccion();
        List<Usuario> usuarios = new LinkedList<>(); 
        coleccion.find().into(usuarios);
        return usuarios;
    }

    @Override
    public boolean consultarExisteUsuario(String email, String password) {
        FindIterable<Usuario> registros = this.getColeccion().find(new Document().append("email",email)
                .append("password",password));
        if (registros.first() == null) {
            return false;
        }
        else return true;
    }

    @Override
    public boolean consultarEmail(String email) {
        FindIterable<Usuario> registros = this.getColeccion().find(new Document().append("email",email));
        if (registros.first() == null) {
            return false;
        }
        else return true;
    }

    @Override
    public boolean consultarIDUsuario(ObjectId id) {
        FindIterable<Usuario> registros = this.getColeccion().find(new Document().append("_id", id));
        if (registros.first() == null) {
            return false;
        }
        else return true;
    }

    @Override
    public boolean actualizar(Usuario usuario) {
        MongoCollection<Usuario> coleccion = this.getColeccion();
        List<Usuario> usuariosActualizados = new LinkedList<>();
        try{
            Document valoresNuevos = new Document().append("nombre", usuario.getNombre()).
                                        append("email", usuario.getEmail()).append("password", usuario.getPassword());
            Document actualizar = new Document("$set",valoresNuevos);
            coleccion.updateOne(new Document().append("_id", usuario.getId()),actualizar);
            coleccion.find(new Document("_id", usuario.getId())).into(usuariosActualizados);
            usuariosActualizados.get(0);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean consultarNombre(String nombre) {
        FindIterable<Usuario> registros = this.getColeccion().find(new Document().append("nombre", nombre));
        if (registros.first() == null) {
            return false;
        }
        else return true;
    }

    @Override
    public Usuario consultarUsuarioNombre(String nombre) {
        FindIterable<Usuario> registros = this.getColeccion().find(new Document().append("nombre",nombre));
        Usuario user = registros.first();
        return user;
    }
    
}
