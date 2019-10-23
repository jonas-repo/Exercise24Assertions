package com.exercise24assertions.app;

import java.util.Scanner;

public class AssertionApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//variables
		int edad = 0;
		
		//objects
		Scanner input = new Scanner(System.in);
		
		System.out.println("Are you an adult? Input your age");
		edad = input.nextInt();
		
		assert edad > 0 : "Age not valid!!";
		
		if (edad < 18 && edad > 0) {
			System.out.println("You are and adult");
		}
		
		
	}

}
