package com;

/*
@Author Garima
Date 16/10/2020
code to calculate AreaOfTriangle in which input of height and width provide by user
*/

import java.util.Scanner;

public class CalculateAreaofTriangle {

	
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please Enter width Value: ");
		    double width = scanner.nextDouble();
		    
		    System.out.println("Please Enter height Value: ");
		    double height = scanner.nextDouble();
		    	
		    double areaOfTriangle=width*height/2;
			System.out.println("Area of Triangle is "+areaOfTriangle);

		}

	}


