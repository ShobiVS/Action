package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://lh.inmakesedu.com/home");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement courses = driver.findElement(By.id("navbarDropdown"));
		a.moveToElement(courses).perform();
		Thread.sleep(2000);
		WebElement software = driver.findElement(By.xpath("(//div[@class='dropdown dropright p-0 m-0'])[10]"));
		a.moveToElement(software).perform();
		WebElement advanced = driver.findElement(By.xpath("//a[text()='ST Advanced class']"));
		a.moveToElement(advanced).perform();
		advanced.click();
		
}

}