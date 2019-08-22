package com.go4safe.model;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BikeSearchDetails {
	private long id;
	private String bikeNo;
	private String bikeCompany;
	private String bikeColor;
	private String bikeModel;	 
	private String comment;
	
	public BikeSearchDetails() {
		
	}
	public BikeSearchDetails(long id, String bikeNo, String bikeColor,String bikeCompany, String bikeModel, String comment) {
		super();
		this.id = id;
		this.bikeNo = bikeNo;
		this.bikeColor = bikeColor;
		this.bikeCompany=bikeCompany;
		this.bikeModel = bikeModel;
		this.comment = comment;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	public String getBikeColor() {
		return bikeColor;
	}
	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
	}
	public String getBikeModel() {
		return bikeModel;
	}
	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getBikeCompany() {
		return bikeCompany;
	}
	public void setBikeCompany(String bikeCompany) {
		this.bikeCompany = bikeCompany;
	}
	
	
}
