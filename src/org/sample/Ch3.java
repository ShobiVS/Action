package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement closebutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		a.moveToElement(closebutton).perform();
		closebutton.click();
		Thread.sleep(2000);
		WebElement home = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
		a.moveToElement(home).perform();
		home.click();
		
		//WebElement home1 = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[6]"));
		//a.moveToElement(home1);
		//WebElement bath = driver.findElement(By.xpath("//a[@title='Bath Towels']"));
	    //bath.click();
	    //String text = bath.getText();
	    //System.out.println(text);
	}
	

}
