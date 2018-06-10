
package equipos;

import java.util.Random;

public class Equipos {

    public static void main(String[] args) {

        String A="Equipo A";
        String B="Equipo B";
        String C="Equipo C";
        String D="Equipo D";
        int counter=0;
        int counter2=counter+1;   

        for (int i = 1; i < 9; i++) {
            System.out.println("El grupo "+i+" es: ");
            System.out.print("Los goles del "+A+" fueron: "+getRandomNumberInRange(0, 10));
            System.out.println(" y los goles del "+B+" fueron: "+getRandomNumberInRange(0, 10));
            System.out.print("Los goles del "+C+" fueron: "+getRandomNumberInRange(0, 10));
            System.out.println(" y los goles del "+D+" fueron: "+getRandomNumberInRange(0, 10));
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
    

