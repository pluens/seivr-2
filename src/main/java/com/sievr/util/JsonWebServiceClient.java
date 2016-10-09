package com.sievr.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import sievr.com.model.DiningParams;
import sievr.com.model.api.query.ApiParams;
import sievr.com.model.api.query.GoogleMapsApiParams;
import sievr.com.model.api.query.GoogleSearchApiParams;
import sievr.com.model.api.query.UsdaApiParams;
import sievr.com.model.api.query.UsdaFoodNutrientReportParams;
import sievr.com.model.api.result.FoodResult;

import sievr.com.model.api.result.Result;

import sievr.com.model.api.util.ResultReportWrapper;
import sievr.com.model.api.util.WordResultWrapper;
import sievr.com.model.api.util.MapsUtils.LocationReportWrapper;
import sievr.com.model.api.util.UsdaNutrUtils.FoodNutrientReport;
import sievr.com.model.api.util.UsdaUtils.FoodResultWrapperWrapper;

public class JsonWebServiceClient {
	private ObjectMapper mapper;
	private final URL mapsApiUrl;
	private final URL usdaApiUrl;
	private final URL searchApiUrl;
	private final URL foodReport;
	public JsonWebServiceClient() throws MalformedURLException{
		this.mapsApiUrl = new URL("https://maps.googleapis.com/maps/api/place/nearbysearch/");
		this.usdaApiUrl = new URL("http://api.nal.usda.gov/ndb/search/");
		this.searchApiUrl = new URL("http://www.google.com/");
		this.mapper = new ObjectMapper();
		this.foodReport = new URL("http://api.nal.usda.gov/ndb/reports/");
	}
	public Result[] getMatchingRestaurants(DiningParams params) throws IOException{
		ArrayList<Result> restaurantList = new ArrayList<Result>();
		Result[] initialRestaurants = (Result[]) sendQuery(params.getMapParams());
		UsdaApiParams usdaParams = params.getUsdaParams(); 
		usdaParams.setSort("r");
		for(Result r: initialRestaurants){
			usdaParams.setQ(r.getName());
			FoodResult[] foods = (FoodResult[]) sendQuery(usdaParams);
			if(foods.length > 30){
				for(int i = 0; i <10; i++){
					
					//do filtering
				}
			}
			
		}
		Result[] restaurants = new Result[restaurantList.size()];
		return restaurantList.toArray(restaurants);
	}
	public Result[] sendQuery(ApiParams params) throws IOException{
		URL url;
		Class<?> resultClass;
		if(params.getClass() == GoogleMapsApiParams.class){
			url = mapsApiUrl;
			resultClass = LocationReportWrapper.class;
			}
		else if(params.getClass() == UsdaApiParams.class){ 
			url = usdaApiUrl;
			resultClass = FoodResultWrapperWrapper.class;
			}
		else if(params.getClass() == GoogleSearchApiParams.class){ 
			url = searchApiUrl;
			resultClass = WordResultWrapper.class;
			}
		else if(params.getClass() == UsdaFoodNutrientReportParams.class){
			url = foodReport;
			resultClass = FoodNutrientReport.class;
		}
		else throw new IOException();
		URLConnection connect = url.openConnection();
		for(Map.Entry<String, String> e: params.getAllParams()
					.entrySet()){
			connect.setRequestProperty(e.getKey(), e.getValue());
		}
		ResultReportWrapper resultWrapper =(ResultReportWrapper) mapper.readValue(connect.getInputStream(), resultClass);
		return resultWrapper.getResults();
		
	}
	public URL getMapsApiUrl() {
		return mapsApiUrl;
	}
	public URL getUsdaApiUrl() {
		return usdaApiUrl;
	}
	public URL getSearchApiUrl() {
		return searchApiUrl;
	}

}
