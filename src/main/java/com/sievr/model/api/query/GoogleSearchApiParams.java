package com.sievr.model.api.query;

import java.util.HashMap;

public class GoogleSearchApiParams implements ApiParams{
	private String q;
	@Override
	public String[] getParamNames() {
		String[] params = {"q"};
		return params;
	}

	@Override
	public HashMap<String, String> getAllParams() {
		HashMap<String,String> allParams = new HashMap<String,String>();
		allParams.put("q", q);
		return null;
	}

	@Override
	public String getApiName() {
		return "Google Search";
	}

}
