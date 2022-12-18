package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch12 {
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 Actions a=new Actions(driver);
	 driver.get("https://www.amazon.in");
	 driver.manage().window().maximize();
	 WebElement sign = driver.findElement(By.xpath("(//span[text()='Hello, sign in'])[1]"));
	 a.moveToElement(sign).perform();
	 //sign.click();
	 WebElement reg = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
	 a.moveToElement(reg).perform();
	 reg.click();
	 WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First and last name']"));
	 a.moveToElement(firstname).perform();
	 firstname.sendKeys("Shobi V S ");
	 WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Mobile number']"));
	 mobile.sendKeys("6382975208");
	 WebElement email = driver.findElement(By.xpath("//input[@autocomplete='email']"));
	 email.sendKeys("studywith@gmail.com");
	 WebElement pwd = driver.findElement(By.xpath("//input[@id='ap_password']"));
	 pwd.sendKeys("jgsjhdvg");
	 Thread.sleep(3000);
	 WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
	 cont.click();
	}

}
