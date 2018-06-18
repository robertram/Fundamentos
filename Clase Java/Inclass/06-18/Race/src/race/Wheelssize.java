/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race;

import java.util.Random;

/**
 *
 * @author robertramirez
 */
public class Wheelssize {
    private String brand;
    private double wheels;
    private static final double MAX_WHEEL_SIZE=20;//extra

    public Wheelssize(String brand, double wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }
    public double getwheels() {
        return wheels;
    }
    public double aleatorio(){
        return this.wheels / MAX_WHEEL_SIZE;
        
    }
}
