
import canal.canal;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner (System.in); 
       canal vc = new canal ();
       vc.isEncendido();
        // VERIFICAMOS SI LA TELE ESTA ENCENDIDA 
            if(!vc.isEncendido()){
            vc.prender();   //Lo arrancamos
                System.out.println("Esta encendido");
    }
            vc.cambiarcanal();
            System.out.println("Tu canal es " + vc.getCanal());
    
       
       
       
       
       
       
       
    }
    
}
