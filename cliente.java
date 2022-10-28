package edu;

public class cliente {

    public String nombre_cliente;
    public String apellido_cliente;
    public String tipo_identificacion;
    public String numeroTelefono_cliente;
    public String direccion_cliente;
    public String numeroIdentificacion_cliente;
    public tickete tiket; 
    public personaContacto contacto;
    public String abordaje; 

    
    //Constructores
    
    public cliente(){
    
        this.nombre_cliente = ""; 
        this.apellido_cliente = "";
        this.tipo_identificacion = "";
        this.numeroTelefono_cliente = "";
        this.direccion_cliente = "";
        this.numeroIdentificacion_cliente = "";
        this.tiket = null; 
        this.contacto = null; 
        this.abordaje = "-";  
    
    }
    
    public cliente(String nombre_cliente, String apellido_cliente, String tipo_identificacion, String direccion_cliente, String numeroIdentificacion_cliente, String numeroTelefono_cliente){
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.tipo_identificacion = tipo_identificacion;
        this.numeroTelefono_cliente = numeroTelefono_cliente;
        this.direccion_cliente = direccion_cliente;
        this.numeroIdentificacion_cliente = numeroIdentificacion_cliente;
        this.tiket = null; 
        this.contacto = null; 
        this.abordaje = "-";
    } 
    
    //Método para agregar el tiket
    
    public void addTiket(tickete tiket){
    
        this.tiket = tiket;
    
    }
    
    //Método para añadir la persona de contacto
    
    public void setContacto(personaContacto person){
    
        this.contacto = person; 
    
    }
}