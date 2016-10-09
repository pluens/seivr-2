package sievr.com.model.api.util.UsdaNutrUtils;

import sievr.com.model.api.result.Result;
import sievr.com.model.api.util.ResultReportWrapper;

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
