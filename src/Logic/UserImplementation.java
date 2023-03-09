
package Logic;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import org.hibernate.Session;


public class UserImplementation extends UnicastRemoteObject implements UserDao{
    
    private final Session session;

    public UserImplementation(Session session) throws RemoteException {
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
//
//    @Override
//    public void update(Users users) {
//        session.beginTransaction();
//        session.update(users);
//        session.getTransaction().commit(); 
//    }
//
//    @Override
//    public void delete(Users users) {
//        session.beginTransaction();
//        session.delete(users);
//        session.getTransaction().commit(); 
//    }
//
//    @Override
//    public Users getById(String userId) {
//        return (Users) session.get(Users.class, userId);
//    }
//
//    
//
    @Override
    public ArrayList<Users> getAll() {
        return (ArrayList<Users>) session.createQuery("from Users").list(); 
    }
    
}
