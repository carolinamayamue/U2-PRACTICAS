/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canal;

/**
 *
 * @author temporal2
 */
public class canal {
    // Agregamos metodos
    private boolean encendido;
    private int canal; 
    private int volumen;

    public canal() {
    encendido= false;
    volumen= 0;
    canal = 1;

} 
    public canal(boolean encendido, int canal, int volumen) {
        encendido = false;
        canal = 1;
        volumen = 0;
    }
    
    
    
    public void prender(){
        encendido = true;
    }
    
    public void apagar(){
        encendido = false;
    }
    
    
    public void cambiarcanal (){
    canal = canal+1;
    }
    public void sumarvolumen(){
    volumen = volumen+1;
    }

    
    
    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    
    
    //Ahora viene lo bueno xd
    public int  cambiarcanal (int canal ){
        System.out.println("Quieres cambiar de canal 1.- si 2.- no");
        if(canal!=1){
        cambiarcanal();
    
    
}
    return canal;
}
}
