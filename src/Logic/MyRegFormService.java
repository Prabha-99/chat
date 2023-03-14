
package Logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import javax.swing.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MyRegFormService implements UserManagement {
    
    
    
    private SessionFactory sessionFactory;
    
    //Instance Variables
    private final JTextField useridField; 
    private final JTextField usernameField;
    private final JTextField nicknameField;
    private final JTextField emailField;
    private final JTextField passwordField;

    public MyRegFormService(JTextField useridField, JTextField usernameField, JTextField nicknameField, JTextField emailField, JTextField passwordField) {
        this.useridField = useridField;
        this.usernameField = usernameField;
        this.nicknameField = nicknameField;
        this.emailField = emailField;
        this.passwordField = passwordField;
        
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
            .applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());
    }
    
    

//    public MyRegFormService() {
//        
//    }
    
     
    @Override
    public void save(Users users) throws RemoteException {
        
        String userID=useridField.getText();
        String userName=usernameField.getText();
        String nickName=nicknameField.getText();
        String email=emailField.getText();
        String password=passwordField.getText();
        
        
        users.setUserId(userID);
        users.setUserName(userName);
        users.setNickName(nickName);
        users.setEmail(email);
        users.setPassword(password);
        
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(users);
            transaction.commit();
            System.out.println("User saved successfully");
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.out.println("Error saving user: " + ex.getMessage());
        } finally {
            session.close();
        }
        
        JButton submitButton = new JButton("submitButton");
        submitButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        MyRegFormService myRegFormService = new MyRegFormService(useridField, usernameField, nicknameField, emailField, passwordField);
        Users user = new Users();
        try {
            myRegFormService.save(user);
            JOptionPane.showMessageDialog(null, "User saved successfully");
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, "Error saving user: " + ex.getMessage());
        }
    }
});

        
        
        
//        //Printing Results into Console
//        System.out.println(userID);
//        System.out.println(userName);
//        System.out.println(nickName);
//        System.out.println(email);
//        System.out.println(password);
//        
//        
//        //Setting Text Fields clear after submitting
//        useridField.setText("");
//        usernameField.setText("");
//        nicknameField.setText("");
//        emailField.setText("");
//        passwordField.setText("");
        
    }
    

    
    
}
