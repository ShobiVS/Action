package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions a =new Actions(driver);
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		a.moveToElement(mobile);
		mobile.click();
		Thread.sleep(2000);
		WebElement apple = driver.findElement(By.xpath("//a[text()='Apple']"));
		a.moveToElement(apple);
		apple.click();
	}

}
