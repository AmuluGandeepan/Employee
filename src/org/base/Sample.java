package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\Amulu\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/webtable/");
		driver.manage().window().maximize();
		List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
		
		for (int i =tableRows.size()-1 ; i >=0; i--) {
			String text2 = tableRows.get(i).getText();
			System.out.println(text2);
		}
			
		
//		for (int i = 0; i<tableRows.size(); i++) {
//			String text = tableRows.get(i).getText();
//			System.out.println(text);
//		}
//		
		driver.quit();
		
	
		}}

	
	

