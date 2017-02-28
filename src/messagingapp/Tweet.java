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
public class Tweet implements Message{
    private String messageContent;
    private static final String MSG_ENTRY_ERROR = "Cannot Be Null.";
    private final int tweetCharLimit = 140;   
    StringOutputService outputStringService = new StringOutputService();
   
    @Override
    public String getMessageContent() {
    //    System.out.println("Test");
        return messageContent;
    }

    @Override
    public void setMessageContent(String messageContent) {
        
        if( messageContent == null ){
            outputStringService.outputStringToConsole("Value Is Null");
            throw new IllegalArgumentException(MSG_ENTRY_ERROR);   
        }else if( messageContent.length() > tweetCharLimit){ 
            outputStringService.outputStringToConsole("Tweets Must Be Less Than " + tweetCharLimit + " Characters.");
        }else{    
            this.messageContent = messageContent;
        }
    }
}
