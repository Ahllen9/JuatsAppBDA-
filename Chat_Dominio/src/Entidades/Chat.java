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
    private List<Mensaje> mensajes;
    private Usuario usuarioEmisor;
    private Usuario usuarioReceptor;
    private String nombre;

    public Chat() {
    }

    public Chat(ObjectId id, Usuario usuarioEmisor, Usuario usuarioReceptor, List<Mensaje> mensajes) {
        this.id = id;
        this.mensajes = mensajes;
        this.usuarioEmisor = usuarioEmisor;
        this.usuarioReceptor = usuarioReceptor;
    }

    public Chat(String nombre, Usuario usuarioEmisor, Usuario usuarioReceptor) {
        this.nombre = nombre;
        this.usuarioEmisor = usuarioEmisor;
        this.usuarioReceptor = usuarioReceptor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public Usuario getUsuarioEmisor() {
        return usuarioEmisor;
    }

    public void setUsuarioEmisor(Usuario usuarioEmisor) {
        this.usuarioEmisor = usuarioEmisor;
    }

    public Usuario getUsuarioReceptor() {
        return usuarioReceptor;
    }

    public void setUsuarioReceptor(Usuario usuarioReceptor) {
        this.usuarioReceptor = usuarioReceptor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        return "Chat{" + "id=" + id + ", mensajes=" + mensajes + ", usuarioEmisor=" + usuarioEmisor + ", usuarioReceptor=" + usuarioReceptor + ", nombre=" + nombre + '}';
    }
   
}

