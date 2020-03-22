
package com.ladd.mensaje_app;

/**
 *
 * @author 5estrella
 */
public class Mensajes {
    int id_mensaje;
    String mensaje;
    String autor_mensaje;
    String feche_mensaje;
    
    public Mensajes(){
        
    }

    public Mensajes(String mensaje, String autor_mensaje, String feche_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.feche_mensaje = feche_mensaje;
    }
    

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFeche_mensaje() {
        return feche_mensaje;
    }

    public void setFeche_mensaje(String feche_mensaje) {
        this.feche_mensaje = feche_mensaje;
    }
    
}
