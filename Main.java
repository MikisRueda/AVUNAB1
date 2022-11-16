package edu;

import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){


        String repetir = "NO"; 
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("archivo.txt");
        
        //Scanner para la entrada de datos por consola
        Scanner entrada = new Scanner(System.in);
        
        //Creación de la listas para almacenar los clientes en los diferentes vuelos
        //Opciones de vuelo Bucaramanga-Bogotá
        List clientes_BB001 = new List(); 
        List clientes_BB002 = new List(); 
        
        //Opciones de vuelo Bogotá-Cúcuta
        List clientes_BC001 = new List(); 
        List clientes_BC002 = new List(); 
        
        //Generador número tiket
        
        int numTiket = 0; 
        
        //Generadores de puesto para cada vuelo
        
        int puesto_BB001 = 0;
        int puesto_BB002 = 0;
        int puesto_BC001 = 0;
        int puesto_BC002 = 0;
        
        //Creación de pasajeros por defecto: 
        
        //Vuelo 1
        
        cliente cliente1 = new cliente("Maria Fernanda", "Gonzales Carvajal", "CC", "Cll 1C #630 Paseo Galicia", "1005542142", "3174972375");
        personaContacto contactoCliente1 = new personaContacto("Julian Darío", "Gonzales Jiménez", "6556478", "Cra 78 #240 Palmera Real"); 
        tickete tiket1 = new tickete(String.valueOf(numTiket+1), "BB001", String.valueOf(puesto_BB001+1), "PREMIUM", 7000000, "Bogotá"); 
        numTiket++;
        puesto_BB001++;
        cliente1.addTiket(tiket1);
        cliente1.setContacto(contactoCliente1);
        clientes_BB001.add(cliente1);
        
        //Vuelo 2
        
        cliente cliente2 = new cliente("José Fernando", "Arevalo Rojas", "CC", "Cll 1C #430 Paseo Cataluña", "1004789635", "3224569875");
        personaContacto contactoCliente2 = new personaContacto("Camila Alejandra", "Ballesteros Quiyana", "6556899", "Cra 7 #4-28 Alcalá"); 
        tickete tiket2 = new tickete(String.valueOf(numTiket+1), "BB002", String.valueOf(puesto_BB002+1), "PREMIUM", 7000000, "Bogotá"); 
        numTiket++;
        puesto_BB002++;
        cliente2.addTiket(tiket2);
        cliente2.setContacto(contactoCliente2);
        clientes_BB002.add(cliente2);
        
        //Vuelo 3
        
        cliente cliente3 = new cliente("Emerson Antonio", "Rueda Rueda", "CC", "Cll 4C #220-845 Junín II", "1004785222", "3156487222");
        personaContacto contactoCliente3 = new personaContacto("Alfonso Eduardo", "Rueda Quintero", "6668965", "Cll 4C #220-845 Junín II"); 
        tickete tiket3 = new tickete(String.valueOf(numTiket+1), "BC001", String.valueOf(puesto_BC001+1), "PREMIUM", 7000000, "Cúcuta"); 
        numTiket++;
        puesto_BC001++;
        cliente3.addTiket(tiket3);
        cliente3.setContacto(contactoCliente3);
        clientes_BC001.add(cliente3);
        
        //Vuelo 4
        
        cliente cliente4 = new cliente("Valeria", "Carvajal Leal", "CC", "Cra 4 No. 670 Los Cisnes", "1002145699", "3124568999");
        personaContacto contactoCliente4 = new personaContacto("Miguel Henao", "Rogriguez Vazquez", "3214567822", "Cra 4 No. 670 Los Cisnes"); 
        tickete tiket4 = new tickete(String.valueOf(numTiket+1), "BC002", String.valueOf(puesto_BC002+1), "PREMIUM", 7000000, "Cúcuta"); 
        numTiket++;
        puesto_BC002++;
        cliente4.addTiket(tiket4);
        cliente4.setContacto(contactoCliente4);
        clientes_BC002.add(cliente4);        
        int tipoUsuario; 
        
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                do{
                    int opcion = Integer.parseInt(JOptionPane.showInputDialog("AV-UNAB \n  \n1- Ingresar al sistema \n2- Salír"));
                    switch(opcion){
                        case 1:
                        tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de ingreso: \n1- Cliente \n2- Trabajador"));
                        escribir = new FileWriter(archivo,true);
                        linea = new PrintWriter(escribir);
                        if(tipoUsuario == 1){
        
                            //TIPO USUARIO 1 = CLIENTE
            
                            String respuesta;
                            respuesta = JOptionPane.showInputDialog("Metodo de ingreso: Cliente \n- ¿Desea comprar un Ticket? Yes/No");
            
                            if(respuesta.toUpperCase().equals("YES")){

                                linea.println("- Nombre: Maria Fernanda");
                                linea.println("- Apellido: Gonzales Carvajal");
                                linea.println("- Tipo de identifiación: CC ");
                                linea.println("- Numero de identificación: 1005542142");
                                linea.println("- Numero de telefono: 3174972375");
                                linea.println("- Dirección: Cl 1C #630 Paseo Galicia");
                                linea.println("");
        
                                linea.println("- Nombre: José Fernando");
                                linea.println("- Apellido: Arevalo Rojas");
                                linea.println("- Tipo de identifiación: CC ");
                                linea.println("- Numero de identificación: 1004789635");
                                linea.println("- Numero de telefono: 3224569875");
                                linea.println("- Dirección: Cl 1C #430 Paseo Cataluña");
                                linea.println("");
        
                                linea.println("- Nombre: Emerson Antonio");
                                linea.println("- Apellido: Rueda Rueda");
                                linea.println("- Tipo de identifiación: CC ");
                                linea.println("- Numero de identificación: 1004785222");
                                linea.println("- Numero de telefono: 3156487222");
                                linea.println("- Dirección: Cl 4C #220-845 Junín II");
                                linea.println("");
        
                                linea.println("- Nombre: Valeria");
                                linea.println("- Apellido: Carvajal Leal");
                                linea.println("- Tipo de identifiación: CC ");
                                linea.println("- Numero de identificación: 1002145699");
                                linea.println("- Numero de telefono: 3124568999");
                                linea.println("- Dirección: Cra 4 No. 670 Los Cisnes");
                                linea.println("");
                                
                                //DATOS DEL CLIENTE
                                int numerosuma = 5;
                                JOptionPane.showMessageDialog(null, "Para comprar su tickete ingrese los siguientes datos personales.");
                                String nombre = JOptionPane.showInputDialog("1- Ingresa tu nombre");
                                linea.println("- Nombre: "+nombre);
                                String apellido = JOptionPane.showInputDialog("2- Ingresa tu apellido");
                                linea.println("- Apellido: "+apellido);
                                String tipoNit = JOptionPane.showInputDialog("3- Ingresa el tipo de NIT (CC/TI)");
                                linea.println("- Tipo de identificación: "+tipoNit);
                                String nit = JOptionPane.showInputDialog("4- Ingresa tu numero de identificación");
                                linea.println("- Numero de identificación: "+nit);
                                String telefono = JOptionPane.showInputDialog("5- Ingresa tu numero de telefono");
                                linea.println("- Telefono: "+telefono);
                                String direccion  = JOptionPane.showInputDialog("6- Ingresa tu dirección");
                                linea.println("- Dirección: "+direccion);
                                
                                //Se crea el cliente con los datos solicitados
                                cliente currentcliente = new cliente(nombre, apellido, tipoNit, nit, telefono, direccion);
                                
                                //DATOS DE LA PERSONA DE CONTACTO
                                JOptionPane.showMessageDialog(null, "Ahora ingresa los datos de la persona de contacto.");
                                String nombreContacto = JOptionPane.showInputDialog("1- Ingresa el nombre de la persona de contacto");
                                linea.println("- Nombre de la persona de contacto: "+nombreContacto); 
                                String apellidosContacto = JOptionPane.showInputDialog("2- Ingresa el apellido de la persona de contacto");
                                linea.println("- Apellido de la persona de contacto: "+apellidosContacto); 
                                String numeroContacto = JOptionPane.showInputDialog("3- Ingresa el numero de la persona de contacto.");
                                linea.println("- Telefono de la persona de contacto: "+numeroContacto); 
                                String direccionContacto = JOptionPane.showInputDialog("4- Ingrese la dirección de su persona de contacto");
                                linea.println("- Dirección de la persona de contacto: "+direccionContacto); 
                                
                                //Se crea la persona de contacto y se añade al cliente
                                
                                personaContacto currentClienteContacto = new personaContacto(nombreContacto, apellidosContacto, numeroContacto, direccionContacto); 
                                currentcliente.setContacto(currentClienteContacto); 
                             
                    
                                //DATOS DEL VUELO
                                String vuelo = JOptionPane.showInputDialog("Lista de vuelos disponibles \n1) Bucaramanga-Bogotá (SALIDA: 20/02 2:00pm - LLEGADA: 20/02 2:30pm)\n2) Bucaramanga-Bogotá (SALIDA: 20/02 2:45 pm - LLEGADA: 20/02 3:45pm)\n3) Bogotá-Cúcuta (SALIDA: 20/02 2:30 pm - LLEGADA: 20/02 3:00pm)\n4) Bogotá-Cúcuta (SALIDA: 20/02 3:00 pm - LLEGADA: 20/02 3:30pm)");
                                String destino = ""; 
                                int puesto = 1; 
                                int numeroTiket = 0; 
                                
                                switch(vuelo){
                                    
                                    case("1"):
                                        vuelo = "BB001"; 
                                        destino = "Bogotá";
                                        puesto_BB001++;
                                        puesto = puesto_BB001;
                                        numTiket++;
                                        numeroTiket = numTiket;
                                        linea.println("- Vuelo: Bucaramanga-Bogotá (SALIDA: 20/02 2:00pm - LLEGADA: 20/02 2:30pm)"); 
                                        break;
                                    case("2"):
                                        vuelo = "BB002";
                                        destino = "Bogotá";
                                        puesto_BB002++;
                                        puesto = puesto_BB002;
                                        numTiket++;
                                        numeroTiket = numTiket;
                                        linea.println("- Vuelo: Bucaramanga-Bogotá (SALIDA: 20/02 2:45 pm - LLEGADA: 20/02 3:45pm)"); 
                                        break; 
                                    case("3"):
                                        vuelo = "BC001";
                                        destino = "Cúcuta";
                                        puesto_BC001++;
                                        puesto = puesto_BC001;
                                        numTiket++;
                                        numeroTiket = numTiket;
                                        linea.println("- Vuelo: Bogotá-Cúcuta (SALIDA: 20/02 2:30 pm - LLEGADA: 20/02 3:00pm)"); 
                                        break;
                                    case("4"):
                                        vuelo = "BC002";
                                        destino = "Cúcuta";
                                        puesto_BC002++;
                                        puesto = puesto_BC002;
                                        numTiket++;
                                        numeroTiket = numTiket; 
                                        linea.println("- Vuelo: Bogotá-Cúcuta (SALIDA: 20/02 3:00 pm - LLEGADA: 20/02 3:30pm)"); 
                                        break; 
                                    default: 
                                        System.out.println("EL VUELO ESCOGIDO NO ES VÁLIDO");
                                            
                                }
                                
                                System.out.println("\nINGRESE SU TIPO DE VUELO: ");
                                System.out.println("1- PREMIUM ($7000000)");
                                System.out.println("2- EJECUTIVO ($300000)");
                                System.out.println("3- ECONÓMICO ($120000)");
                                String tipoVuelo = JOptionPane.showInputDialog("Lista de precios para esté vuelo\n1- Premium: $1'500.000\n2- Ejecutivo: $750.000\n3- Economico: $400.000");; 
                                int precio  = 0; 
                                
                                switch(tipoVuelo){
                                    
                                    case("1"):
                                        tipoVuelo = "PREMIUM"; 
                                        precio = 1500000;
                                        linea.println("- Clase de vuelo: Premium");
                                        break;
                                    case("2"):
                                        tipoVuelo = "EJECUTIVO"; 
                                        precio = 750000;
                                        linea.println("- Clase de vuelo: Ejecutivo");
                                        break; 
                                    case("3"):
                                        tipoVuelo = "ECONÓMICO"; 
                                        precio = 400000;
                                        linea.println("- Clase de vuelo: Económico");
                                        break;
                                    default: 
                                        JOptionPane.showMessageDialog(null, "Error, comando desconocido.");       
                                }
                                linea.println("");
                                escribir.close();
                                numerosuma++;
                                
                                //Se crea el Tiket y se agrega al cliente
                                
                                tickete currentClientTiket = new tickete(String.valueOf(numeroTiket), vuelo, String.valueOf(puesto), tipoVuelo, precio, destino);
                                currentcliente.addTiket(currentClientTiket); 
                                
                                //Agregar el cliente a la lista de su vuelo
                                
                                switch(vuelo){
                                    
                                case("BB001"):
                                        clientes_BB001.add(currentcliente);
                                        break;
                                case("BB002"):
                                        clientes_BB002.add(currentcliente);
                                        break;
                                case("BC001"):
                                        clientes_BC001.add(currentcliente);
                                        break;
                                case("BC002"):
                                        clientes_BC002.add(currentcliente);
                                        break;
                                        
                                }
                                
                                JOptionPane.showMessageDialog(null, "¡Tickete comprado!");
                            }
            
                        }else if(tipoUsuario == 2){
            
                            //TipoUsuario 2 = TRABAJADOR DE LA EMPRESA
            
                            String contraseña = ""; 
                            contraseña = JOptionPane.showInputDialog("Metodo de ingreso: Empleado \n- Ingrese la contraseña...");
        
                            if(contraseña.toUpperCase().equals("AVUNAB")){
            
                                //Si la contraseña ingresada es correcta
            
                                String selected = JOptionPane.showInputDialog("- AV-UNAB \n1) Consultar pasajeros \n2) Confirmar Abordaje");
                                
                                if(selected.equals("1")){

                                    String vueloSeleccionado = JOptionPane.showInputDialog("- Lista de vuelos \n1) Bucaramanga-Bogotá (BB_001) \n2) Bucaramanga-Bogotá (BB_002) \n3) Bogotá-Cúcuta (BC_001) \n4) Bogotá-Cúcuta (BC_002)");
                                
                                    switch(vueloSeleccionado){
                                    
                                        case("1"):
                                                clientes_BB001.listaPasajeros();
                                                break;
                                        case("2"):
                                                clientes_BB002.listaPasajeros();
                                                break;
                                        case("3"):
                                                clientes_BC001.listaPasajeros();
                                                break;
                                        case("4"):
                                                clientes_BC002.listaPasajeros();
                                                break;
            
                                    }
                                }else if(selected.equals("2")){
                                
                                    String vueloSeleccionado = JOptionPane.showInputDialog("- Lista de vuelos \n1) Bucaramanga-Bogotá (BB_001) \n2) Bucaramanga-Bogotá (BB_002) \n3) Bogotá-Cúcuta (BC_001) \n4) Bogotá-Cúcuta (BC_002)"); 
                                    
                                    switch(vueloSeleccionado){
                                    
                                        case("1"):
                                                clientes_BB001.chequearAbordaje();
                                                break;
                                        case("2"):
                                                clientes_BB002.chequearAbordaje();
                                                break;
                                        case("3"):
                                                clientes_BC001.chequearAbordaje();
                                                break;
                                        case("4"):
                                                clientes_BC002.chequearAbordaje();
                                                break;
            
                                    }
                                
                                }else{
                      
                                    JOptionPane.showMessageDialog(null,"Error, comando desconocido.");         
                                }
            
            
                            }else{
            
                                JOptionPane.showMessageDialog(null,"Error, contraseña incorrecta.");
            
                            }
                        }
                                //Pregutna para repetir el programa
                                repetir = JOptionPane.showInputDialog("¿Quieres realizar otra operación? Yes | No");
                                if(repetir == "NO"){
                                    JOptionPane.showMessageDialog(null,"Cerrando programa...");
                                    repetir = "NO";
                                    break;
                                }


                                case 2:
                                JOptionPane.showMessageDialog(null,"Cerrando programa...");
                                repetir = "NO";
                    }
                }while(repetir.toUpperCase().equals("YES"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try {
                do{
                    int opcion = Integer.parseInt(JOptionPane.showInputDialog("AV-UNAB \n ¿Qué quieres hacer? \n1- Ingresar al sistema \n2- Salír"));
                    switch(opcion){
                        case 1:
                        tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de ingreso: \n1- Cliente \n2- Trabajador"));
                        escribir = new FileWriter(archivo,true);
                        linea = new PrintWriter(escribir);
                        if(tipoUsuario == 1){
        
                            //TIPO USUARIO 1 = CLIENTE
            
                            String respuesta;
                            respuesta = JOptionPane.showInputDialog("Metodo de ingreso: Cliente \n- ¿Desea comprar un Ticket? Yes/No");
            
                            if(respuesta.toUpperCase().equals("YES")){

                                linea.println("- Nombre: Maria Fernanda");
                                linea.println("- Apellido: Gonzales Carvajal");
                                linea.println("- Tipo de identifiación: CC ");
                                linea.println("- Numero de identificación: 1005542142");
                                linea.println("- Numero de telefono: 3174972375");
                                linea.println("- Dirección: Cl 1C #630 Paseo Galicia");
                                linea.println("");
        
                                linea.println("- Nombre: José Fernando");
                                linea.println("- Apellido: Arevalo Rojas");
                                linea.println("- Tipo de identifiación: CC ");
                                linea.println("- Numero de identificación: 1004789635");
                                linea.println("- Numero de telefono: 3224569875");
                                linea.println("- Dirección: Cl 1C #430 Paseo Cataluña");
                                linea.println("");
        
                                linea.println("- Nombre: Emerson Antonio");
                                linea.println("- Apellido: Rueda Rueda");
                                linea.println("- Tipo de identifiación: CC ");
                                linea.println("- Numero de identificación: 1004785222");
                                linea.println("- Numero de telefono: 3156487222");
                                linea.println("- Dirección: Cl 4C #220-845 Junín II");
                                linea.println("");
        
                                linea.println("- Nombre: Valeria");
                                linea.println("- Apellido: Carvajal Leal");
                                linea.println("- Tipo de identifiación: CC ");
                                linea.println("- Numero de identificación: 1002145699");
                                linea.println("- Numero de telefono: 3124568999");
                                linea.println("- Dirección: Cra 4 No. 670 Los Cisnes");
                                linea.println("");
                                
                                //DATOS DEL CLIENTE
                                int numerosuma = 5;
                                JOptionPane.showMessageDialog(null, "Para comprar su tickete ingrese los siguientes datos personales.");
                                String nombre = JOptionPane.showInputDialog("1- Ingresa tu nombre");
                                linea.println("- Nombre: "+nombre);
                                String apellido = JOptionPane.showInputDialog("2- Ingresa tu apellido");
                                linea.println("- Apellido: "+apellido);
                                String tipoNit = JOptionPane.showInputDialog("3- Ingresa el tipo de NIT (CC/TI)");
                                linea.println("- Tipo de identificación: "+tipoNit);
                                String nit = JOptionPane.showInputDialog("4- Ingresa tu numero de identificación");
                                linea.println("- Numero de identificación: "+nit);
                                String telefono = JOptionPane.showInputDialog("5- Ingresa tu numero de telefono");
                                linea.println("- Telefono: "+telefono);
                                String direccion  = JOptionPane.showInputDialog("6- Ingresa tu dirección");
                                linea.println("- Dirección: "+direccion);
                                
                                //Se crea el cliente con los datos solicitados
                                cliente currentcliente = new cliente(nombre, apellido, tipoNit, nit, telefono, direccion);
                                
                                //DATOS DE LA PERSONA DE CONTACTO
                                JOptionPane.showMessageDialog(null, "Ahora ingresa los datos de la persona de contacto.");
                                String nombreContacto = JOptionPane.showInputDialog("1- Ingresa el nombre de la persona de contacto");
                                linea.println("- Nombre de la persona de contacto: "+nombreContacto); 
                                String apellidosContacto = JOptionPane.showInputDialog("2- Ingresa el apellido de la persona de contacto");
                                linea.println("- Apellido de la persona de contacto: "+apellidosContacto); 
                                String numeroContacto = JOptionPane.showInputDialog("3- Ingresa el numero de la persona de contacto.");
                                linea.println("- Telefono de la persona de contacto: "+numeroContacto); 
                                String direccionContacto = JOptionPane.showInputDialog("4- Ingrese la dirección de su persona de contacto");
                                linea.println("- Dirección de la persona de contacto: "+direccionContacto); 
                                
                                //Se crea la persona de contacto y se añade al cliente
                                
                                personaContacto currentClienteContacto = new personaContacto(nombreContacto, apellidosContacto, numeroContacto, direccionContacto); 
                                currentcliente.setContacto(currentClienteContacto); 
                             
                    
                                //DATOS DEL VUELO
                                String vuelo = JOptionPane.showInputDialog("Lista de vuelos disponibles \n1) Bucaramanga-Bogotá (SALIDA: 20/02 2:00pm - LLEGADA: 20/02 2:30pm)\n2) Bucaramanga-Bogotá (SALIDA: 20/02 2:45 pm - LLEGADA: 20/02 3:45pm)\n3) Bogotá-Cúcuta (SALIDA: 20/02 2:30 pm - LLEGADA: 20/02 3:00pm)\n4) Bogotá-Cúcuta (SALIDA: 20/02 3:00 pm - LLEGADA: 20/02 3:30pm)");
                                String destino = ""; 
                                int puesto = 1; 
                                int numeroTiket = 0; 
                                
                                switch(vuelo){
                                    
                                    case("1"):
                                        vuelo = "BB001"; 
                                        destino = "Bogotá";
                                        puesto_BB001++;
                                        puesto = puesto_BB001;
                                        numTiket++;
                                        numeroTiket = numTiket;
                                        linea.println("- Vuelo: Bucaramanga-Bogotá (SALIDA: 20/02 2:00pm - LLEGADA: 20/02 2:30pm)"); 
                                        break;
                                    case("2"):
                                        vuelo = "BB002";
                                        destino = "Bogotá";
                                        puesto_BB002++;
                                        puesto = puesto_BB002;
                                        numTiket++;
                                        numeroTiket = numTiket;
                                        linea.println("- Vuelo: Bucaramanga-Bogotá (SALIDA: 20/02 2:45 pm - LLEGADA: 20/02 3:45pm)"); 
                                        break; 
                                    case("3"):
                                        vuelo = "BC001";
                                        destino = "Cúcuta";
                                        puesto_BC001++;
                                        puesto = puesto_BC001;
                                        numTiket++;
                                        numeroTiket = numTiket;
                                        linea.println("- Vuelo: Bogotá-Cúcuta (SALIDA: 20/02 2:30 pm - LLEGADA: 20/02 3:00pm)"); 
                                        break;
                                    case("4"):
                                        vuelo = "BC002";
                                        destino = "Cúcuta";
                                        puesto_BC002++;
                                        puesto = puesto_BC002;
                                        numTiket++;
                                        numeroTiket = numTiket; 
                                        linea.println("- Vuelo: Bogotá-Cúcuta (SALIDA: 20/02 3:00 pm - LLEGADA: 20/02 3:30pm)"); 
                                        break; 
                                    default: 
                                        System.out.println("EL VUELO ESCOGIDO NO ES VÁLIDO");
                                            
                                }
                                
                                System.out.println("\nINGRESE SU TIPO DE VUELO: ");
                                System.out.println("1- PREMIUM ($7000000)");
                                System.out.println("2- EJECUTIVO ($300000)");
                                System.out.println("3- ECONÓMICO ($120000)");
                                String tipoVuelo = JOptionPane.showInputDialog("Lista de precios para esté vuelo\n1- Premium: $1'500.000\n2- Ejecutivo: $750.000\n3- Economico: $400.000");; 
                                int precio  = 0; 
                                
                                switch(tipoVuelo){
                                    
                                    case("1"):
                                        tipoVuelo = "PREMIUM"; 
                                        precio = 1500000;
                                        linea.println("- Clase de vuelo: Premium");
                                        break;
                                    case("2"):
                                        tipoVuelo = "EJECUTIVO"; 
                                        precio = 750000;
                                        linea.println("- Clase de vuelo: Ejecutivo");
                                        break; 
                                    case("3"):
                                        tipoVuelo = "ECONÓMICO"; 
                                        precio = 400000;
                                        linea.println("- Clase de vuelo: Económico");
                                        break;
                                    default: 
                                        JOptionPane.showMessageDialog(null, "Error, comando desconocido.");       
                                }
                                linea.println("");
                                escribir.close();
                                numerosuma++;
                                
                                //Se crea el Tiket y se agrega al cliente
                                
                                tickete currentClientTiket = new tickete(String.valueOf(numeroTiket), vuelo, String.valueOf(puesto), tipoVuelo, precio, destino);
                                currentcliente.addTiket(currentClientTiket); 
                                
                                //Agregar el cliente a la lista de su vuelo
                                
                                switch(vuelo){
                                    
                                case("BB001"):
                                        clientes_BB001.add(currentcliente);
                                        break;
                                case("BB002"):
                                        clientes_BB002.add(currentcliente);
                                        break;
                                case("BC001"):
                                        clientes_BC001.add(currentcliente);
                                        break;
                                case("BC002"):
                                        clientes_BC002.add(currentcliente);
                                        break;
                                        
                                }
                                
                                JOptionPane.showMessageDialog(null, "¡Tickete comprado!");
                            }
            
                        }else if(tipoUsuario == 2){
            
                            //TipoUsuario 2 = TRABAJADOR DE LA EMPRESA
            
                            String contraseña = ""; 
                            contraseña = JOptionPane.showInputDialog("Metodo de ingreso: Empleado \n- Ingrese la contraseña...");
        
                            if(contraseña.toUpperCase().equals("AVUNAB")){
            
                                //Si la contraseña ingresada es correcta
            
                                String selected = JOptionPane.showInputDialog("- AV-UNAB \n1) Consultar pasajeros \n2) Confirmar Abordaje");
                                
                                if(selected.equals("1")){

                                    String vueloSeleccionado = JOptionPane.showInputDialog("- Lista de vuelos \n1) Bucaramanga-Bogotá (BB_001) \n2) Bucaramanga-Bogotá (BB_002) \n3) Bogotá-Cúcuta (BC_001) \n4) Bogotá-Cúcuta (BC_002)");
                                
                                    switch(vueloSeleccionado){
                                    
                                        case("1"):
                                                clientes_BB001.listaPasajeros();
                                                break;
                                        case("2"):
                                                clientes_BB002.listaPasajeros();
                                                break;
                                        case("3"):
                                                clientes_BC001.listaPasajeros();
                                                break;
                                        case("4"):
                                                clientes_BC002.listaPasajeros();
                                                break;
            
                                    }
                                }else if(selected.equals("2")){
                                
                                    String vueloSeleccionado = JOptionPane.showInputDialog("- Lista de vuelos \n1) Bucaramanga-Bogotá (BB_001) \n2) Bucaramanga-Bogotá (BB_002) \n3) Bogotá-Cúcuta (BC_001) \n4) Bogotá-Cúcuta (BC_002)"); 
                                    
                                    switch(vueloSeleccionado){
                                    
                                        case("1"):
                                                clientes_BB001.chequearAbordaje();
                                                break;
                                        case("2"):
                                                clientes_BB002.chequearAbordaje();
                                                break;
                                        case("3"):
                                                clientes_BC001.chequearAbordaje();
                                                break;
                                        case("4"):
                                                clientes_BC002.chequearAbordaje();
                                                break;
            
                                    }
                                
                                }else{
                      
                                    JOptionPane.showMessageDialog(null,"Error, comando desconocido.");         
                                }
            
            
                            }else{
            
                                JOptionPane.showMessageDialog(null,"Error, contraseña incorrecta.");
            
                            }
                        }
                                //Pregutna para repetir el programa
                                repetir = JOptionPane.showInputDialog("¿Quieres realizar otra operación? Yes | No");
                                break;


                                case 2:
                                JOptionPane.showMessageDialog(null,"Cerrando programa...");
                                repetir = "NO";
                                break;
                    }
                }while(repetir.toUpperCase().equals("YES"));
            } catch (IOException e) {
                e.printStackTrace();
            } 
        }
    }
}