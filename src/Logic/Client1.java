
package Logic;

import Client.ChatClient;
import interfaces.mainInterface;
import interfaces.testForm;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import javax.swing.JTextArea;


public class Client1 {
    public synchronized static void main(String[] args) {
        
        try {
            // Create a new ChatClient object with the name "Alice"
            ChatClient client = new ChatClient("Jenna");
//            mainInterface mi = new mainInterface();
//            JTextArea chatArea = mi.getChatArea("chatArea");
            testForm testForm = new testForm();
            
            
            
            // Create a Scanner object for reading user input
            Scanner scanner = new Scanner(System.in);

            // Loop indefinitely to send and receive messages
            while (true) {
                System.out.print("> ");
                String input = scanner.nextLine();
                client.sendMessage(input);
                String message = client.receiveMessage();
                while (!message.isEmpty()) {
                    testForm.setTest("chatArea1",message);
                    message = client.receiveMessage();
                }
            }
            
        } catch (NotBoundException | RemoteException ex) {
            System.out.println("Exception in ChatClientApp: " + ex.getMessage());
        }
    }
}