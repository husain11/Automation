package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorinstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage(). window(). maximize();
		driver.get("file:///C:/Users/husai/Downloads/Automatiom.html");
		Thread.sleep(5000);
		driver.findElement(By.id("Instagram")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
