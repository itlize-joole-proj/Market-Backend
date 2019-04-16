package com.itlize.marketBackend.service;

import java.util.List;

import com.itlize.marketBackend.model.Attribute;
import com.itlize.marketBackend.model.AttributeType;

public interface FilterService {
	
	List<Attribute> getFilterAttributes(int subCategoryId);
	List<AttributeType> getAllAttributeTypes();
	
}
