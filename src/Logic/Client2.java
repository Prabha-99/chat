
package Logic;

import Client.ChatClient;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;


public class Client2 {
    public static void main(String[] args) {
        try {
            // Create a new ChatClient object with the name "Alice"
            ChatClient client = new ChatClient("Prabhashana");
            
            // Create a Scanner object for reading user input
            Scanner scanner = new Scanner(System.in);

            // Loop indefinitely to send and receive messages
            while (true) {
                System.out.print("> ");
                String input = scanner.nextLine();
                client.sendMessage(input);
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
