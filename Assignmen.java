package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmen {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(5000);
		driver.findElement(By.name("name")).sendKeys("Husain");
		driver.findElement(By.name("email")).sendKeys("Bhatiya@gmail.com");
		driver.findElement(By.name("password")).sendKeys("husain123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
	}

}
