
package Logic;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import org.hibernate.Session;


public class ChatServiceImpl extends UnicastRemoteObject implements ChatServices{
    
    private final Session session;

    public ChatServiceImpl(Session session) throws RemoteException {
        super();
        this.session=session;
    }

  
    
                                            //Method Implementation
    @Override
    public void save(Users users) {
        session.beginTransaction();
        session.save(users);
        session.getTransaction().commit();
    }
    
    @Override
    public void update(Users users) {
        session.beginTransaction();
        session.update(users);
        session.getTransaction().commit(); 
    }

    @Override
    public void delete(Users users) {
        session.beginTransaction();
        session.delete(users);
        session.getTransaction().commit(); 
    }

    @Override
    public Users getById(String userId) {
        return (Users) session.get(Users.class, userId);
    }

    

    @Override
    public ArrayList<Users> getAll() {
        return (ArrayList<Users>) session.createQuery("from Users").list(); 
    }

    @Override
    public void registerUser(Users users) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void sendMessage(Chats chats) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void saveChats(Chats chats) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
