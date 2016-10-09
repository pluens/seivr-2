package com.sievr.model.api.util.UsdaUtils;

import com.sievr.model.api.result.Result;
import com.sievr.model.api.util.ResultReportWrapper;

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
