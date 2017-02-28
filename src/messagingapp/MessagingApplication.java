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
public class MessagingApplication {
        
         MessageDirector director = new MessageDirector();
            

       public void runBasicConsoleMessagingApplication(Message msg){
            MessageInput msgIn = new ScannerInput();
            MessageOutput msgOut = new ConsoleOutput();
          /** Runs A Basic Messaging Application
            * The Message Has No Restrictions, Other than restrictions than null values. 
            * Gets Input From A Keyboard Scanner. 
            * Sends Output to the Console. 
            */
         director.DirectMessage(msg , msgIn , msgOut);
       }
       
       public void runGuiMessagingApplication(Message msg){
            MessageInput guiInput = new GuiInput();
            MessageOutput guiOut = new GuiOutput();
          /**Runs A Gui Based Messaging Application. 
           * The Message cannot have more than 140 characters. 
           * Gets Input and Does Output with GUI popups. 
           */
           director.DirectMessage(msg, guiInput, guiOut);
       }
       
//       public void runCustomMessagingApplication(Message message, Input msgInput, Output msgOutput ){
//          /**Runs a custom Messaging Application. 
//            * WARNING: Using This Method Can Cause Errors. 
//            * Need To Pass through...
//            * A Message Object, 
//            * A Input Object, 
//            * A Output Object. 
//            */
//          director.DirectMessage(message , msgInput , msgOutput);   
//       }
       
}
