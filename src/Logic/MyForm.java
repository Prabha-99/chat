package Logic;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




public class MyForm extends JFrame {
    private JButton myButton;

    public MyForm() {
        initComponents();
    }

    private void initComponents() {
        // Initialize the myButton component
        myButton = new JButton("Click me");

        // Add an action listener to the button
        myButton.addActionListener(new ActionListener() {
            private Object MyEventHandler;
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call the handleButtonClick method in MyEventHandler
                Logic.MyEventHandler.handleButtonClick();
            }

        });

        // Add the myButton component to the form's content pane
        getContentPane().add(myButton);
    }
}


