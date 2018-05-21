package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.practice.model.Apple;
import com.practice.predicate.AppleGreenPredicate;
import com.practice.predicate.ApplePredicate;

public class BehaviorParametrizationUsingClass {
	
	public static void main(String a[]){
		List<Apple> listofApple = Arrays.asList(new Apple(100, "Red"), new Apple(150,"Yellow"), new Apple(150,"Green") );
		System.out.println("listofApple size"+listofApple.size());
		
		BehaviorParametrizationUsingClass test = new BehaviorParametrizationUsingClass();
	
		// hardcoded filter
		System.out.println("filtered list size"+ test.filterGreenApple(listofApple).size());
		
		
		// strategy pattern 
		System.out.println("filtered by predicate list size"+ test.filterAppleByPredicate(listofApple, new AppleGreenPredicate()));
				
	}
	
	//Standalone filter to filter only 1 set of filter 
	public List<Apple> filterGreenApple (List<Apple> rawListOfApple){
		
		List<Apple> filteredList = new ArrayList<>();
		
		for(Apple testApple : rawListOfApple){
			if(testApple.getColor().equalsIgnoreCase("green") )
				filteredList.add(testApple);
		}
		
		return filteredList;
	}
	
	
	public List<Apple> filterColorApple (List<Apple> rawListOfApple, String color){
		
		List<Apple> filteredList = new ArrayList<>();
		
		for(Apple testApple : rawListOfApple){
			if(testApple.getColor().equalsIgnoreCase(color) )
				filteredList.add(testApple);
		}
		
		return filteredList;
	}
	
	//if we need filters for other parameters:
	/*
	 * 1st solution: separate filter for every data member
	 * 2nd solution: 1 filter method to accept all data member 
	 * 
	 */

	
	//upgraded filter to accept what to filter on??  
	public List<Apple> filterAppleByPredicate (List<Apple> rawListOfApple, ApplePredicate filter){

		List<Apple> filteredList = new ArrayList<>();
		
		
		for(Apple testApple : rawListOfApple){
			if(filter.test(testApple))
				filteredList.add(testApple);
		}
		
		
		return filteredList;
	}
	
		
}
