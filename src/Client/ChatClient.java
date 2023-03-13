
package Client;


import Logic.ChatServices;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;




public class ChatClient {
    
    private String name;
    private ChatServices chatservices;
    
    
    public ChatClient(String name) throws NotBoundException{
        this.name=name;
        
        
        try{
            //1. Locate the registry
            Registry myReg = LocateRegistry.getRegistry("localhost",5000);
            //2. Locating the remote object
            ChatServices userdao = (ChatServices) myReg.lookup("MyUserServer");         
            this.chatservices = userdao;
            
           }catch(RemoteException ex){
               System.out.println("Exception in Client..."+ ex.getMessage());
           }    
    }           
    
    /*The "sendMessage" method calls the "sendMessage" method on the remote "ChatServices" object, 
    passing the client's name and the message as a concatenated string.*/
    public void sendMessage(String message) throws RemoteException {
    chatservices.sendMessage(name + ": " + message);
    }

    /*The "receiveMessage" method calls the "receiveMessage" method on the remote "ChatServices" 
    object and returns the received message.*/
    public String receiveMessage() throws RemoteException {
        return chatservices.receiveMessage();
    }
    
   
    
    

   
}
