package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(sports);
		sports.click();
		WebElement weight = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		a.moveToElement(weight);
		weight.click();
		
	}

}
