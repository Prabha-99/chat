
package Logic;

import Client.ChatClient;
import interfaces.mainInterface;
import java.rmi.RemoteException;
import javax.swing.SwingUtilities;


public class MessageReceiver implements Runnable{
    private ChatClient client;
    private mainInterface mi;

    public MessageReceiver(ChatClient client, mainInterface mi) { //Taking 'ChatClient' object and 'mainInterface' as constructor arguments to make 'MessageReceiver' instances for those classes                                                                     
        this.client = client;
        this.mi = mi;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = client.receiveMessage();
                while (!message.isEmpty()) {
                    /*Once a new message is received, the SwingUtilities.invokeLater method is used to 
                    update the chat area in the mainInterface GUI with the new message. The invokeLater 
                    method ensures that this update is executed on the Swing event dispatch thread, which 
                    is the thread responsible for updating the GUI, rather than the background thread that 
                    this loop is running on. This is necessary to avoid potential issues with thread safety 
                    and GUI responsiveness.*/
                    
                    String finalMessage = message; // make a final copy for thread safety
                    SwingUtilities.invokeLater(() -> mi.setChatArea(finalMessage, mi.getChatArea()));
                    message = client.receiveMessage();
                }
            }
        } catch (RemoteException ex) {
            System.out.println("Exception in MessageReceiver: " + ex.getMessage());
        }
    }
}
