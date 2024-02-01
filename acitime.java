package qsp;

import java.time.Duration;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class acitime {
	static { 
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.navigate().to("https://online.actitime.com/hbhatiya");
			driver.findElement(By.id("username")).sendKeys("wimeso3756@konican.com");
			driver.findElement(By.name("pwd")).sendKeys("32ypqS84");
			driver.findElement(By.xpath("//div[.='Login ']")).click();			
			//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
			//wait.until(ExpectedConditions.titleContains("Enter"));
			int i=0;
			while (i<500) {
				try {
					driver.findElement(By.id("logoutLink")).click();
					break;
				}catch (Exception e) {
					i++;
				}
			}
			//driver.findElement(By.id("logoutLink")).click();
			driver.close();
	}

}

