package com.gamsion.chris.vecsm.gui.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.gamsion.chris.vecsm.backend.CostItem;
import com.gamsion.chris.vecsm.gui.ItemCreateGUI;
import com.gamsion.chris.vecsm.gui.PlanCreationGUI;

public class handleItemCreate implements ActionListener {
	ItemCreateGUI create;
	PlanCreationGUI pCreate;
	public handleItemCreate(PlanCreationGUI pCreate, ItemCreateGUI create) {
		this.create = create;
		this.pCreate = pCreate;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pCreate.items.add(new CostItem(create.title.getText().trim(), create.description.getText().trim(),
				Integer.parseInt(create.totalCost.getText().trim()), create.checkbox.isSelected()));
		create.dispose();
		System.out.println(pCreate.items);

	}

}
