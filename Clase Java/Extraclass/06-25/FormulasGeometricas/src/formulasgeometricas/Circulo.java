/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulasgeometricas;

import java.util.Scanner;

public class Circulo {
    public void areacirculo(int radio){
        System.out.println("La fórmula del area del círculo es:");
        System.out.println("π * (radio*radio)");
        int area;
        area=radio*radio;
        System.out.println("El área del cuadrado es de: "+area+"π\n");
        }
    public void perimetrocirculo(int radio){
        System.out.println("La fórmula del perímetro del círculo es:");
        System.out.println("2 * π * radio");
        double perimetro;
        perimetro = 2*Math.PI*radio;
        System.out.println("El perímetro del cuadrado es de: "+perimetro+"\n");
    }
    public int radio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el radio");
        int radio = scanner.nextInt();
        return radio;
    }
}
