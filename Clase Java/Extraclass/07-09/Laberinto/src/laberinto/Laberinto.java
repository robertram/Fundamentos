
package laberinto;

import java.util.Scanner;

public class Laberinto {
    /*  0 = Lugar seguro para caminar

        1 = Pared

        2 = Punto Inicial

        3 = Punto Final*/
    public static void main(String[] args) {
        
        Scanner decision = new Scanner(System.in);
        MatrizHelper helper=new MatrizHelper();
        
        int[][] matriz={
            {1,1,1,1,1,1,1},
            {1,0,0,0,0,0,3},
            {1,0,1,0,1,0,1},
            {0,0,1,0,0,0,1},
            {1,0,1,0,1,0,1},
            {1,0,0,0,0,0,1},
            {1,2,1,0,1,0,1},
        };
        
        helper.print(matriz);
        System.out.print("Movimiento:");
        int accion=decision.nextInt();
        
        boolean play=false;
        
        
        while(!play){
            
            if(accion==1){
                helper.goUp(matriz);
                helper.nextMatriz(matriz);
                play=true;
            }
            else if(accion==2){
                helper.goDown(matriz);
                helper.nextMatriz(matriz);
                play=true;
            }
            else if(accion==3){
                helper.goLeft(matriz);
                helper.nextMatriz(matriz);
                play=true;
            }
            else if(accion==4){
                helper.goRight(matriz);
                helper.nextMatriz(matriz);
                play=true;
            }
       
            
        }
        
        System.out.println("Gracias por jugar!");
        
        
        
        
        
        
        
        
    }
    
}


