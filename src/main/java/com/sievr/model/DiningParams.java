package com.sievr.model;

import com.sievr.model.api.query.GoogleMapsApiParams;
import com.sievr.model.api.query.GoogleSearchApiParams;
import com.sievr.model.api.query.UsdaApiParams;
import com.sievr.model.api.query.UsdaFoodNutrientReportParams;

public class DiningParams {
	
	
	private LocationParams location;
	private NutritionParams nutrition;
	private StyleParams style;
	
	private GoogleMapsApiParams mapParams;
	private GoogleSearchApiParams searchParams;
	private UsdaApiParams usdaParams;
	private UsdaFoodNutrientReportParams nutrientParams;
	
	
	public GoogleMapsApiParams getMapParams() {
		return mapParams;
	}
	public void setMapParams(GoogleMapsApiParams mapsParams) {
		this.mapParams = mapsParams;
	}
	public GoogleSearchApiParams getSearchParams() {
		return searchParams;
	}
	public void setSearchParams(GoogleSearchApiParams searchParams) {
		this.searchParams = searchParams;
	}
	public UsdaApiParams getUsdaParams() {
		return usdaParams;
	}
	public void setUsdaParams(UsdaApiParams usdaParams) {
		this.usdaParams = usdaParams;
	}
	public UsdaFoodNutrientReportParams getNutrientParams() {
		return nutrientParams;
	}
	public void setNutrientParams(UsdaFoodNutrientReportParams nutrientParams) {
		this.nutrientParams = nutrientParams;
	}
	public LocationParams getLocation() {
		return location;
	}
	public void setLocation(LocationParams location) {
		this.location = location;
	}
	public NutritionParams getNutrition() {
		return nutrition;
	}
	public void setNutrition(NutritionParams nutrition) {
		this.nutrition = nutrition;
	}
	public StyleParams getStyle() {
		return style;
	}
	public void setStyle(StyleParams style) {
		this.style = style;
	}

	
	
	

}
