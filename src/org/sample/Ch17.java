package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch17 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//button[text()='✕']")); 
		button.click();
		
		
		WebElement appliance = driver.findElement(By.xpath("//div[text()='Appliances']"));
		appliance.click();
		WebElement tvappl = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		a.moveToElement(tvappl).perform();
		WebElement andriod = driver.findElement(By.xpath("//a[text()='Nokia (55) 4K Android TV']"));
		a.moveToElement(andriod).perform();
		andriod.click();
		
		
	}
}
