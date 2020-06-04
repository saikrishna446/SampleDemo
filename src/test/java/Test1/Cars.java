package Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Cars {

	@Test
	public void Test12() throws InterruptedException {
		
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.carwale.com/new/search/#bs=6&budget=5");
		//driver.findElement(By.xpath("//div[@class='top-nav-label js-main-nav-label']/span[1]")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//ul[@class='nested-panel-list']//li//a[text()='Find New Cars']")).click();
//		driver.findElement(By.xpath("//h3[text()='Body Type']")).click();
//		driver.findElement(By.xpath("//*[text()='SUV/MUV']")).click();
//		driver.findElement(By.xpath("//*[text()='Budget']")).click();
//		driver.findElement(By.xpath("//a[text()='8-12 lakh']")).click();
		
		
		List<WebElement> ele= driver.findElements(By.xpath("//*[@id=\"tbl_res\"]/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		List<String> names= new ArrayList<String>();
		for(WebElement name: ele) {
			
			names.add(name.getText());
			
		}
		
		String nextbutton=driver.findElement(By.xpath("//*[@id=\"rpgListings_divLastNav1\"]/span/a")).getAttribute("class");
		while(!nextbutton.contains("pg")) {
			
			JavascriptExecutor je = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(By.xpath("//*[@id=\"rpgListings_divLastNav1\"]/span/a"));
			je.executeScript("arguments[0].scrollIntoView(true);",element);
			driver.findElement(By.xpath("//*[@id=\"rpgListings_divLastNav1\"]/span/a")).click();
		    ele= driver.findElements(By.xpath("//*[@id=\"tbl_res\"]/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));

			for(WebElement name: ele) {
				
				names.add(name.getText());
				
			}
		
			nextbutton=driver.findElement(By.xpath("//*[@id=\"rpgListings_divLastNav1\"]/span/a")).getAttribute("class");
		}
		for(String lll : names) {
			System.out.println(lll);
		}
//		for (int i = 0; i< ele.size(); i++) {
//			String models = ele.get(i).getText();
//			System.out.println(models);
//			//System.out.println(ele.size());
//			if (driver.findElement(By.xpath("//*[@id=\"rpgListings_divLastNav1\"]/span/a")).isDisplayed()) {
//				JavascriptExecutor je = (JavascriptExecutor) driver;
//				WebElement element = driver.findElement(By.xpath("//*[@id=\"rpgListings_divLastNav1\"]/span/a"));
//				je.executeScript("arguments[0].scrollIntoView(true);",element);
//				driver.findElement(By.xpath("//*[@id=\"rpgListings_divLastNav1\"]/span/a")).click();
//				Thread.sleep(2000);
//				continue;
//				
//			} else {
//
//			}
//		}
		
		
		
		
		
		
		
	}
}
