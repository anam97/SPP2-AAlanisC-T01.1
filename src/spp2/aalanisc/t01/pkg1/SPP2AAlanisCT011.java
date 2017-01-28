/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aalanisc.t01.pkg1;
import java.util.Scanner ;
/**
 *
 * @author anamartha
 */
public class SPP2AAlanisCT011 {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables
        double b , a , per , sup ; 
        // b= base , a= altura , per = perimetro , sup= superficie
        
        Scanner T = new Scanner (System.in);
        
        System.out.println("Introduce la medida de la base ");
        b = T.nextDouble();
        System.out.println("Introduce la medida de la altura");
        a = T.nextDouble() ;
        
        //Realizar operacion
        sup = b * a ;
        per = (b * 2) + (a * 2);
        
        // Dar resultados
        System.out.println("La superficie  del rectangulo es " + sup);
        System.out.println("El perimentro del rectangulo es " + per);
                
    }
    
}
