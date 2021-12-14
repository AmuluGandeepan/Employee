package org.base;

import java.util.Scanner;

public class Product
{
	public static void main(String[] args)
	{
		int number;
		Scanner S= new Scanner(System.in);
		System.out.println("Divisable By 3 & 5: ");
		number = S.nextInt();
		
			if (number%3==0&&number%5==0)
			{
				System.out.println("Hii");
				
				
			}
			else {
				if(number%3==0)
		    {
				System.out.println("Hello");
				
			}
				else
				{
					System.out.println("welcome");
				}
				
			}
			
				
			
		
			
		}
		 

}
