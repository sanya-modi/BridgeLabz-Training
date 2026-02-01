package com.functional_interface.cloning_prototype;

public class PrototypeApp {
	
	 public static void main(String[] args) {

	        try {
	            Prototype original = new Prototype("BaseModel", 1);

	            Prototype copy1 = (Prototype) original.clone();
	            copy1.setVersion(2);
	            Prototype copy2 = (Prototype) copy1.clone();

	            System.out.println("Original: " + original);
	            System.out.println("Copy 1  : " + copy1);
	            System.out.println("Copy 2  : " + copy2);

	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	    }

}
