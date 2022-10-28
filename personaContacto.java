/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu;

/**
 *
 * @author pedro
 */
public class personaContacto {
    
    //Atributos
    
    public String nombres;
    public String apellidos; 
    public String numeroContacto; 
    public String direccionActual; 
    
    //Constructor
    
    public personaContacto(String name, String lastName, String phone, String direccion){
    
        this.nombres = name;
        this.apellidos = lastName;
        this.numeroContacto = phone;
        this.direccionActual = direccion; 
        
    }
    
}