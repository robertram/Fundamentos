/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulasgeometricas;

import java.util.Scanner;

public class Cuadrado {
    public void areacuadrado(int lados){
        System.out.println("La fórmula del área del cuadrado es:");
        System.out.println("lado * lado");
        int area;
        area=lados*lados;
        System.out.println("El área del cuadrado es de: "+area+"\n");
        }
    public void perimetrocuadrado(int lados){
        System.out.println("La fórmula del perímetro del cuadrado es:");
        System.out.println("4 * lado");
        int perimetro;
        perimetro=4*lados;
        System.out.println("El perímetro del cuadrado es de: "+perimetro+"\n");
    }
    public int tamaño_lados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del lado");
        int lados = scanner.nextInt();
        return lados;
    }
    
    
    
    
}
