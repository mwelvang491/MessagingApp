/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingapp;

/**
 *
 * @author Mitch W
 */
public class Startup {
    
    public static void main(String[] args) {    
        MessagingApplication messagingApp = new MessagingApplication();
           Message basicMsg = new BasicMessage();
           Message tweet = new Tweet();


//         Input msgIn = new ScannerInput();
//         Output msgOut = new ConsoleOutput();
             
//         Input guiInput = new GuiInput();
//         Output guiOut = new GuiOutput();
         

//        messagingApp.runCustomMessagingApplication(basicMsg, msgIn, msgOut);
//        messagingApp.runCustomMessagingApplication(message, msgInput, msgOutput);

//        messagingApp.runBasicConsoleMessagingApplication(tweet);
//        messagingApp.runBasicConsoleMessagingApplication(basicMsg);
        
//        messagingApp.runGuiMessagingApplication(tweet);
          messagingApp.runGuiMessagingApplication(basicMsg);   
        
    }
}
