/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numaleatorio;

import java.util.Random;
import java.util.Scanner;

public class Numaleatorio {

    public static void main(String[] args) {
        
        Random aleatorio = new Random(System.currentTimeMillis());
        int intAleatorio = aleatorio.nextInt(100);
        //System.out.println(intAleatorio);
        Scanner scanner = new Scanner(System.in);//Ya esta declarado una vez 
        System.out.println("Ingrese un número: ");
        int number = scanner.nextInt();//Para usarlo de nuevo solo se pone:
        
        while (intAleatorio!=number){
        if (number>intAleatorio){
            System.out.println("El número que introdujo es mayor al que desea adivinar");
            System.out.println("Ingrese un número: ");
            number = scanner.nextInt();//Esto, sin el int porque la variable ya esta definida
            }
        if (number<intAleatorio){
            System.out.println("El número que introdujo es menor al que desea adivinar");
            System.out.println("Ingrese un número: ");
            number = scanner.nextInt();//Esto, sin el int porque la variable ya esta definida
            }
        if (number==intAleatorio){
            System.out.println("Adivinaste el número!");
            System.out.println("*Fin del programa*");
            break;
            }
        
        }
        
    }
    
}
