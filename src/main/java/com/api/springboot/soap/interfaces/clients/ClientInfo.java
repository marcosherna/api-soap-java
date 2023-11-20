 
package com.api.springboot.soap.interfaces.clients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientInfo", propOrder = {
    "id",
    "nombre",
    "apellido",
    "direccion",
    "telefono",
    "email",
    "password",
    "fecha_nacimiento"
})
public class ClientInfo {

    protected int id;

    @XmlElement(required = true)
    protected String nombre;

    @XmlElement(required = true)
    protected String apellido;

    @XmlElement(required = true)
    protected String direccion;

    @XmlElement(required = true)
    protected String telefono;

    @XmlElement(required = true)
    protected String email;

    @XmlElement(required = true)
    protected String password;

    @XmlElement(required = true)
    protected String fecha_nacimiento;
 
    public int getId() { return this.id; }
    public void setId(int id) { 
        this.id = id; 
    }

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getApellido() { return this.apellido; }
    public void setApellido(String apellido) { 
        this.apellido = apellido; 
    }

    public String getDireccion() { return this.direccion; }
    public void setDireccion(String direccion) { 
        this.direccion = direccion; 
    }

    public String getTelefono() { return this.telefono; }
    public void setTelefono(String telefono) { 
        this.telefono = telefono; 
    }

    public String getEmail() { return this.email; }
    public void setEmail(String email) { 
        this.email = email; 
    }
 
    public String getPassword() { return this.password; }
    public void setPassword(String password) { 
        this.password = password; 
    }

    public String getFecha_nacimiento() { return this.fecha_nacimiento; }
    public void setFecha_nacimiento(String fecha_nacimiento) { 
        this.fecha_nacimiento = fecha_nacimiento; 
    }
 
}
