package sievr.com.model.api.util.UsdaUtils;

import sievr.com.model.api.result.Result;
import sievr.com.model.api.util.ResultReportWrapper;

public class FoodResultWrapperWrapper implements ResultReportWrapper {
	private FoodResultWrapper list;

	public FoodResultWrapper getList() {
		return list;
	}

	public void setList(FoodResultWrapper list) {
		this.list = list;
	}

	@Override
	public Result[] getResults() {
		
		return list.getResults();
	}
}
