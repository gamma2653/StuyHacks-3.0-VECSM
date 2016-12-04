package com.gamsion.chris.vecsm.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import com.gamsion.chris.vecsm.gui.handlers.handleItemCreate;

public class ItemCreateGUI extends JFrame {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension defaultsize = toolkit.getScreenSize();
	private static final long serialVersionUID = 1L;
	PlanCreationGUI createGUI;
	public JTextField title = new JTextField("Enter a title.", 30);
	public JTextField totalCost = new JTextField("Enter total cost of this item.", 30);
	public JCheckBox mandatoryBox = new JCheckBox("Mandatory payment");
	public JTextArea description = new JTextArea();
	public JButton create = new JButton("Create");
	public JLabel mandatoryLbl = new JLabel("Mandatory Payment");

	public ItemCreateGUI(PlanCreationGUI create) {
		super("VECSM Creation GUI...");
		this.createGUI = create;
		this.setupGUI();
	}

	public void setupGUI() {
		description.setPreferredSize(new Dimension(600, 400));
		create.setPreferredSize(new Dimension(200,60));
		mandatoryBox.setPreferredSize(new Dimension(20, 20));
		
		SpringLayout layout = new SpringLayout();
		setLayout(layout);
		this.getContentPane().setLayout(layout);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(defaultsize.width / 2 - 20, (int) (((double) defaultsize.height) / 1.2)));
		// Add Button functionality
		create.addActionListener(new handleItemCreate(createGUI, this));
		
		
		//add items
		this.getContentPane().add(title);
		this.getContentPane().add(description);
		this.getContentPane().add(create);
		this.getContentPane().add(totalCost);
		this.getContentPane().add(mandatoryBox);
		this.getContentPane().add(mandatoryLbl);
		
		//Set constraints
		layout.putConstraint(SpringLayout.NORTH, title, 10, SpringLayout.NORTH, this.getContentPane());
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, title, 0, SpringLayout.HORIZONTAL_CENTER, this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, description, 30, SpringLayout.NORTH, title);
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, description, 0, SpringLayout.HORIZONTAL_CENTER, title);
		layout.putConstraint(SpringLayout.NORTH, create, 10, SpringLayout.SOUTH, description);
		layout.putConstraint(SpringLayout.WEST, create, 0, SpringLayout.WEST, this.getContentPane());
		layout.putConstraint(SpringLayout.WEST, totalCost, 10, SpringLayout.EAST, create);
		layout.putConstraint(SpringLayout.VERTICAL_CENTER, totalCost, -20, SpringLayout.VERTICAL_CENTER, create);
		layout.putConstraint(SpringLayout.WEST, mandatoryBox, 10, SpringLayout.WEST, totalCost);
		layout.putConstraint(SpringLayout.NORTH, mandatoryBox, 10, SpringLayout.SOUTH, totalCost);
		layout.putConstraint(SpringLayout.WEST, mandatoryLbl, 10, SpringLayout.EAST, mandatoryBox);
		layout.putConstraint(SpringLayout.VERTICAL_CENTER, mandatoryLbl, 0, SpringLayout.VERTICAL_CENTER, mandatoryBox);
		
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
