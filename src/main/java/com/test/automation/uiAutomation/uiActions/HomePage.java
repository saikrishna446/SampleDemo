package com.test.automation.uiAutomation.uiActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;
import com.test.automation.uiAutomation.testBase.TestBase;
/**
 * 
 * @author Bhanu Pratap
 *
 */
public class HomePage extends TestBase{
	
	public final String mens = "Mens";
	public final String womens = "Womens";
	public final String blog = "Blog";
	
	public final String jackets = "Jackets";
	public final String pants = "Pants";	
	
	WebDriver driver;
	
	@FindBy(xpath="//label[@for='email']")
	WebElement Email;
	
	@FindBy(xpath="//label[@for='pass']")
	WebElement Pass;
	
	@FindBy(xpath="//input[@id='u_0_3']")
	WebElement Login;
	
	@FindBy(xpath="//input[@id='u_0_j']")
	WebElement firstnam;
	
	@FindBy(xpath="//input[@id='u_0_l2']")
	WebElement surname;
	
	@FindBy(xpath="//input[@id='u_0_o']")
	WebElement mobilenumber;
	
	@FindBy(xpath="//input[@id='u_0_v']")
	WebElement newpassword;
	
	@FindBy(xpath="//button[@id='u_0_11']")
	WebElement signup;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		//testBase = new TestBase();
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplication(String emailAddress, String password){
		Email.sendKeys(emailAddress);
		test.log(LogStatus.INFO, "Enter email address");
		Pass.sendKeys(password);
		test.log(LogStatus.INFO, "Enter password ");
		Login.click();
		test.log(LogStatus.PASS, "Login FB");
	}
	public void registorUser(String firstName, String lastName, String number, String password){
		
		//this.firstnam.sendKeys(firstName);
		test.log(LogStatus.INFO, "Enter firstname");

		this.surname.sendKeys(lastName);
		test.log(LogStatus.INFO, "Enter last anme");

		this.mobilenumber.sendKeys(number);
		test.log(LogStatus.INFO, "Enter mobile number");

		this.newpassword.sendKeys(password);
		test.log(LogStatus.INFO, "Enter new passowrd");

		signup.click();
		test.log(LogStatus.PASS, "sucessfully created new user");

		
	}
	
	public boolean getRegistrationSuccess(){
		try {
			driver.findElement(By.xpath("//*[@id='MainContent']/div/p")).isDisplayed();
			return true;
		} catch (Exception e) {
		   return false;
		}
	}
	
	
	
	public void clickOnNavigationMenu(String menuName){
		driver.findElement(By.xpath("//button[contains(text(),'"+menuName+"') and @aria-expanded='false']")).click();
		log("clicked on:-"+menuName+" navigation menu");
	}
	
	public void clickOnProductInMensSection(String product){
		
		waitForElement(driver, 80, driver.findElement(By.xpath(".//button[contains(text(),'Mens') and @aria-expanded='true']/following-sibling::ul/child::li/child::a[contains(text(),'"+product+"')]")));
		driver.findElement(By.xpath(".//button[contains(text(),'Mens') and @aria-expanded='true']/following-sibling::ul/child::li/child::a[contains(text(),'"+product+"')]")).click();
		log("clicked on:-"+product);
	}
	
	public void clickOnProductInWomensSection(String product){
		waitForElement(driver, 80, driver.findElement(By.xpath(".//button[contains(text(),'Womens') and @aria-expanded='true']/following-sibling::ul/child::li/child::a[contains(text(),'"+product+"')]")));
		driver.findElement(By.xpath(".//button[contains(text(),'Womens') and @aria-expanded='true']/following-sibling::ul/child::li/child::a[contains(text(),'"+product+"')]")).click();
	}
	
	public void switchToFrame(){
		//driver.switchTo().frame(homePageIframe);
		log("switched to the iframe");
	}
	
	public void switchToDefaultContent(){
		driver.switchTo().defaultContent();
		log("switched to the default Content");
	}
	
	public void log(String data){
		Reporter.log(data);
	}
	
}
