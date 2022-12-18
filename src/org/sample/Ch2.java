package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		driver.manage().window().maximize();
		WebElement prime1 = driver.findElement(By.xpath("//span[text()='Prime']"));
		a.moveToElement(prime1).perform();
		//WebElement click = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		WebElement click = driver.findElement(By.id("nav-flyout-amazonprime"));
		a.moveToElement(click).perform();
		
	}

}
