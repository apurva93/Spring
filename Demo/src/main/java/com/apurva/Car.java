package com.apurva;
import org.springframework.stereotype.Component;



public class Car implements Vehicle {

	private String name;
	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void drive(){
		System.out.println("car");
	}
}
