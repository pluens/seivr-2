package com.sievr.model;

public class NutritionParams {
	private int minCalorie;
	private int maxCalorie;
	private String[][] nutrientRestrictions;
	public int getMinCalorie() {
		return minCalorie;
	}
	public void setMinCalorie(int minCalorie) {
		this.minCalorie = minCalorie;
	}
	public int getMaxCalorie() {
		return maxCalorie;
	}
	public void setMaxCalorie(int maxCalorie) {
		this.maxCalorie = maxCalorie;
	}
	public String[][] getNutrientRestrictions() {
		return nutrientRestrictions;
	}
	public void setNutrientRestrictions(String[][] nutrientRestrictions) {
		this.nutrientRestrictions = nutrientRestrictions;
	}
	
}
