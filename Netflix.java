package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=d7ponUdlFLw");
		String title = driver.getTitle();
		String title1 = driver.getCurrentUrl();
		String source = driver.getPageSource();
		System.out.println(title);
		System.out.println(title1);
		System.out.println(source);
		Thread.sleep(1000);
		driver.close();
	}
}
