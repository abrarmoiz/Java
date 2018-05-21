package com.practice;

interface Strategy {
	public void execute();
}


class DvlprStrategy implements Strategy{
	 
	@Override
	public void execute(){
		 System.out.println("test");
	 }
	
}