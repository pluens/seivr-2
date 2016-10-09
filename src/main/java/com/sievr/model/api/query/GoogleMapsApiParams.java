package com.sievr.model.api.query;

import java.util.HashMap;

public class GoogleMapsApiParams implements ApiParams{
	protected final String key = "AIzaSyCHPpUjN7IWFoGZ3E4L1BqUVAPdnFfSeL0";
	private String location;
	private long radius;
	private String keyword;
	@Override
	public String[] getParamNames() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public HashMap<String, String> getAllParams() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getApiName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getRadius() {
		return radius;
	}
	public void setRadius(long radius) {
		this.radius = radius;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getKey() {
		return key;
	}


	
}
