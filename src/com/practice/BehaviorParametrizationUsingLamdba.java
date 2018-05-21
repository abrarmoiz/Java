package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.practice.model.Apple;
import com.practice.predicate.AppleGreenPredicate;
import com.practice.predicate.ApplePredicate;

public class BehaviorParametrizationUsingLamdba {

	public static void main(String a[]){
		List<Apple> listofApple = Arrays.asList(new Apple(100, "Red"), new Apple(150,"Yellow"), new Apple(150,"Green") );
		System.out.println("listofApple size"+listofApple.size());
		
		BehaviorParametrizationUsingClass test = new BehaviorParametrizationUsingClass();
		System.out.println("List of green apples :" +
		test.filterAppleByPredicate(listofApple, (Apple apple)->apple.getColor().equalsIgnoreCase("Green")).size());
	//listofApple, (Apple apple)->apple.get
				
	}
	
	
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
