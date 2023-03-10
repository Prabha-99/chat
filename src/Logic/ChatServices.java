
package Logic;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;


public interface ChatServices extends Remote{
    
    void save(Users users)throws RemoteException; //Data Adding Method

    void update(Users users)throws RemoteException; //Data Updating Method

    void delete(Users users)throws RemoteException; //Data Deleting Method

    Users getById(String userId)throws RemoteException; //Retreive Users by ID

    ArrayList<Users> getAll()throws RemoteException; //Retreive all Users
    
    void registerUser(Users users)throws RemoteException;//User chat registration
    
    void sendMessage(Chats chats)throws RemoteException;//Sendin Messages
    
    void saveChats(Chats chats)throws RemoteException;//Saving chats into Database
    
    
}
