package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions a=new Actions(driver);
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		WebElement womenfshn = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		a.moveToElement(womenfshn).perform();
		WebElement heels = driver.findElement(By.xpath("//span[text()='Heels']"));
		a.moveToElement(heels).perform();
		heels.click();
	}

}
