package edu;
import java.io.Serializable;

public class personaContacto implements Serializable{
    
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