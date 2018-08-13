/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logincsv;

import UI.NewJFrame;
import UI.NextMenu;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author robertramirez
 */
public class LoginCSV {

    private static Scanner x;
    private String txtUsuario;
    private String txtContraseña;
    
    
    public void Autent(String username, String password){
        
        NewJFrame frame= new NewJFrame();
        
        this.txtUsuario = username;
        this.txtContraseña = password;
        
        String filepath="/Users/robertramirez/Desktop/members.txt";
        
        VerifyLogin(username, password, filepath);
        
    }
    
    public static void VerifyLogin(String username, String password, String filepath) {
        
        NewJFrame frame= new NewJFrame();
        
        boolean found=false;
        String tempUsername="";
        String tempPassword="";
        
        try{
            x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");
            
            while(x.hasNext() && !found){
                
                tempUsername = x.next();
                tempPassword = x.next();
                
                if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))
                {
                    found= true;
                    
                    NextMenu menu = new NextMenu();
                    menu.show();
                    frame.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Usuario o Contraseña incorrecto!. Revise las mayúsculas", "Incorrecto", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            x.close();
            System.out.println(found);
            
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, "No se encuentra en archivo", "Error!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error");
        }
    
    }
    
    
    
    /*
    public static void main(String[] args) {
        String username="Bob69";
        String password="123";
        String filepath="/Users/robertramirez/Desktop/members.txt";
        
        VerifyLogin(username, password, filepath);
        
    }
    
    public static void VerifyLogin(String username, String password, String filepath) {
        boolean found=false;
        String tempUsername="";
        String tempPassword="";
        
        try{
            x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");
            
            while(x.hasNext() && !found){
                
                tempUsername = x.next();
                tempPassword = x.next();
                
                if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))
                {
                    found= true;
                }
                
            }
            x.close();
            System.out.println(found);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se encuentra en archivo", "Error!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error");
        }
    
    }*/
}
