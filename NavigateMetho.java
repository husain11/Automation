package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMetho {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage(). window(). maximize();
		driver.navigate().to("file:///C:/Users/husai/Downloads/Automatiom.html");
		driver.findElement(By.id("Youtube")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("Instagram")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
	}
}
