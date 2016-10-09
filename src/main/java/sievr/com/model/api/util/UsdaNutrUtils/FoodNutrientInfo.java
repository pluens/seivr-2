package sievr.com.model.api.util.UsdaNutrUtils;

import sievr.com.model.api.result.Result;
import sievr.com.model.api.util.ResultReportWrapper;

public class FoodNutrientInfo implements ResultReportWrapper{

	private int sr;
	private String type;
	private NutrientFood food;
	private String[] footnotes;



	@Override
	public Result[] getResults() {
		return food.getResults();
	}

	public int getSr() {
		return sr;
	}

	public void setSr(int sr) {
		this.sr = sr;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public NutrientFood getFood() {
		return food;
	}

	public void setFood(NutrientFood food) {
		this.food = food;
	}
	public String[] getFootnotes() {
		return footnotes;
	}

	public void setFootnotes(String[] footnotes) {
		this.footnotes = footnotes;
	}
	
}
