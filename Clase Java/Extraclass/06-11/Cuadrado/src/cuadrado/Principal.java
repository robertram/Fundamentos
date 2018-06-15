/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner scann = new Scanner (System.in);
        System.out.print("De cuantos asteriscos desea el cuadrado?");
        int size = scann.nextInt();
        
        
        Cuadrado square= new Cuadrado(5);
        square.Drawsquare();
        
        Cuadrado square2 = new Cuadrado(15);
        square2.Drawsquare();
        
        Cuadrado square3 = new Cuadrado(size);
        square3.Drawsquare();
        
    }
    
}
