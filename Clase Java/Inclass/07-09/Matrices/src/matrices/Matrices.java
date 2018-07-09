/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

public class Matrices {

    public static void main(String[] args) {
        
        /*int[] arre= {1,2,3,4,5};
        
        int[][] matriz={
            {1,2,3},
            {4,1,6},
            {7,8,1},
        };
    
        */
        
        //Una matriz es una arreglo dentro de otro arreglo.
        int[][]matriz= new int[5][5]; // esto es una matriz de 5 filas y 5 columnas. Osea una matriz con 5 matrices dentro.
        
        int contador=1;
        
        for(int i=0;i<matriz.length;i++){       // i son filas
            for(int j=0;j<matriz[i].length;j++){   // j son columnas
                matriz[i][j]=contador++; // este contador llena las posiciones de los arrays
                System.out.print(matriz[i][j]+"  ");
            
            } 
            System.out.println("");
        }
        System.out.println();
    }
    
}
