package com.functional_interface.sensitive_data_tagging;

public class UserProfile implements Encrypted{
	
	String name;
	int age;
	
    UserProfile(String name, int age){
    	this.name = name;
    	this.age = age;
    }

}
