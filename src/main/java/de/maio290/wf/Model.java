package de.maio290.wf;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Model {
	
	
	String name;
	String attribute;
	@JsonIgnore
	int number;
	
	public Model(String name, String attribute, int number)
	{
		this.name = name;
		this.attribute = attribute;
		this.number = number;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
