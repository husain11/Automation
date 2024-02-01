package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aae rupali");	
		driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@title='Success Story Of A Cringe Pop Artist']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();		
	}
}
	