/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones;

import Entidades.Chat;
import Entidades.Mensaje;
import Entidades.Usuario;
import Interfaces.IChatDAO;
import Interfaces.IConexionBD;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author arturo
 */
public class ChatDAO implements IChatDAO{
    private IConexionBD conexion;
    private MongoDatabase baseDatos;
    
    public ChatDAO(IConexionBD conexion){
        this.conexion = conexion;
        this.baseDatos = conexion.crearConexion();
    }
    
    private MongoCollection<Chat> getColeccion(){
        return this.baseDatos.getCollection("Chats",Chat.class);
    }
    
    @Override
    public boolean agregarChat(Chat chat) {
        MongoCollection<Chat> coleccion = this.getColeccion();
        coleccion.insertOne(chat);
        return true;
    }

    @Override
    public List<Usuario> consultarChatsUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mensaje> consultarChatsMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Chat> consultarChats() {
        MongoCollection<Chat> coleccion = this.getColeccion();
        List<Chat> chats = new LinkedList<>(); 
        coleccion.find().into(chats);
        return chats;
    }

    @Override
    public Chat consultarChat(ObjectId id) {
        FindIterable<Chat> registros = this.getColeccion().find(new Document().append("_id",id));
        Chat chat = registros.first();
        return chat;
        
    }

    @Override
    public boolean chatExiste(ObjectId id) {
        FindIterable<Chat> registros = this.getColeccion().find(new Document().append("_id",id));
        if (registros.first() == null) {
            return false;
        }
        else return true;
    }
    
}
