package com.arcesi.gestionStock.enums;

public enum TypeAdresseEnum {

	BILLING("BILLING"),SHIPPING("SHIPPING");
	
	private final String  name;
	
	private TypeAdresseEnum(String s) {
		this.name=s;
	}
	 public boolean equalsName(String otherName) {
	        // (otherName == null) check is not needed because name.equals(null) returns false 
	        return name.equals(otherName);
	    }

	    public String toString() {
	       return this.name;
	    }
	
}
