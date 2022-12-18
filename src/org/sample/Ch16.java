package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch16 {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Actions a=new Actions(driver);
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 WebElement button = driver.findElement(By.xpath("//button[text()='✕']")); 
			button.click();
		 //WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		 //a.moveToElement(electronics).perform();
		 //WebElement all = driver.findElement(By.xpath("//a[text()='All']"));
		 //a.moveToElement(all).perform();
		 //all.click();
		 WebElement search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		 search.sendKeys("Realme");
		 WebElement btn = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		 btn.click();
		 Thread.sleep(2000);
		 WebElement realme = driver.findElement(By.xpath("//div[text()='realme C33 (Sandy Gold, 32 GB)']"));
		 realme.click();
		 //WebElement real = driver.findElement(By.xpath("//a[text()='Realme']"));
		 //a.moveToElement(real).perform();
		 //real.click();
	}

}
