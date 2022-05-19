/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author arturo
 */
public class Mensaje {
    private ObjectId id;
    private ObjectId idUsuarioEmisor;
    private ObjectId idChat;
    private String contenido;
    private Date FechaDeEnvio;
    private List<ObjectId> idsUsuarios;

    public Mensaje() {
    }

    public Mensaje(ObjectId id) {
        this.id = id;
    }

    public Mensaje(ObjectId idUsuarioEmisor, String contenido, Date FechaDeEnvio, List<ObjectId> idsUsuarios) {
        this.id = id;
        this.contenido = contenido;
        this.FechaDeEnvio = FechaDeEnvio;
        this.idsUsuarios = idsUsuarios;
    }

    public Mensaje(ObjectId id, ObjectId idUsuarioEmisor, String contenido, Date FechaDeEnvio, List<ObjectId> idsUsuarios) {
        this.id = id;
        this.idUsuarioEmisor = idUsuarioEmisor;
        this.contenido = contenido;
        this.FechaDeEnvio = FechaDeEnvio;
        this.idsUsuarios = idsUsuarios;
    }

    public Mensaje(ObjectId idUsuarioEmisor, ObjectId idChat, String contenido, Date FechaDeEnvio) {
        this.idChat = idChat;
        this.idUsuarioEmisor = idUsuarioEmisor;
        this.contenido = contenido;
        this.FechaDeEnvio = FechaDeEnvio;
    }
    

    public ObjectId getIdUsuarioEmisor() {
        return idUsuarioEmisor;
    }

    public void setIdUsuarioEmisor(ObjectId idUsuarioEmisor) {
        this.idUsuarioEmisor = idUsuarioEmisor;
    }
   
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaDeEnvio() {
        return FechaDeEnvio;
    }

    public void setFechaDeEnvio(Date FechaDeEnvio) {
        this.FechaDeEnvio = FechaDeEnvio;
    }

    public List<ObjectId> getIdsUsuarios() {
        return idsUsuarios;
    }

    public void setIdsUsuarios(List<ObjectId> idsUsuarios) {
        this.idsUsuarios = idsUsuarios;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.contenido);
        hash = 67 * hash + Objects.hashCode(this.FechaDeEnvio);
        hash = 67 * hash + Objects.hashCode(this.idsUsuarios);
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
        final Mensaje other = (Mensaje) obj;
        if (!Objects.equals(this.contenido, other.contenido)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.FechaDeEnvio, other.FechaDeEnvio)) {
            return false;
        }
        if (!Objects.equals(this.idsUsuarios, other.idsUsuarios)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return contenido;
    }
}
