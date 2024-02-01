package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbytextfunctionlocator {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Nothing phone 2");
		driver.findElement(By.xpath("//button[@type	='submit']")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//div[text()='Nothing Phone (2) (White, 128 GB)']")).getText(); 
		System.out.println(text);
		Thread.sleep(5000);
		driver.close();
	}

}
