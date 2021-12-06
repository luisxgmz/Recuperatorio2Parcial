package com.example.recu2.model;

import org.springframework.data.annotation.Id;


public class UsuarioModel {
    @Id

    private long id;
    private String name;
    private String apellido;
    private  String dni;
    private String correo;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(Correo correo) {
        this.correo = correo;
    }
}


