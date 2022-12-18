package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement dept = driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(dept).perform();
		WebElement paint = driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(paint).perform();
		WebElement interior = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(interior).perform();
		WebElement ceiling = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		a.moveToElement(ceiling).perform();
		ceiling.click();
		//driver.quit();)
	
	}

}
