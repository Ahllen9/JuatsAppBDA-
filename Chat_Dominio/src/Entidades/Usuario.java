/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author arturo
 */
public class Usuario {
    private ObjectId id;
    private String password;
    private String email;
    private String nombre;
    private String sexo;
    private int  edad;

    public Usuario() {
    }
    
    public Usuario(ObjectId id,String nombre,String sexo, String email,String password,int edad) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public Usuario(String nombre,String sexo, String email,String password,int edad) {
        this.password = password;
        this.email = email;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", password=" + password + ", email=" + email + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
}
