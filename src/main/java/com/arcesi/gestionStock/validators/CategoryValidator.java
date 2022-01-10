package com.arcesi.gestionStock.validators;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.arcesi.gestionStock.dto.CategoryDTO;

public class CategoryValidator {

	public static List<String> validate(CategoryDTO categoryDTO){
		List<String> errors=new ArrayList<String>();
		if(StringUtils.hasLength(categoryDTO.getCodeCategorie()))
		{
			errors.add("Le code Catégorie ne peut pas être null ");
		}
		
		return errors;
	}
}
