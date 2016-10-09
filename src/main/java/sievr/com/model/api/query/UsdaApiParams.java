package sievr.com.model.api.query;

import java.util.HashMap;

public class UsdaApiParams implements ApiParams{
	protected final String api_key = "Q2AXZehX616l1ZcvmxW16x5Q0z8gQuziuuTzhxk6";
	private String q;
	private String ds;
	private String fg;
	private String sort;
	private int max;
	private int offset;
	private String format;
	@Override
	public String[] getParamNames() {
		String[] params = {"q","ds","fg","sort","max","offset","format"};
		return params;
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
	public String getQ() {
		return q;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public String getDs() {
		return ds;
	}
	public void setDs(String ds) {
		this.ds = ds;
	}
	public String getFg() {
		return fg;
	}
	public void setFg(String fg) {
		this.fg = fg;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
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
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getApi_key() {
		return api_key;
	}

	
}
