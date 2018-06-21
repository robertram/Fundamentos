/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulasgeometricas;

import java.util.Scanner;

public class Triangulo_equilatero {
    public void areaequilatero(int base, int altura){
        System.out.println("La fórmula del área del Triángulo Equilátero es: ");
        System.out.println("(base * altura) / 2");
        int area;
        area=base *altura/2;
        System.out.println("El área del Triángulo Equilátero es de: "+area+"\n");
        }
    public void perimetroequilatero(int lado){
        System.out.println("La fórmula del perímetro del Triángulo equilátero es: ");
        System.out.println("3 * lado");
        int perimetro;
        perimetro=3*lado;
        System.out.println("El perímetro del Triángulo equilátero es de: "+perimetro+"\n");
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
        System.out.println("Introduzca el tamano de la altura");
        int altura= scanner.nextInt();
        return altura;
    }
    
}
