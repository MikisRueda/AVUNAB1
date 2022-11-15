package edu;
import java.io.Serializable;

public class tickete implements Serializable {

    //Atibutos
    
    public String numeroTiket; 
    public String idVuelo; 
    public String puesto; 
    public String categoria; 
    public int valor; 
    public String destino; 
    
    //Constructor
    
    public tickete(String number,String id, String puestoAsignado, String category, int price, String destino ){
    
        this.numeroTiket = number;
        this.idVuelo = id; 
        this.puesto = puestoAsignado; 
        this.categoria = category; 
        this.valor = price; 
        this.destino = destino; 
    }
    
}