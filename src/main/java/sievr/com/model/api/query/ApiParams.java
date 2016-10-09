package sievr.com.model.api.query;

import java.util.HashMap;

public interface ApiParams {
	 public abstract String[] getParamNames();
	 public  abstract HashMap<String, String> getAllParams();
	 public  abstract String getApiName();
	 
}
