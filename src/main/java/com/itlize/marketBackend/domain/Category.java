package com.itlize.marketBackend.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cateGoryId;
	@Column
	private String categoryName;

	public int getCateGoryId() {
		return cateGoryId;
	}

	public void setCateGoryId(int cateGoryId) {
		this.cateGoryId = cateGoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
