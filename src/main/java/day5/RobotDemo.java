package day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/#");
		Thread.sleep(2000);
		
		Robot r = new Robot();
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		
		
	}

}
