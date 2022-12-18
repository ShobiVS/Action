package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch13 {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\SampleAction\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Actions a=new Actions(driver);
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 //WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
		 //sell.click();
		 WebElement sign = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		 a.moveToElement(sign).perform();
		 WebElement signIn = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		 a.moveToElement(signIn).perform();
		 signIn.click();
		 WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		 email.sendKeys("6382975208");
		 WebElement submit = driver.findElement(By.xpath("//input[@id='continue']"));
		 submit.click();
		 WebElement pwd = driver.findElement(By.xpath("//input[@id='ap_password']"));
		 pwd.sendKeys("S031093*");
		 WebElement sub = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		 sub.click();
		 WebElement Indira = driver.findElement(By.xpath("//span[text()='Hello, Indira']"));
		 a.moveToElement(Indira).perform();
		 WebElement seller = driver.findElement(By.xpath("//span[text()='Your Seller Account']"));
		 seller.click();
		 

}
}
