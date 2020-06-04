package Testrunner;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fb extends TestBase {
	
	HomePage homepage;

	@Given("^navigate to application$")
	public void navigate_to_application() throws Throwable {

		init();

	}

	@When("^user click on sign in link$")
	public void user_click_on_sign_in_link() throws Throwable {


		loadData();
		homepage = new HomePage(driver);
		homepage.registorUser(OR.getProperty("fidrname"), OR.getProperty("lastname"), OR.getProperty("mnumber"), OR.getProperty("passowrd"));

	}

	@When("^enter email address as \"([^\"]*)\"$")
	public void enter_email_address_as(String arg1) throws Throwable {


		loadData();
		homepage = new HomePage(driver);
		homepage.registorUser(OR.getProperty("fidrname"), OR.getProperty("lastname"), OR.getProperty("mnumber"), OR.getProperty("passowrd"));

	}

	@When("^enter password as \"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pass");
	}

	@When("^click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {


		System.out.println("Pass");
	}

	@Then("^Login is successful$")
	public void login_is_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pass");
	}
}
