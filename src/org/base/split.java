package org.base;

import java.util.LinkedHashMap;
import java.util.Map;

public class split {
	public static void main(String[] args)
	{
		String s="Learn Selenium Training Course in Chennai from India’s #1 Placement Oriented Selenium training institute with award-winning faculty, SeU - Certified Selenium Engineer (CSE), live projects and 100% assured placement support, all designed to help you become a Selenium expert";
		
		String[] s1 = s.split(" ");
		
		Map<String, Integer> mp = new LinkedHashMap<>();
		
		for (int i = 0; i < s1.length; i++)
		{
			if (mp.containsKey(s1[i])) 
			{
				Integer x = mp.get(s1[i]);
			   mp.put(s1[i], x+1);
			}
			else 
			{
				mp.put(s1[i], 1);
			}
		}
		System.out.println(mp);
	}
}
	


