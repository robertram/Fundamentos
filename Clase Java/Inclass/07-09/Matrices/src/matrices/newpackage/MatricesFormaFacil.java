/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices.newpackage;

public class MatricesFormaFacil {
    
    public static void main(String[] args) {
        int[][] matriz={
            {1,2,3},
            {4,1,6},
            {7,8,1},
        };
        
        int numerodiagonal=0;
        boolean tieneAsignadoDiagonal=false;
        boolean esDiagonal=true;

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
        System.out.println("Los numero son:" + (esDiagonal?"iguales":"diferentes"));
        
        
        
        
        
        /*if (matriz[0][0]==matriz[1][1]){
            System.out.println("son iguales");
        }
        else{
            System.out.println("son diferentes");
        }*/

        
        
        
    
    
    
    
    }
}
