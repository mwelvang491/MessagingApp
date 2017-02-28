/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingapp;

import java.util.Scanner;

/**
 *
 * @author Mitch W
 */
public class ScannerInput implements MessageInput{
    StringOutputService outputStringService = new StringOutputService();
    @Override
    public void InputMessage(Message msg){
        Scanner keyboard = new Scanner(System.in);
        outputStringService.outputStringToConsole("Enter Message");    //Replace S.out 
        msg.setMessageContent( keyboard.nextLine() );
    }


    
}
