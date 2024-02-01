package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonsendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hp laptops");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("puisg-col-inner")).click();
		// driver.findElement();
		// Thread.sleep(5000);
		// driver.close();

	}

}
