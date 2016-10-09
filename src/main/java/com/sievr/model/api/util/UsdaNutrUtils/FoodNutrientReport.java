package com.sievr.model.api.util.UsdaNutrUtils;

import com.sievr.model.api.result.Result;
import com.sievr.model.api.util.ResultReportWrapper;

public class FoodNutrientReport implements ResultReportWrapper{
	private FoodNutrientInfo report;
	@Override
	public Result[] getResults() {
		
		return report.getResults();
	}
	public FoodNutrientInfo getReport() {
		return report;
	}
	public void setReport(FoodNutrientInfo report) {
		this.report = report;
	}

}
