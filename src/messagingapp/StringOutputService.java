/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Mitch W
 */
public class StringOutputService {
    
    public void outputStringToConsole(String msg){
        System.out.println(msg); 
    }
    
    public void outputStringToGui(String msg){
        JOptionPane.showInputDialog(msg);
    }
    
     public void outputStringToConsoleAndGui(String msg){
        JOptionPane.showInputDialog(msg); 
        System.out.println(msg); 
    }
    
}
