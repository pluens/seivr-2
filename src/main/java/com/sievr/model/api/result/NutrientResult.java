package com.sievr.model.api.result;

import com.sievr.model.api.util.UsdaNutrUtils.Measure;

public class NutrientResult implements Result {

	private int nutrient_id;
	private String name;
	private String group;
	private String unit;
	private double value;
	private Measure[] measures;
	public int getNutrient_id() {
		return nutrient_id;
	}
	public void setNutrient_id(int nutrient_id) {
		this.nutrient_id = nutrient_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Measure[] getMeasures() {
		return measures;
	}
	public void setMeasures(Measure[] measures) {
		this.measures = measures;
	}
	
}
