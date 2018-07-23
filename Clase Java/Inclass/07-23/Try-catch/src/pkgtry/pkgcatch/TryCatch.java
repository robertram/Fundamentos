/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgtry.pkgcatch;

/**
 *
 * @author robertramirez
 */
public class TryCatch {
    
    private static double divide(int num1, int num2){
        if(num1==0){
            throw new NumberFormatException("0 is not expected!");
        }
       
    
        return num1/num2;
    }
    
    
    
    public static void main(String[] args) {
        try{
          double res= divide(25,0);
          System.out.println("Resultado"+res);
        }
        catch (NumberFormatException ex){
            System.out.println("Ocurrio un error de formato de numero");
            System.out.println(ex.getMessage());
        }
        catch(Exception ex){
            System.out.println("Excepcion generica");
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Esto siempre se ejecuta");
        }
    }
    
}
