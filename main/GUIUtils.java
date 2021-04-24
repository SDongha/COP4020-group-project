//package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.*;

public class GUIUtils {
	private User user;
	private SignUp sUp;
    public GUIUtils(){
		user = new User();
		sUp = new SignUp();
    }

    public void registration(String title)
    {
		JFrame frmBeYourOwn;
		JPasswordField passwordField;
		JTextField idField,fNameField,lNameField;

        frmBeYourOwn = new JFrame();
		frmBeYourOwn.setTitle(title);


		SpringLayout springLayout = new SpringLayout();
		frmBeYourOwn.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel_2 = new JLabel("First Name:  ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 10, SpringLayout.NORTH, frmBeYourOwn.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 92, SpringLayout.WEST, frmBeYourOwn.getContentPane());
		frmBeYourOwn.getContentPane().add(lblNewLabel_2);
		
		fNameField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, fNameField, 10, SpringLayout.NORTH, frmBeYourOwn.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, fNameField, 1, SpringLayout.EAST, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.EAST, fNameField, 0, SpringLayout.EAST, lblNewLabel_2);
		frmBeYourOwn.getContentPane().add(fNameField);
		fNameField.setColumns(20);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name:  ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 20, SpringLayout.NORTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 92, SpringLayout.WEST, frmBeYourOwn.getContentPane());
		frmBeYourOwn.getContentPane().add(lblNewLabel_3);
		
		lNameField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lNameField, 10, SpringLayout.NORTH, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.WEST, lNameField, 1, SpringLayout.EAST, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.EAST, lNameField, 0, SpringLayout.EAST, lblNewLabel_3);
		frmBeYourOwn.getContentPane().add(lNameField);
		lNameField.setColumns(20);

		//////////////////////////////////////////////////////////
		JLabel lblNewLabel = new JLabel("UserName:  ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 70, SpringLayout.NORTH, frmBeYourOwn.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 92, SpringLayout.WEST, frmBeYourOwn.getContentPane());
		frmBeYourOwn.getContentPane().add(lblNewLabel);
		
		
		
		//////////////////////////////////////////////////////////
		JLabel lblNewLabel_1 = new JLabel("Password:  ");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 27, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmBeYourOwn.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 118, SpringLayout.NORTH, frmBeYourOwn.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 6, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, 166, SpringLayout.EAST, lblNewLabel_1);
		frmBeYourOwn.getContentPane().add(passwordField);
		

		idField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, idField, 3, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, idField, 1, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, idField, 0, SpringLayout.EAST, passwordField);
		frmBeYourOwn.getContentPane().add(idField);
		idField.setColumns(10);

		////////////////////////////////////////////////////////
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 62, SpringLayout.WEST, frmBeYourOwn.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -44, SpringLayout.SOUTH, frmBeYourOwn.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 146, SpringLayout.WEST, frmBeYourOwn.getContentPane());
		frmBeYourOwn.getContentPane().add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener ()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				frmBeYourOwn.dispose();
			}
		});


		JButton btnNewButton_1 = new JButton("Register");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 90, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 29, SpringLayout.NORTH, btnNewButton);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frmBeYourOwn.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener ()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(passwordField.getText().length()==0 ||
					idField.getText().length()==0 ||
					fNameField.getText().length()==0 ||
					lNameField.getText().length()==0){
						
						JOptionPane.showMessageDialog(null, "Fill the form!","Signup", JOptionPane.INFORMATION_MESSAGE);
					}
				else{
					user =new User(fNameField.getText(), lNameField.getText(),
					idField.getText(), passwordField.getText());
					sUp.register(user);

				}
				System.out.println("Register completed");
			}
		});
		////////////////////////////////////////////////////////
		frmBeYourOwn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmBeYourOwn.setVisible(true);
		frmBeYourOwn.setBounds(700,300,400,300);
		frmBeYourOwn.setResizable(false);
    }
}