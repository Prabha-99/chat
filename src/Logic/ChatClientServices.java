
package Logic;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ChatClientServices extends Remote{
    
    void receiveMessage(String message) throws RemoteException;//Called by the server when a new message is received.
    
    String getName() throws RemoteException; //Returns the name of the client
}

