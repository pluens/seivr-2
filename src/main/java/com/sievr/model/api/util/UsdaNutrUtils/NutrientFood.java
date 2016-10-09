package com.sievr.model.api.util.UsdaNutrUtils;


import com.sievr.model.api.result.NutrientResult;
import com.sievr.model.api.result.Result;
import com.sievr.model.api.util.ResultReportWrapper;

public class NutrientFood implements ResultReportWrapper{
	
	private int ndbno;
	private String name;
	private String ds;
	private NutrientResult[] nutrients;
	@Override
	public Result[] getResults() {
		
		return nutrients;
	}
	public int getNdbno() {
		return ndbno;
	}
	public void setNdbno(int ndbno) {
		this.ndbno = ndbno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDs() {
		return ds;
	}
	public void setDs(String ds) {
		this.ds = ds;
	}
	public NutrientResult[] getNutrients() {
		return nutrients;
	}
	public void setNutrients(NutrientResult[] nutrients) {
		this.nutrients = nutrients;
	}
	
	
}
