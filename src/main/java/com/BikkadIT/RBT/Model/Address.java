package com.BikkadIT.RBT.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int addId;
	
	private String addArea;
	
	private String addCity;

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getAddArea() {
		return addArea;
	}

	public void setAddArea(String addArea) {
		this.addArea = addArea;
	}

	public String getAddCity() {
		return addCity;
	}

	public void setAddCity(String addCity) {
		this.addCity = addCity;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addArea=" + addArea + ", addCity=" + addCity + "]";
	}
	
	

}
