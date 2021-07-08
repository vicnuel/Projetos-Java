package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {
	
	public Layouts() {
		super("Layouts");
		
		/*Aparece apenas o butão 2 
		getContentPane().add(new JButton("1"));
		getContentPane().add(new JButton("2"));
		*/
		Container c = getContentPane();
		
		
		/*
		//BorderLayout
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));
		c.add(BorderLayout.CENTER, new JButton("3"));
		c.add(BorderLayout.EAST, new JButton("4"));
		c.add(BorderLayout.WEST, new JButton("5"));
		*/
		
		/*
		// personalizado
		BorderLayout border = new BorderLayout();
		c.setLayout(border);
		*/
		
		//por ondem de chegada
		c.setLayout(new FlowLayout());
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Layouts();
	}

}
