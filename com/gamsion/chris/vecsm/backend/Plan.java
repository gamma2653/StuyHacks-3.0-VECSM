package com.gamsion.chris.vecsm.backend;

import java.util.List;

public class Plan {
	public String title;
	public String description;
	public List<CostItem> items;
	int totalBudget;
	public Plan(){
		this.title = null;
		this.description = null;
		this.items = null;
	}
	public Plan(String title){
		this.title = title;
		this.description = null;
		
	}
	public Plan(String title, String description){
		this.title = title;
		this.description = description;
		this.items = null;
	}
	public Plan(String title, String description, CostItem... items){
		this.title = title;
		this.description = description;
		for(CostItem i : items){
			this.items.add(i);
		}
	}
	public Plan(String title, String description, List<CostItem> items){
		this.title = title;
		this.description = description;
		this.items.addAll(items);
	}

	
}
