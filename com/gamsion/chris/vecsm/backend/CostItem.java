package com.gamsion.chris.vecsm.backend;

public class CostItem {
	String title;
	String desc;
	int totalCost;
	boolean mandatory;
	
	int suggestedSpent;
	int spent;
	
	public CostItem(String title, String desc, int totalCost, boolean mandatory){
		this.title = title;
		this.desc = desc;
		this.totalCost = totalCost;
		this.mandatory = mandatory;
	}
}
