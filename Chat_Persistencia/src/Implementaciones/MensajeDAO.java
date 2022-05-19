/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones;

import Entidades.Mensaje;
import Interfaces.IConexionBD;
import Interfaces.IMensajeDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author arturo
 */
public class MensajeDAO implements IMensajeDAO{
    private IConexionBD conexion;
    private MongoDatabase baseDatos;
    
    public MensajeDAO(IConexionBD conexion){
        this.conexion = conexion;
        this.baseDatos = conexion.crearConexion();
    }
    /**
     * Devuelve la coleccion de usuarios de la base de datos
     * @return 
     */
    private MongoCollection<Mensaje> getColeccion(){
        return this.baseDatos.getCollection("Mensajes",Mensaje.class);
    }
    
    @Override
    public void agregar(Mensaje mensaje) {
        MongoCollection<Mensaje> coleccion = this.getColeccion();
        coleccion.insertOne(mensaje);
    }

    @Override
    public List<Mensaje> consultarMensajes(ObjectId idchat) {
        MongoCollection<Mensaje> coleccion = this.getColeccion();
        List<Mensaje> usuarios = new LinkedList<>(); 
        coleccion.find().into(usuarios);
        return usuarios;
    }
    
}
