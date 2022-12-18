package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement alldept = driver.findElement(By.xpath("//a[@data-id='departmentsFlyout']"));
		a.moveToElement(alldept).perform();
		WebElement heatncool = driver.findElement(By.xpath("//a[@data-level='Heating & Cooling']"));
		a.moveToElement(heatncool).perform();
		WebElement air = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
		a.moveToElement(air).perform();
		WebElement portable = driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
		a.moveToElement(portable).perform();
		portable.click();
		
	}

}
