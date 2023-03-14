
package Logic;

import Client.ChatClient;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;


public class MessageArea {
    public static void main(String[] args) {
        try {
            // Create a new ChatClient object with the name "Alice"
            ChatClient client = new ChatClient("");
            
            // Loop indefinitely receive messages
            while (true) {
                String message = client.receiveMessage();
                while (!message.isEmpty()) {
                    System.out.println(message);
                    message = client.receiveMessage();
                }
            }
            
        } catch (NotBoundException | RemoteException ex) {
            System.out.println("Exception in ChatClientApp: " + ex.getMessage());
        }
    }
}
