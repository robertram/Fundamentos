/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulasgeometricas;

import java.util.Scanner;

public class Triangulo_isoceles {
    public void areaisoceles(int base, int altura){
        System.out.println("La fórmula del área del Triángulo isóceles es: ");
        System.out.println("(base * altura) / 2");//************************************
        }
    public void perimetroisoceles(int lados){
        System.out.println("La fórmula del perímetro del Triángulo isóceles es: ");
        System.out.println("(2 * lado) + base");
    }
    public int tamaño_lados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del lado");
        int lados = scanner.nextInt();
        return lados;
    }
    public int base(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el tamaño de la base");
        int base = scanner.nextInt();
        return base;
    }
    public int altura(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el tamaño de la altura");
        int altura= scanner.nextInt();
        return altura;
    }
}
