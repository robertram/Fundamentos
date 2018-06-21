/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulasgeometricas;

import java.util.Scanner;

public class Pentagono_regular {
    public void areapentagono(int apotema, int numlados, int lados){
        System.out.println("La fórmula del área del Pentágono regular es: ");
        System.out.println("(perimetro * apotema) / 2");
        int perimetro=numlados*lados;
        int area;
        area=perimetro*apotema/2;
        System.out.println("El área del Pentágono regular es de: "+area+"\n");
        }
    public void perimetropentagono(int numlados, int lados){
        System.out.println("La fórmula del perímetro del Pentágono regular es: ");
        System.out.println("numero de lados * lado");
        int perimetro;
        perimetro=numlados*lados;
        System.out.println("El perímetro del Pentágono regular es de: "+perimetro+"\n");
    }
    public int tamaño_lados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del lado");
        int lados = scanner.nextInt();
        return lados;
    }
    public int apotema(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el tamaño de la apotema");
        int apotema = scanner.nextInt();
        return apotema;
    }
    public int num_lados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número de lados");
        int numlados= scanner.nextInt();
        return numlados;
    }
}
