package com;

/*
@Author Garima
Date 16/10/2020
Code that prints the numbers 1,2,3,4,5,6,7,8,9,10
*/

public class PrintNumbers {
	public static void main(String[] args) {
		int num ;
		for (num=1 ; num<=10;num++)
		{
			if (num <= 9)
			{
				System.out.print(num + ",");
			}
			else 
			{
				System.out.print(num);
			}
		}

	}


}
