package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myownprac {
	static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.navigate().to("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(5000);
		drive.findElement(By.name("name")).sendKeys("Husain");
		Thread.sleep(3000);
		drive.findElement(By.name("email")).sendKeys("trial@gmail.com");
		Thread.sleep(3000);
		drive.findElement(By.name("password")).sendKeys("trail123");
		Thread.sleep(3000);
		drive.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		drive.findElement(By.name("email")).sendKeys("trial@gmail.com");
		Thread.sleep(3000);
		drive.findElement(By.name("password")).sendKeys("trail123");
		Thread.sleep(3000);
		drive.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(3000);
		
	}

}
