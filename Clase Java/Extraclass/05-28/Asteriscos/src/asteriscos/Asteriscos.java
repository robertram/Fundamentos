/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteriscos;

import java.util.Scanner;

public class Asteriscos {

    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("Pulse 1");
        int choice = num.nextInt();
        
        if (choice==1){
            System.out.println("*********");
            System.out.println("*       *");
            System.out.println("*       *");
            System.out.println("*********");
        }
        
    }
    
}
