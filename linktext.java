package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys("1234567890");
		driver.findElement(By.linkText("Log in")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Create new account")).click();
		// driver.findElement(By.name("firstname")).click();
		Thread.sleep(7000);
		driver.findElement(By.name("firstname")).sendKeys("Boobinder");
		Thread.sleep(7000);
		// driver.findElement(By.name("lastname")).click();
		driver.findElement(By.name("lastname")).sendKeys("pussia");
		Thread.sleep(7000);
		driver.findElement(By.name("reg_email__")).sendKeys("7769256418");
		Thread.sleep(7000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("pussia123");
		Thread.sleep(7000);
		driver.findElement(By.id("day")).sendKeys("6");
		Thread.sleep(7000);
		driver.findElement(By.id("month")).sendKeys("Sep");
		Thread.sleep(7000);
		driver.findElement(By.id("year")).sendKeys("2000");
		Thread.sleep(7000);
		// driver.findElement(By.id(null))
		
		
		// driver.findElement(By.linkText("Mazda FD RX-7 Review // Legendary Car, Crazy Price")).click();
		
	}

}
