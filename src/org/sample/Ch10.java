
package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement mobile = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
	    a.moveToElement(mobile).perform();
	    WebElement topsell = driver.findElement(By.xpath("//span[text()='Top Selling Wearables']"));
	    a.moveToElement(topsell);
	    topsell.click();
	}
	

}
