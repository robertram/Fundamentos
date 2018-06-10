/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd.and.even;

import java.util.Scanner;

public class OddAndEven {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero");
        numero=entrada.nextInt();
        
        if (numero%2==0){
            System.out.println("El numero "+numero+" es par");
            }
        else {
            System.out.println("El numero "+numero+" es impar");
        }
        
    }
        
}
    

