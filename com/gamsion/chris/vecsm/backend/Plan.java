package com.gamsion.chris.vecsm.backend;

import java.util.List;

public class Plan {
	public String title;
	public String description;
	public List<CostItems> items;
	public Plan(){
		
	}
	public Plan(String title){
		this.title = title;
	}
	public Plan(String title, String description){
		this.title = title;
		this.description = description;
	}
	public Plan(String title, String description, CostItems... items){
		this.title = title;
		this.description = description;
		for(CostItems i : items){
			this.items.add(i);
		}
	}
	public Plan(String title, String description, List<CostItems> items){
		this.title = title;
		this.title = title;
		this.description = description;
		this.items.addAll(items);
	}

	
}
