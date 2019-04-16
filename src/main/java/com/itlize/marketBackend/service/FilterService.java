package com.itlize.marketBackend.service;

import java.util.List;

import com.itlize.marketBackend.model.Attribute;

public interface FilterService {
	List<Attribute> getFilterAttributes(int subCategoryId);
}
