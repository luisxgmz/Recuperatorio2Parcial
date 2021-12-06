package com.example.recu2.Dto;

import java.util.Set;

public class ApplicantDto {
    private String correo;
    private String contrasena;
    private String nombre;
    private String apellido;

    public ApplicantDto(){
    }
    public ApplicantDto(String email, String password, String name) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }





}



