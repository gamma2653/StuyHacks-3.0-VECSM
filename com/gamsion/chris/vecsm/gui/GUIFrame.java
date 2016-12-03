package com.gamsion.chris.vecsm.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GUIFrame extends JFrame{
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension defaultsize = toolkit.getScreenSize();
	private static final long serialVersionUID = 1L;
	
	public GUIFrame(String s){
		super(s);
		setLayout(new FlowLayout());
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(defaultsize.width / 2 + 40,
				defaultsize.height / 4));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public GUIFrame(){
		super("VECSM");
		setLayout(new FlowLayout());
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(defaultsize.width / 2 + 40,
				defaultsize.height / 4));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
