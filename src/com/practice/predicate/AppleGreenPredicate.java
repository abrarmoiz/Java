package com.practice.predicate;

import com.practice.model.Apple;

public class AppleGreenPredicate implements ApplePredicate{
	
	@Override
	public boolean test(Apple a){
		boolean flag = false;
			if(a.getColor().equalsIgnoreCase("Green")){
				flag = true;
			}
		return flag;
	}

}
