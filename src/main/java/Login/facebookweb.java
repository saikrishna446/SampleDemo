package Login;


import java.io.File;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:/Pratice/Pratice/src/test/featurefiles/sai.feature"}, glue= {"Testrunner"},plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class facebookweb   {

	@org.junit.AfterClass
	public static void reportsetup() {
	
		Reporter.loadXMLConfig(new File("E:\\Pratice\\Pratice\\src\\test\\featurefiles\\extentconfig.xml"));
		Reporter.setSystemInfo("windows 10", "64 bit");
		Reporter.setSystemInfo("saikrishna", "cucumber");
		
	}
}
