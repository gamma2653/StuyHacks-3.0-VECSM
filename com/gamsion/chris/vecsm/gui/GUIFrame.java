package com.gamsion.chris.vecsm.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIFrame extends JFrame{
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension defaultsize = toolkit.getScreenSize();
	private static final long serialVersionUID = 1L;
	public JButton start = new JButton();
	
	
	public GUIFrame(String s){
		super(s);
		this.setupGUI();
	}
	public GUIFrame(){
		super("VECSM");
		this.setupGUI();
		
	}
	
	protected void setupGUI(){
		setLayout(new FlowLayout());
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(defaultsize.width / 2 + 40,
				defaultsize.height / 2));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	

	
	
	
	
	
	
}
