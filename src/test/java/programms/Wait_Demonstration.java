package programms;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Demonstration {

	// created reference variable for WebDriver
	WebDriver drv;

	@Before
	public void setup() throws InterruptedException {

		// initializing drv variable using FirefoxDriver
		System.setProperty("webdriver.chrome.driver", "G:\\bahubali2\\chromedriver.exe");
		drv = new ChromeDriver();
		// launching gmail.com on the browser
		drv.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		// maximized the browser window
		//drv.manage().deleteAllCookies();
		
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {

		// saving the GUI element reference into a "username" variable of WebElement
		// type
		WebDriverWait wait = new WebDriverWait(drv, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identifierIdd\"]")));

		
		WebElement username = drv.findElement(By.xpath("//*[@id=\"identifierIdd\"]"));

		// entering username
		username.sendKeys("7893458343");

		drv.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();

		// entering password
		drv.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("sahithi@284");

		// clicking signin button
		//drv.findElement(By.xpath("//*[@id=\"passwordNext\"]/div[2]")).click();

		Thread.sleep(5000);
		// explicit wait - to wait for the compose button to be click-able
		//WebDriverWait wait = new WebDriverWait(drv, 30);

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":l6\"]/div/div")));
		// click on the compose button as soon as the "compose" button is visible
		drv.findElement(By.xpath("//*[@id=\":l6\"]/div/div")).click();
	}

	@After
	public void teardown() {
		// closes all the browser windows opened by web driver
		drv.quit();
	}

}
