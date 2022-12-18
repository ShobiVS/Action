package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//button[text()='✕']"));
		button.click();
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		a.moveToElement(fashion).perform();
		WebElement footwr = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		a.moveToElement(footwr).perform();
		WebElement flat = driver.findElement(By.xpath("//a[text()='Women Flats']"));
		a.moveToElement(flat).perform();
		flat.click();
	}
}
