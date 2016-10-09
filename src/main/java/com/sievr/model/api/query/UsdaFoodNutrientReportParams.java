package com.sievr.model.api.query;

import java.util.HashMap;

public class UsdaFoodNutrientReportParams implements ApiParams{
	private final String api_key = "Q2AXZehX616l1ZcvmxW16x5Q0z8gQuziuuTzhxk6";
	private String lt;
	private int max;
	private int offset;
	private String sort;
	private String format;
	@Override
	public String[] getParamNames() {
		String[] params = {"api_key", "lt","max","offset","sort","format"};
		return params;
	}
	@Override
	public HashMap<String, String> getAllParams() {
		HashMap<String, String> allParams = new HashMap<String,String>();
		allParams.put("api_key", api_key);
		allParams.put("lt", lt);
		allParams.put("max", Integer.toString(max));
		allParams.put("offset", Integer.toString(offset));
		allParams.put("sort", sort);
		allParams.put("format", format);
		return allParams;
	}
	@Override
	public String getApiName() {
		
		return "USDA Food Report";
	}
	public String getLt() {
		return lt;
	}
	public void setLt(String lt) {
		this.lt = lt;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
}
