package com.sievr.model.api.util.MapsUtils;



import com.sievr.model.api.result.Location;
import com.sievr.model.api.result.Result;
import com.sievr.model.api.util.ResultReportWrapper;

public class LocationReportWrapper implements ResultReportWrapper{
	private String[] html_attributions;
	public String[] getHtml_attributions() {
		return html_attributions;
	}

	public void setHtml_attributions(String[] html_attributions) {
		this.html_attributions = html_attributions;
	}

	public Location[] getLocations() {
		return locations;
	}

	public void setLocations(Location[] locations) {
		this.locations = locations;
	}

	private Location[] locations;

	@Override
	public Result[] getResults() {
		
		return locations;
	}

	

}
