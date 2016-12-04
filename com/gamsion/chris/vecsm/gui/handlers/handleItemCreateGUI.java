package com.gamsion.chris.vecsm.gui.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.gamsion.chris.vecsm.gui.PlanCreationGUI;
import com.gamsion.chris.vecsm.gui.ItemCreateGUI;

public class handleItemCreateGUI implements ActionListener{
	PlanCreationGUI create;
	
	public handleItemCreateGUI(PlanCreationGUI create) {
		this.create = create;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		new ItemCreateGUI(create);
		
	}

}
