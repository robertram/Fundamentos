/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulasgeometricas;

import java.util.Scanner;

public class Rectangulo {
    public void arearectangulo(int base, int altura){
        System.out.println("La fórmula del área del rectángulo es:");
        System.out.println("base * altura");
        int area;
        area=base*altura;
        System.out.println("El área del rectángulo es de: "+area+"\n");
        }
    public void perimetrorectangulo(int base,int altura){
        System.out.println("La fórmula del perímetro del rectángulo es:");
        System.out.println("2*base + 2*altura");
        int perimetro;
        perimetro=2*base+2*altura;
        System.out.println("El perímetro del rectángulo es de: "+perimetro+"\n");
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
