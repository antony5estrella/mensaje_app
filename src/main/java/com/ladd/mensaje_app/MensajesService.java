
package com.ladd.mensaje_app;

import java.util.Scanner;

/**
 *
 * @author 5estrella
 */
public class MensajesService {
   
    public static void crearMensaje(){
      Scanner sc = new Scanner(System.in);  
      System.out.println("escribe tu mensaje");
      String mensaje =sc.nextLine();
      
      System.out.println("tu nombre");
      String nombre = sc.nextLine();
      
      Mensajes registro =new Mensajes();
      registro.setMensaje(mensaje);
      registro.setAutor_mensaje(nombre);
      MensajesDAO.crearMensajeBD(registro);
    }
    public static void listarMensaje(){
        MensajesDAO.leerMensajeBD();
        
    } 
    public static void borrarMensaje(){
        
    }
    public static void editarMensaje(){
        
    }
}