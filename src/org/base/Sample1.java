package org.base;

public class Sample1 {
public static void main(String[] args) {
	int number=153;
	int result=0;
	int reverse=number;
	while (number>0) 
	{
	 int a = number%10;
	number = number/10;
	result = result+(a*a*a);
	}
	if (reverse==result) 
	{
		System.out.println("armstrong");
	} 
	else 
	{
		System.out.println("Not armstrong");
	}
}
}
