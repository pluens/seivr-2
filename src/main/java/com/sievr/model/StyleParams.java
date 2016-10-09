package com.sievr.model;

public class StyleParams {
	private boolean branded;
	private double priceMin;
	private double priceMas;
	private String[] tags;
	
	public boolean isBranded() {
		return branded;
	}
	public void setBranded(boolean branded) {
		this.branded = branded;
	}
	public double getPriceMin() {
		return priceMin;
	}
	public void setPriceMin(double priceMin) {
		this.priceMin = priceMin;
	}
	public double getPriceMas() {
		return priceMas;
	}
	public void setPriceMas(double priceMas) {
		this.priceMas = priceMas;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
}
