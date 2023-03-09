/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import javax.swing.JFrame;


//This is just the Interface

public class Main {
    public static void main(String[] args) {
        // Create an instance of the MyForm class
        MyForm myForm = new MyForm();

        // Set the form's properties
        myForm.setTitle("My Form");
        myForm.setSize(300, 200);
        myForm.setLocationRelativeTo(null);
        myForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Show the form on the screen
        myForm.setVisible(true);
    }
}

