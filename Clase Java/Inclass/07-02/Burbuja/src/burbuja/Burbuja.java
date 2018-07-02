/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.util.Random;
import java.util.Stack;
import java.util.StringTokenizer;

public class Burbuja {

    public static void main(String[] args) {
        int[] arreglo=new int [5];
        
        for(int i=0;i<arreglo.length;i++){
        arreglo[i]=getRandomNumberInRange(0, 10);
        }
        
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]<arreglo[i+1]){
                arreglo[i]=arreglo[i+1];
            }
            
            System.out.println(arreglo[0]);
            System.out.println(arreglo[1]);
        }
        
        
        
        }
        
        
        private static int getRandomNumberInRange(int min, int max) {

            if (min >= max) {
                    throw new IllegalArgumentException("max must be greater than min");
            }

            Random r = new Random();
            return r.nextInt((max - min) + 1) + min;
        }
    }
    
    


    

