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
public class ConsoleOutput implements MessageOutput {
   StringOutputService outputStringService = new StringOutputService();
    @Override
    public void OutputMessage(Message message) {
      outputStringService.outputStringToConsole( message.getMessageContent() );
    }
    
}
