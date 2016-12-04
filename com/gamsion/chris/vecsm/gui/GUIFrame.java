package com.gamsion.chris.vecsm.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

import com.gamsion.chris.vecsm.backend.Plan;

public class GUIFrame extends JFrame{
	Plan p = null;
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension defaultsize = toolkit.getScreenSize();
	private static final long serialVersionUID = 1L;
	public JButton plan = new JButton("Plan");
	public JButton interact = new JButton("Interact");
	
	
	
	public GUIFrame(String s){
		super(s);
		this.setupGUI();
	}
	public GUIFrame(){
		super("VECSM");
		this.setupGUI();
		
	}
	public GUIFrame(Plan p){
		super("VECSM");
		this.setupGUI();
		this.p = p;
		p.calculateSuggested();
		JOptionPane.showMessageDialog(this, String.format("You have %s free.\n%s", p.available, organizeOpt(p.optionals)));
		
	}
	public String organizeOpt(Map<String, Integer> map){
		StringBuilder sb = new StringBuilder();
		for(String key: map.keySet()){
			sb.append(String.format("You may use %s more for %s.\n", map.get(key), key));
		}
		return sb.toString().trim();
	}
	
	protected void setupGUI(){
		plan.setPreferredSize(new Dimension(300,60));
		interact.setPreferredSize(new Dimension(300,60));
		SpringLayout layout = new SpringLayout();
		setLayout(layout);
		this.getContentPane().setLayout(layout);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(defaultsize.width / 2 + 40,
				defaultsize.height / 2));
		//Add functionality to buttons
		this.plan.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new PlanCreationGUI();
			}
		});
		this.interact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new InteractGUI();
			}
		});
		
		
		
		
		this.add(plan);
		this.add(interact);
		layout.putConstraint(SpringLayout.WEST, plan, 50, SpringLayout.WEST, this.getContentPane());
		layout.putConstraint(SpringLayout.EAST, interact, -50-interact.getSize().width, SpringLayout.EAST, this.getContentPane());
		
		layout.putConstraint(SpringLayout.VERTICAL_CENTER, plan, 0, SpringLayout.VERTICAL_CENTER, this.getContentPane());
		layout.putConstraint(SpringLayout.VERTICAL_CENTER, interact, 0, SpringLayout.VERTICAL_CENTER, this.getContentPane());

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	

	
	
	
	
	
	
}
