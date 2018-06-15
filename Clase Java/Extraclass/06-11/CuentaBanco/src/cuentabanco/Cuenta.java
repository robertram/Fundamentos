/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabanco;

import java.util.Scanner;

public class Cuenta {
    int cuenta=50;
    String decisión;
    
    public void Debitar(String decision){
        System.out.println("Introduzca el monto a debitar:");
        int monto=scanner.nextInt();
                
        int remanente= cuenta-monto;
        if (remanente>=0){
            cuenta= cuenta-monto;
            System.out.println("Debito listo, el monto actual de su cuenta es: $"+cuenta);
        }
        else {
            System.out.println("No tiene fondos suficientes. Sólo tiene: $"+cuenta);
        }  
    }
    
    public void Acreditar(String decision){
        System.out.println("Introduzca el monto a acreditar:");
        int monto= scanner.nextInt();
        cuenta= cuenta+monto;
        System.out.println("Crédito listo! Quedan: $"+cuenta);
    }

    private static class scanner {

        public scanner() {
        }
    }
}

