package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement place1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bank, place1).perform();
		Thread.sleep(3000);
		WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement place2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		a.dragAndDrop(sales, place2).perform();
	}

}
