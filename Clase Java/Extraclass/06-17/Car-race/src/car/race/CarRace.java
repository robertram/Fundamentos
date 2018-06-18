/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.race;

import java.util.Random;

public class CarRace {

    public static void main(String[] args) {
        int distance=0;
        Carro carromarca=new Carro();
        Carro carromarca2=new Carro();
        Carro carromarca3=new Carro();
        Carro racing= new Carro();
        Carro contador=new Carro();
        
        carromarca.marca("Toyota");
        carromarca.año(2017);
        carromarca.caballosfuerza(120);
        
        carromarca2.marca("Hyundai");
        carromarca2.año(2015);
        carromarca2.caballosfuerza(150);
        
        carromarca3.marca("LandRover");
        carromarca3.año(2014);
        carromarca3.caballosfuerza(180);
        
        System.out.println("Empieza la carrera!!");
        //1
        racing.carrera(distance);
        contador.counter();
        //2
        racing.carrera(distance);
        contador.counter();
        //3
        racing.carrera(distance);
        contador.counter();
        
    }
    
}
