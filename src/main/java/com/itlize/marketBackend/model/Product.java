package com.itlize.marketBackend.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Product {
	private String name;
	private String description;
	private Date date;
	private String manufacturerId;
	private String saleId;
	private Map<String, String> attributes;
	private List<String> details; 
	private List<String> documentUrl;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getManufacturerId() {
		return manufacturerId;
	}
	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	public String getSaleId() {
		return saleId;
	}
	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}
	public Map<String, String> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	public List<String> getDocumentUrl() {
		return documentUrl;
	}
	public void setDocumentUrl(List<String> documentUrl) {
		this.documentUrl = documentUrl;
	}

}
