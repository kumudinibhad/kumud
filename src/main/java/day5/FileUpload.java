package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(2000);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
	//	driver.findElement(By.id("mobileNoInp")).sendKeys(C:\Users\Nilesh\Desktop\website\image\logo.jpg);
		
	}

}
