/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulasgeometricas;

import java.util.Scanner;

public class Menus {
    
    public void menu1(){
        System.out.println("*Menu*");
        System.out.println("1-Calcular Área");
        System.out.println("2-Calcular Perímetro");
        System.out.println("3-Salir");
    }
    public int decision(){
        Scanner scanner = new Scanner(System.in);
        int accion = scanner.nextInt();
        return accion;
    }
    public void menufiguras(){
        System.out.println("*Menu figuras*");
        System.out.println("1-Cuadrado");
        System.out.println("2-Rectángulo");
        System.out.println("3-Círculo");
        System.out.println("4-Triángulo Equilátero");
        System.out.println("5-Triángulo Isóceles");
        System.out.println("6-Pentagono Regular");
        System.out.println("Escoja una opción");
    }
    
}
