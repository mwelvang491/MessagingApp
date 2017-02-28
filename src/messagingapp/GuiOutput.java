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
public class GuiOutput implements MessageOutput {

    @Override
    public void OutputMessage(Message message) {
       JOptionPane.showMessageDialog(null, message.getMessageContent() ); 
    }
    
    
}
