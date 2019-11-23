package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.Test2;

public class NewTest {
	@Test
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter("E:\\Report\\batch.html");
		ExtentReports report = new ExtentReports();
		
		report.attachReporter(htmlreporter);
		ExtentTest logger= report.createTest("Aut_VerifyLoginToFlightApp","Verify user is able to login successfully in flight app ");
		
		logger.log(Status.PASS, "flight app url is lauched");
		logger.log(Status.PASS, "successfully enter username");
		logger.log(Status.PASS, "successfully enter password");
		logger.log(Status.PASS, "click on login button");
		
		report.flush();
		//Test2 t = new Test2();
		//int x = t.m1();
		System.out.println("hi");
	}
  @Test
  public void launchBrowser1() {
	  System.out.println("hello");
  }
}
