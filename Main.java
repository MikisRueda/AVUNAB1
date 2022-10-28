package edu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String repetir = "NO"; 
        
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
        
        do{
            System.out.println("");
            System.out.println("- Bienvenido al areopuerto AV-UNAB -");
            System.out.println("- Seleccione el tipo de ingreso | 1) Cliente | 2) Trabajador");
            tipoUsuario = entrada.nextInt();

            if(tipoUsuario == 1){

                //TIPO USUARIO 1 = CLIENTE

                String respuesta;
                System.out.println("- Tipo de usuario seleccionado: Cliente");
                System.out.println("- ¿Deseas comprar un Ticket? ( YES | NO ) ");
                respuesta = entrada.next();

                if(respuesta.toUpperCase().equals("YES")){
                    
                    //DATOS DEL CLIENTE
                    
                    System.out.println("- Para continuar con la compra del Ticket ingresa los siguientes datos: ");

                    entrada.nextLine();

                    System.out.println("- Ingrese su nombre:");
                    String nombre = entrada.nextLine();
                    System.out.println("- Ingrese su apellido:");
                    String apellido = entrada.nextLine();
                    System.out.println("- Ingrese el tipo de identificación ( CC | TI) :");
                    String tipoNit = entrada.nextLine();
                    System.out.println("- Ingrese su número de identificación :");
                    String nit = entrada.nextLine();
                    System.out.println("- Ingrese su numero de telefono :");
                    String telefono = entrada.next();
                    entrada.nextLine();
                    System.out.println("- Ingrese su direccion :");
                    String direccion  = entrada.nextLine();

                    //Se crea el cliente con los datos solicitados
                    cliente currentcliente = new cliente(nombre, apellido, tipoNit, nit, telefono, direccion);
                    
                    //DATOS DE LA PERSONA DE CONTACTO
                    System.out.println("\n- Datos de la persona de contacto: ");
                    System.out.println("- Ingrese el nombre de su persona de contacto:");
                    String nombreContacto = entrada.nextLine(); 
                    System.out.println("- Ingrese los apellidos de su persona de contacto:");
                    String apellidosContacto = entrada.nextLine(); 
                    System.out.println("- Ingrese el número de teléfono de su persona de contacto: ");
                    String numeroContacto = entrada.next(); 
                    entrada.nextLine(); 
                    System.out.println("- Ingrese la dirección de su persona de contacto: ");
                    String direccionContacto = entrada.nextLine(); 
                    
                    //Se crea la persona de contacto y se añade al cliente
                    
                    personaContacto currentClienteContacto = new personaContacto(nombreContacto, apellidosContacto, numeroContacto, direccionContacto); 
                    currentcliente.setContacto(currentClienteContacto); 
                 
        
                    //DATOS DEL VUELO
                    
                    System.out.println("\n- Seleccione qué vuelo desea tomar: ");
                    System.out.println("- 1) Bucaramanga-Bogotá (SALIDA: 20/02 2:00pm - LLEGADA: 20/02 2:30pm)");
                    System.out.println("- 2) Bucaramanga-Bogotá (SALIDA: 20/02 2:45 pm - LLEGADA: 20/02 3:45pm)");
                    System.out.println("- 3) Bogotá-Cúcuta (SALIDA: 20/02 2:30 pm - LLEGADA: 20/02 3:00pm)");
                    System.out.println("- 4) Bogotá-Cúcuta (SALIDA: 20/02 3:00 pm - LLEGADA: 20/02 3:30pm)");
                    
                    String vuelo = entrada.next(); 
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
                            break;
                        case("2"):
                            vuelo = "BB002";
                            destino = "Bogotá";
                            puesto_BB002++;
                            puesto = puesto_BB002;
                            numTiket++;
                            numeroTiket = numTiket; 
                            break; 
                        case("3"):
                            vuelo = "BC001";
                            destino = "Cúcuta";
                            puesto_BC001++;
                            puesto = puesto_BC001;
                            numTiket++;
                            numeroTiket = numTiket; 
                            break;
                        case("4"):
                            vuelo = "BC002";
                            destino = "Cúcuta";
                            puesto_BC002++;
                            puesto = puesto_BC002;
                            numTiket++;
                            numeroTiket = numTiket; 
                            
                            break; 
                        default: 
                            System.out.println("EL VUELO ESCOGIDO NO ES VÁLIDO");
                                
                    }
                    
                    System.out.println("\nINGRESE SU TIPO DE VUELO: ");
                    System.out.println("1- PREMIUM ($7000000)");
                    System.out.println("2- EJECUTIVO ($300000)");
                    System.out.println("3- ECONÓMICO ($120000)");
                    String tipoVuelo = entrada.next(); 
                    int precio  = 0; 
                    
                    switch(tipoVuelo){
                        
                        case("1"):
                            tipoVuelo = "PREMIUM"; 
                            precio = 7000000;
                            break;
                        case("2"):
                            tipoVuelo = "EJECUTIVO"; 
                            precio = 300000;
                            break; 
                        case("3"):
                            tipoVuelo = "ECONÓMICO"; 
                            precio = 120000;
                            break;
                        default: 
                            System.out.println("¡ERROR, EL TIPO DE VUELO ESCOGIDO NO ES VÁLIDO!");
                                
                    }
                    
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
                    
                    System.out.println("TICKET COMPRADO CON ¡ÉXITO!");
                }

            }else if(tipoUsuario == 2){

                //TipoUsuario 2 = TRABAJADOR DE LA EMPRESA

                String contraseña = ""; 
                System.out.println("- Tipo de Usuario seleccionado: Trabajador");
                System.out.println("- Ingresa la contraseña para acceder al sistema");
                contraseña = entrada.next(); 

                int opcion; 

                if(contraseña.toUpperCase().equals("AVUPB")){

                    //Si la contraseña ingresada es correcta

                    System.out.println("- Sistema de AV-UNAB -");
                    System.out.println("- ¿Qué desea hacer?\n - 1) Consultar pasajeros de un vuelo, \n- 2) Verificar abordaje de un vuelo");
                    String selected = entrada.next(); 
                    
                    if(selected.equals("1")){
                        
                        System.out.println("- ¿Cuál vuelo deseas consultar?");
                        System.out.println("- 1) Bucaramanga-Bogotá (BB_001)"); 
                        System.out.println("- 2) Bucaramanga-Bogotá (BB_002)"); 
                        System.out.println("- 3) Bogotá-Cúcuta (BC_001)"); 
                        System.out.println("- 4) Bogotá-Cúcuta (BC_002)"); 
                        String vueloSeleccionado = entrada.next(); 
                        
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
                    
                        System.out.println("- ¿Cuál vuelo confirmara abordaje?");
                        System.out.println("- 1) Bucaramanga-Bogotá (BB_001)"); 
                        System.out.println("- 2) Bucaramanga-Bogotá (BB_002)"); 
                        System.out.println("- 3) Bogotá-Cúcuta (BC_001)"); 
                        System.out.println("- 4) Bogotá-Cúcuta (BC_002)"); 
                        String vueloSeleccionado = entrada.next(); 
                        
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
                    
                        System.out.println("¡ERROR - OPCIÓN INVALIDA!"); 
                    
                    }


                }else{

                    System.out.println("¡ERROR - CONTRASEÑA INCORRECTA!");

                }
            }
            
            //Pregutna para repetir el programa
            System.out.println("¿Deseas realizar otra acción? | (YES | NO)");
            repetir = entrada.next(); 
        
        }while(repetir.toUpperCase().equals("YES"));

    }
    
}