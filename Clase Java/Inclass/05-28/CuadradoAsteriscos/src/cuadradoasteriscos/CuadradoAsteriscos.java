
package cuadradoasteriscos;

import java.util.Scanner;


public class CuadradoAsteriscos {
    
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
    
    public static void main(String[] args) {
        Scanner scann = new Scanner (System.in);
        System.out.print("De cuantos asteriscos desea el cuadrado?");
        int size = scann.nextInt();
        
        for(int i=0 ; i<size;i++){
            if (i==0 || i==size-1){
                imprimirLineaCompleta(size); 
            }
            else{
                imprimirLineaVacia(size);
            }
            System.out.println("\n");
        }
        
    }
    
}
