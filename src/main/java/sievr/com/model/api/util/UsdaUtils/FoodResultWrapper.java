package sievr.com.model.api.util.UsdaUtils;



import sievr.com.model.api.result.FoodResult;
import sievr.com.model.api.result.Result;
import sievr.com.model.api.util.ResultReportWrapper;

public class FoodResultWrapper implements ResultReportWrapper{
	
	private String q;
	private int sr;
	private String ds;
	private int start;
	private int end;
	private int total;
	private String group;
	private String sort;
	private FoodResult[] item;
	@Override
	public Result[] getResults() {
		
		return item;
	}


	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public int getSr() {
		return sr;
	}

	public void setSr(int sr) {
		this.sr = sr;
	}

	public String getDs() {
		return ds;
	}

	public void setDs(String ds) {
		this.ds = ds;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public FoodResult[] getItem() {
		return item;
	}

	public void setItem(FoodResult[] item) {
		this.item = item;
	}

}
