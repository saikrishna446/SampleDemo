package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IE_Lanch {

	@Test
	public static void browser() throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "E:\\Drivers\\IEDriverServer.exe");

		// Instantiate a IEDriver class.
		WebDriver driver = new InternetExplorerDriver();

		// Launch Website
		driver.navigate().to("https://www.facebook.com/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Click on the search text box and send value
		
		driver.findElement(By.id("email")).sendKeys("hjghsgjfgjhgj");

		// Click on the search button
//		driver.findElement(By.name("btnK")).click();
	}

}
