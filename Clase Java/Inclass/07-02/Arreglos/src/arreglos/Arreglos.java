
package arreglos;

import java.util.Random;

public class Arreglos {
    public static void main(String[] args) {
        
        int[] arreglo=new int [5];
        int[] arreglo2=new int [5];
        arreglo[0]=25;
        
        System.out.println("Primer arreglo");
        for(int i=0;i<arreglo.length;i++){
            arreglo[i]=getRandomNumberInRange(0, 10);
            System.out.println(+arreglo[i]);
        }
        
        
        System.out.println("Segundo arreglo");
        for(int i=0;i<arreglo2.length;i++){
            arreglo2[i]=getRandomNumberInRange(0, 10);
            System.out.println(arreglo2[i]);
        }
        
        int[] arreglo3=new int [5];
        System.out.println("Arreglo 3=");
        for(int i=0;i<arreglo3.length;i++){
            arreglo3[i]=arreglo[0]*arreglo2[i];
            
           
            //arreglo3[i]=arreglo3[i]+arreglo3[i+1];
            System.out.println(arreglo3[i]);
            
        }
        System.out.println();
        
    }
    
    
    
    private static int getRandomNumberInRange(int min, int max) {

            if (min >= max) {
                    throw new IllegalArgumentException("max must be greater than min");
            }

            Random r = new Random();
            return r.nextInt((max - min) + 1) + min;
    }
    
}
