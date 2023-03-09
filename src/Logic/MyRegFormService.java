
package Logic;

import javax.swing.*;

public class MyRegFormService {
    
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
    }
    
    public void registerUser(){
        
        
        
        String userID=useridField.getText();
        String userName=usernameField.getText();
        String nickName=nicknameField.getText();
        String email=emailField.getText();
        String password=passwordField.getText();
        
        
        //Printing Results into Console
        System.out.println(userID);
        System.out.println(userName);
        System.out.println(nickName);
        System.out.println(email);
        System.out.println(password);
        
        
        //Setting Text Fields clear after submitting
        useridField.setText("");
        usernameField.setText("");
        nicknameField.setText("");
        emailField.setText("");
        passwordField.setText("");
        
        
    }

    
    
}
