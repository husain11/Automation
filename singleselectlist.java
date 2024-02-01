package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselectlist {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		driver.findElement(By.id("phone")).sendKeys("9004016055");
		WebElement element1 = driver.findElement(By.xpath("//select[@id='select2']"));
		Thread.sleep(3000);
		Select p = new Select(element1);
		p.selectByIndex(1);
		WebElement element = driver.findElement(By.xpath("//select[@id='select3']"));
		Thread.sleep(3000);
		Select s=new Select(element);
		s.selectByIndex(7);
		WebElement element2 = driver.findElement(By.xpath("//select[@id='select5']"));
		Select c = new Select(element2);
		c.selectByValue("Maharashtra");
		WebElement element3 =driver.findElement(By.xpath("(//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150'])[4]"));
		Select z = new Select(element3);
		z.selectByValue("Thane");
		Thread.sleep(5000);
		WebElement element4 = driver.findElement(By.xpath("//select[@id='select7']"));
		Select h = new Select(element4);
		h.selectByValue("2");
		driver.findElement(By.id("continuebtn")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
