/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices.gato;

import java.util.Scanner;

public class Gato {
    
    public static void main(String[] args) {
        Scanner entry= new Scanner(System.in);
        int[][] matriz={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
        int numerodiagonal=0;
        boolean tieneAsignadoDiagonal=false;
        boolean esDiagonal=true;
        
        System.out.println("En que posicion desea el Circulo?");
        int posicion =entry.nextInt();
        
        for(int i=0;i<matriz.length;i++){       // i son filas
            
            for(int j=0;j<matriz[i].length;j++){   // j son columnas
                if(i==j){
                    if(!tieneAsignadoDiagonal){
                        tieneAsignadoDiagonal=true;
                        numerodiagonal=matriz[i][j];
                    }
                    else if (numerodiagonal != matriz[i][j]){
                        esDiagonal=false;
                    }
                }
                
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("" + (esDiagonal?"Ganaste":"Perdiste"));
    }
    
}
