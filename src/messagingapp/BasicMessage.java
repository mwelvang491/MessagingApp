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
public class BasicMessage implements Message {
    private String messageContent;
    private static final String MSG_ENTRY_ERROR = "Cannot Be Null.";
     StringOutputService outputStringService = new StringOutputService();
        
    @Override
    public String getMessageContent() {
    //    System.out.println("Test");
        return messageContent;
    }

    @Override
    public void setMessageContent(String messageContent) {
        
        if(messageContent==null){
            outputStringService.outputStringToConsole("value is null");
            throw new IllegalArgumentException(MSG_ENTRY_ERROR);
           
        }
        
        this.messageContent = messageContent;
    }
   
}
