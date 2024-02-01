package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstselectedoption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/?scenario=1");
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		driver.findElement(By.linkText("Multi Select")).click();
		WebElement country = driver.findElement(By.id("select-multiple-native"));
		Select s=new Select(country);					
		s.selectByIndex(5);
		s.selectByIndex(4);
		s.selectByIndex(7);
		s.selectByIndex(0);
		String option = s.getFirstSelectedOption().getText();
		System.out.println(option);
		Thread.sleep(5000);
		driver.close();
	}

}
