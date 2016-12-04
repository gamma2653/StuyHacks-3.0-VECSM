package com.gamsion.chris.vecsm.backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Plan {
	public String title;
	public String description;
	public int budget = 0;
	public List<CostItem> items = new ArrayList<CostItem>();
	public Map<String, Integer> optionals = new HashMap<String, Integer>();
	public int available = 0;
	int totalBudget;
	public Plan(){
		this.title = null;
		this.description = null;
		this.items = null;
	}
	public Plan(String title, int budget){
		this.budget = budget;
		this.title = title;
		this.description = null;
		
	}
	public Plan(String title, String description, int budget){
		this.budget = budget;
		this.title = title;
		this.description = description;
		this.items = null;
	}
	public Plan(String title, String description, int budget, CostItem... items){

		this.budget = budget;
		this.title = title;
		this.description = description;
		for(CostItem i : items){
			this.items.add(i);
		}
	}
	public Plan(String title, String description, int budget, List<CostItem> items){
		this.budget = budget;
		this.title = title;
		this.description = description;
		this.items.addAll(items);
	}
	
	public void calculateSuggested(){
		List<Integer> mandatories = new ArrayList<Integer>();
		for(CostItem i : items){
			mandatories.add(i.totalCost);
		}
		available = totalBudget-sum(mandatories);
		for(CostItem i : items){
			optionals.put(i.title, i.totalCost);
		}
		
		
		
		
	}
	public int sum(List<Integer> num){
		int sum = 0;
		for(Integer i : num){
			sum+=i;
		}
		return sum;
	}

	
}
