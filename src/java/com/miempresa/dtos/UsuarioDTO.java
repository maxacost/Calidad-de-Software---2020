/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miempresa.dtos;

/**
 *
 * @author Alumno
 */
public class UsuarioDTO {
    
    private int id;
    private String correo;
    private String clave;
    private String pin;
    private String respuesta;

    public UsuarioDTO(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public UsuarioDTO(int id, String correo, String clave, String pin, String respuesta) {
        this.id = id;
        this.correo = correo;
        this.clave = clave;
        this.pin = pin;
        this.respuesta = respuesta;
    }
    
    
    
    public UsuarioDTO(String correo, String clave, String pin,String respuesta){
    this.correo = correo;
    this.clave = clave;
    this.pin = pin;
    this.respuesta = respuesta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta (String respuesta) {
        this.respuesta = respuesta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
