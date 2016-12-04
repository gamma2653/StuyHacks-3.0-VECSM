package com.gamsion.chris.vecsm.gui.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import com.gamsion.chris.vecsm.backend.CostItem;
import com.gamsion.chris.vecsm.backend.Plan;
import com.gamsion.chris.vecsm.gui.PlanCreationGUI;
import com.gamsion.chris.vecsm.gui.GUIFrame;

public class handleCreate implements ActionListener{
	PlanCreationGUI create;
	public handleCreate(PlanCreationGUI create) {
		this.create = create;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String title = this.create.title.getText();
		String desc = this.create.description.getText();
		List<CostItem> items = this.create.items;
		int totalCost = Integer.parseInt(this.create.totalCost.getText());
		System.out.println(items);
		new GUIFrame(new Plan(title,desc, totalCost, items));
		
		
	}

}
