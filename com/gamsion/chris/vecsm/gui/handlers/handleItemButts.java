package com.gamsion.chris.vecsm.gui.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.gamsion.chris.vecsm.backend.CostItem;
import com.gamsion.chris.vecsm.gui.PlanCreationGUI;

public class handleItemButts implements ActionListener{
	PlanCreationGUI create;
	CostItem item;
	public handleItemButts(PlanCreationGUI create, CostItem item) {
		this.create = create;
		this.item = item;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}

}