
package Server;


import Logic.ChatServices;
import Logic.NewHibernateUtil;
import Logic.ChatServicesImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import org.hibernate.Session;



public class ChatServer {
    public static void main(String[] args) {
        
        try {
            
            //Creating the RMI Registry
            Registry myReg = LocateRegistry.createRegistry(5000);
            
            // Creating a session object using the Hibernate utility class
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            
            //2. Binding the remote object
            ChatServices cs=new ChatServicesImpl();
            myReg.rebind("MyUserServer",cs);
            
            //To identify server is running
            System.out.println("My Users Server is Running...");
            
        } catch (RemoteException ex) {
            System.out.println("Exception in creating registry..." + ex.getMessage());
        }
    }
}
