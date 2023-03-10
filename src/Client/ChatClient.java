
package Client;

import Logic.ChatServices;
import Logic.Users;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;



public class ChatClient {
    
    public static void main(String[] args) throws NotBoundException {
        
        try{
            
            //1. Locate the registry
            Registry myReg = LocateRegistry.getRegistry("localhost",5000);
            //2. Locating the remote object
            ChatServices userdao = (ChatServices) myReg.lookup("MyUserServer");
            
            
            
            //3. Invoke the methods
            
            // Create a new user
            Users users = new Users();
            users.setUserId("U003");
            users.setUserName("Olivia");
            users.setEmail("olivia@gmail.com");
            users.setNickName("olivia");
            users.setPassword("olivia@123");
            users.setProfileImage(null);
            userdao.save(users);
            
            // Retrieve all users
            
            List<Users> allUsers = userdao.getAll();
            for (Users user : allUsers) {
            System.out.println(user.getUserId());
            System.out.println(user.getUserName());
            System.out.println(user.getEmail());
            System.out.println(user.getNickName());
            System.out.println(user.getPassword());
            System.out.println(user.getProfileImage());
            
}
    
           }catch(RemoteException ex){
               System.out.println("Exception in Client..."+ ex.getMessage());
           }
    }
    
            
            
}
