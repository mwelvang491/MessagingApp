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
public class MessageDirector {
    
    public void DirectMessage(Message msg, MessageInput inputMsg, MessageOutput outputMsg){
       inputMsg.InputMessage(msg);
       outputMsg.OutputMessage(msg); 
    };
}
