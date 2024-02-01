package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage(). window().maximize();
		driver.navigate().to("file:///C:/Users/husai/Downloads/Automatiom.html");
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
