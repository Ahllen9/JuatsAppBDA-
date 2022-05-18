/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import com.sun.corba.se.spi.ior.ObjectId;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author arturo
 */
public class Chat {
    private ObjectId id;
    private List<ObjectId> idsUsuarios;
    private List<Mensaje> mensajes;
    private Usuario usuario;
    private Mensaje mensaje;

    public Chat() {
    }

    public Chat(ObjectId id) {
        this.id = id;
    }

    public Chat(ObjectId id, List<ObjectId> idsUsuarios, List<Mensaje> mensajes) {
        this.id = id;
        this.idsUsuarios = idsUsuarios;
        this.mensajes = mensajes;
    }

    public Chat(Usuario usuario, Mensaje mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }
    
    

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<ObjectId> getIdsUsuarios() {
        return idsUsuarios;
    }

    public void setIdsUsuarios(List<ObjectId> idsUsuarios) {
        this.idsUsuarios = idsUsuarios;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chat other = (Chat) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Chat{" + "id=" + id + ", idsUsuarios=" + idsUsuarios + ", idsvehiculos=" + mensajes + '}';
    }
    
    
}

