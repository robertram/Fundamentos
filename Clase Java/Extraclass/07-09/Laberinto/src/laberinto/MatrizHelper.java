
package laberinto;

/**
 *
 * @author robertramirez
 */
public class MatrizHelper {
    public void print(int[][] matriz) {
        
        System.out.println("Resuelve el laberinto! ");
        System.out.println("Las Reglas son las siguientes:");
        System.out.println("Eres el 2 y tienes 10 movimientos para llegar al 3, ademas no puedes tocas las paredes(los 1's) ");
        System.out.println(" ");
        
        for(int i=0;i<matriz.length;i++){       // i son filas
            for(int j=0;j<matriz[i].length;j++){   // j son columnas
                System.out.print(matriz[i][j]+"  ");
            } 
            System.out.println("");
        }
        System.out.println();
        
        System.out.println("Pulsa las siguientes teclas para moverte:");
        System.out.println("1=arriba");
        System.out.println("2=abajo");
        System.out.println("3=izquierda");
        System.out.println("4=derecha");
        System.out.println(" ");
        

    }
    
    
    public void goUp(int[][] matriz){
        /*for(int i=0;i<matriz.length;i++){       // i son filas
            for(int j=0;j<matriz[i].length;j++){   // j son columnas
                System.out.print(matriz[i][j]+"  ");
            } 
            System.out.println("");
        }
        System.out.println();*/
        
        int initial=0;
        matriz[6][1]=initial; //Este el es numero donde empieza el juego
        
        int num=2;
        matriz[5][1]=num;
        
        
    }
    
    
    public void goDown(int[][] matriz){
        
        /*for(int i=0;i<matriz.length;i++){       // i son filas
            for(int j=0;j<matriz[i].length;j++){   // j son columnas
                System.out.print(matriz[i][j]+"  ");
            } 
            System.out.println("");
        }
        System.out.println();*/
        
        System.out.println("Movimiento invalido");
    }
    
    
    
    public void goLeft(int[][] matriz){
        /*for(int i=0;i<matriz.length;i++){       // i son filas
            for(int j=0;j<matriz[i].length;j++){   // j son columnas
                System.out.print(matriz[i][j]+"  ");
            } 
            System.out.println("");
        }
        System.out.println();*/
        
        System.out.println("Movimiento invalido");
        
    }
    
    public void goRight(int[][] matriz){
        /*for(int i=0;i<matriz.length;i++){       // i son filas
            for(int j=0;j<matriz[i].length;j++){   // j son columnas
                System.out.print(matriz[i][j]+"  ");
            } 
            System.out.println("");
        }
        System.out.println();*/
        
        System.out.println("Movimiento invalido");
        
    }
    
    public void nextMatriz(int[][] matriz){
        
        
        for(int i=0;i<matriz.length;i++){       // i son filas
            for(int j=0;j<matriz[i].length;j++){   // j son columnas
                System.out.print(matriz[i][j]+"  ");
            } 
            System.out.println("");
        }
        System.out.println();
       
        
        
    }
}
