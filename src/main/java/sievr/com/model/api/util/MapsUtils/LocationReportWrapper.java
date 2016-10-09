package sievr.com.model.api.util.MapsUtils;



import sievr.com.model.api.result.Location;
import sievr.com.model.api.result.Result;
import sievr.com.model.api.util.ResultReportWrapper;

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
