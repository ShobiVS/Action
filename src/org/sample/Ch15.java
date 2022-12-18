package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch15 {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Actions a=new Actions(driver);
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 WebElement button = driver.findElement(By.xpath("//button[text()='✕']")); 
			button.click();
		 WebElement toy = driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']"));
		 a.moveToElement(toy).perform();
		 WebElement toy1 = driver.findElement(By.xpath("//a[text()='Toys & School Supplies']"));
		 a.moveToElement(toy1).perform();
		 WebElement rmt = driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		 a.moveToElement(rmt).perform();
		 rmt.click();
	}

}
