package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/husai/Downloads/Automatiom.html");
		Thread.sleep(5000);
		driver.findElement(By.name("Youtube")).click();
		Thread.sleep(5000);
		driver.close();		
	}

}
