package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinktext {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Husain");
		Thread.sleep(5000);
		driver.findElement(By.name("lastname")).sendKeys("Bhatiya");
		Thread.sleep(5000);
		driver.findElement(By.name("reg_email__")).sendKeys("9004016055");
		Thread.sleep(5000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("husain123");
		Thread.sleep(5000);
		driver.findElement(By.name("birthday_day")).sendKeys("12");
		Thread.sleep(5000);
		driver.findElement(By.name("birthday_month")).sendKeys("Aug");
		Thread.sleep(5000);
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		Thread.sleep(5000);
		driver.findElement(By.name("sex"));
	}

}