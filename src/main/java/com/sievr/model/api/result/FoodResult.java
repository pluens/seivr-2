package com.sievr.model.api.result;

public class FoodResult implements Result{
	private int offset;
	private String group;
	private String name;
	private String BL;
	private int ndbno;
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBL() {
		return BL;
	}
	public void setBL(String bL) {
		BL = bL;
	}
	public int getNdbno() {
		return ndbno;
	}
	public void setNdbno(int ndbno) {
		this.ndbno = ndbno;
	}
	
}
