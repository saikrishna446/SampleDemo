package Facebook;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class Logintothefacebook extends TestBase {

	HomePage homepage;
	
	@BeforeClass
	public void setup() throws IOException, InterruptedException {
		init();
	}
	@Test(priority=1)
	public void loginface() throws IOException {
		loadData();
		homepage = new HomePage(driver);
		homepage.registorUser(OR.getProperty("fidrname"), OR.getProperty("lastname"), OR.getProperty("mnumber"), OR.getProperty("passowrd"));

	}
	@Test(priority=2)
	public void loginface1() throws IOException {
		loadData();
		homepage = new HomePage(driver);
		homepage.registorUser(OR.getProperty("fidrname"), OR.getProperty("lastname"), OR.getProperty("mnumber"), OR.getProperty("passowrd"));

	}
	
	
}
