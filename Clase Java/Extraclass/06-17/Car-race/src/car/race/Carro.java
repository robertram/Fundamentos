/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.race;

import java.util.Random;
import java.util.Scanner;

public class Carro {
    public int horses;
    public int intAleatorio;
    public void marca(String brand){
        System.out.print("*La marca del carro es "+brand);
    }
    public void año(int year){
        System.out.println(" y el año del carro es: "+year);
    }
    public int caballosfuerza(int horses){
        System.out.println("Los caballos de fuerza son: "+horses);
        return 0;
    }
    public void carrera(int caballosfuerza){
        Random aleatorio = new Random(System.currentTimeMillis());
        int intAleatorio = aleatorio.nextInt(2);
        System.out.println("Numero aleatorio: "+intAleatorio);
        
        int delantera= horses*intAleatorio;
        System.out.println("distancia: "+delantera);
    }
    public void counter(){
        int delantera=0;
        int distanciarecorrida=0;
        if (distanciarecorrida<1000){
            distanciarecorrida=delantera+delantera;
        }
        
    }
}
