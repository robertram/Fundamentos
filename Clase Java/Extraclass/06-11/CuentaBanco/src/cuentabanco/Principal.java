/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentabanco;

import cuentabanco.Cuenta;
import java.util.Scanner;
/*Construya una clase Cuenta con 2 metodos 
Debitar
Acreditar
Los metodos deben aceptar una parametro, monto y devolver el dinero total despues de la operacion.
El programa principal(main) debe solicitar la informacion y enviarsela a cuenta para realizar las operaciones.*/
public class Principal {
    public static void main(String[] args) {
        int cuenta=50;
        String decisión;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la acción. D para debito, C para Crédito y S para salir.");
        decisión= scanner.next();
        
        while (decisión.compareTo("s")!=0){
            if (decisión.compareTo("d")==0){
                Cuenta debit= new Cuenta();
                debit.Debitar(decisión);
            }
            else if (decisión.compareTo("c")==0){
                Cuenta credit= new Cuenta();
                credit.Acreditar(decisión);
            }
        System.out.println("Introduzca la acción");
        decisión= scanner.next();
        }
        System.out.println("Su cuenta tiene: $"+cuenta);
    }
}
