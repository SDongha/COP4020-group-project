//package main;

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

//import gui.GUIUtils;

public class Builder {
	
	private GUIUtils util;
	public void buildLogin()
	{
		GUIUtils utils = new GUIUtils();
		this.util=utils;
		JFrame frmBeYourOwn;
		JPasswordField passwordField;
		JTextField textField;

		frmBeYourOwn = new JFrame();
		frmBeYourOwn.setTitle("Be Your Own Boss: Rideshare");
		SpringLayout springLayout = new SpringLayout();
		frmBeYourOwn.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("UserName:  ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 70, SpringLayout.NORTH, frmBeYourOwn.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 92, SpringLayout.WEST, frmBeYourOwn.getContentPane());
		frmBeYourOwn.getContentPane().add(lblNewLabel);
		
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
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 3, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, textField, 1, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, passwordField);
		frmBeYourOwn.getContentPane().add(textField);
		textField.setColumns(10);
		
		//###########################################################################
		JButton btnNewButton = new JButton("Login");
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
				JFrame f= new JFrame();
				f.setBounds(700,300,400,300);
				f.setVisible(true);
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
				util.registration("Registeration");
			}
		});

		/////////////////////////////////////
		frmBeYourOwn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBeYourOwn.setVisible(true);
		frmBeYourOwn.setBounds(700,300,400,300);
		frmBeYourOwn.setResizable(false);
	}
}
