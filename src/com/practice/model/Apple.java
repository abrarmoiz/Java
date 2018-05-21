package com.practice.model;

public class Apple {
	
	private int weight;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private String color;
	
	public Apple(int weight, String color){
		this.weight = weight;
		this.color = color;
	}
	
	
}
