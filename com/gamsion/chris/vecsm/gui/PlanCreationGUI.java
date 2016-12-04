package com.gamsion.chris.vecsm.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import com.gamsion.chris.vecsm.backend.CostItem;
import com.gamsion.chris.vecsm.gui.handlers.handleCreate;
import com.gamsion.chris.vecsm.gui.handlers.handleItemCreateGUI;

public class PlanCreationGUI extends JFrame{
	public List<CostItem> items = new ArrayList<CostItem>();
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension defaultsize = toolkit.getScreenSize();
	private static final long serialVersionUID = 1L;
	public JTextField title = new JTextField("Enter a title.", 30);
	public JTextArea description = new JTextArea();
	public JButton create = new JButton("Create");
	public JButton addItem = new JButton("Add Item...");
	public JTextField totalCost = new JTextField("Enter your total budget.", 30);
	
	public PlanCreationGUI(){
		super("VECSM Creation GUI...");
		this.setupGUI();
	}
	
	
	public void setupGUI(){
		create.setPreferredSize(new Dimension(300,60));
		addItem.setPreferredSize(new Dimension(300,60));
		description.setPreferredSize(new Dimension(600, 400));
		
		
		SpringLayout layout = new SpringLayout();
		setLayout(layout);
		this.getContentPane().setLayout(layout);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(defaultsize.width/2-20,
				(int)(((double)defaultsize.height) / 1.2)));
		//Add Button functionality
		create.addActionListener(new handleCreate(this));
		addItem.addActionListener(new handleItemCreateGUI(this));
		
		//add items
		this.getContentPane().add(title);
		this.getContentPane().add(description);
		this.getContentPane().add(create);
		this.getContentPane().add(addItem);
		this.getContentPane().add(totalCost);
		
		//Set constraints
		layout.putConstraint(SpringLayout.NORTH, title, 10, SpringLayout.NORTH, this.getContentPane());
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, title, 0, SpringLayout.HORIZONTAL_CENTER, this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, description, 30, SpringLayout.NORTH, title);
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, description, 0, SpringLayout.HORIZONTAL_CENTER, title);
		layout.putConstraint(SpringLayout.NORTH, create, 10, SpringLayout.SOUTH, description);
		layout.putConstraint(SpringLayout.WEST, create, 0, SpringLayout.WEST, this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, addItem, 10, SpringLayout.SOUTH, description);
		layout.putConstraint(SpringLayout.EAST, addItem, 0, SpringLayout.EAST, this.getContentPane());
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, totalCost, 0, SpringLayout.HORIZONTAL_CENTER, this.getContentPane());
		layout.putConstraint(SpringLayout.SOUTH, totalCost, -20, SpringLayout.SOUTH, this.getContentPane());
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
