/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

import java.util.Scanner;

public class Cuadrado {
    private int tamanoLado;
    
    public Cuadrado(int size) {
        tamanoLado = size;
    }
    
    public void Drawsquare(){
        System.out.println("Creando cuadrado " + tamanoLado);
        
        for(int i=0 ; i<tamanoLado;i++){
            if (i==0 || i==tamanoLado-1){
                imprimirLineaCompleta(tamanoLado); 
            }
            else{
                imprimirLineaVacia(tamanoLado);
            }
            System.out.println("\n");
        }
    }
    
    public static void imprimirLineaCompleta(int lado){
        for (int j=0; j<lado;j++){
            System.out.print("*");
        }
    }
    
    public static void imprimirLineaVacia(int lado){
        System.out.print("*");
        for(int j=0;j<lado-2;j++){
            System.out.print(" ");
        }
        System.out.print("*");
    }
    
    
}
