
package Logic;

import interfaces.loginform;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class LoginAuth {
    
    private final SessionFactory sessionFactory;
    private final loginform loginform;

    public LoginAuth(SessionFactory sessionFactory, loginform loginform) {
        this.sessionFactory = sessionFactory;
        this.loginform = loginform;
    }

    public LoginAuth() {
       this(null, null);
    }

    
    
    public synchronized boolean logauth(){  
    
    // Get a session from the session factory
    Session session = sessionFactory.openSession();
    
    /// Get the username and password entered by the user from the login form
    String email = null;
    String password = null;
    if (loginform != null) {
        email = loginform.getUsername();
        password = loginform.getPassword();
    }else{
        System.out.println("Enter Credetials to Login..");
    }
    
    // Query the database for the user credentials
    Query query = session.createQuery("from users where email=:email and password=:password");
    query.setParameter("email", email);
    query.setParameter("password", password);
    List<Users> users = query.list();
    
    // Close the session
    session.close();
    
    
        // Check if the user credentials are valid
        if (users.size() == 1) {
            return true;

        } else {
           return false;
        }
    
    
    }
    
    
    
}
