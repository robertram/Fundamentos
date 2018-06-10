/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author robertramirez
 */
public class JavaApplication10 {

    public static int suma (int numeroA, int numeroB) {
        int resultado= numeroA+numeroB;
        return resultado;
    
    }
    
    
    public static void main(String[] args) {
        System.out.println(suma(10, 7));
        //System.out.println(resultado); resultado esta solo en el metodo de arriba, 
        //no se puede usar abajo
        suma(10, 7);
        int resultadoSuma=suma(15,25);
        System.out.println(resultadoSuma);
    }
    
}
