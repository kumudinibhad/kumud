package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleApproach {

	public String getRankFromtable(String Structure) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/#");
		Thread.sleep(2000);
		
	//	String Structure = "Financial Center";
		String strRank = driver.findElement(By.xpath("//th[text()='" + Structure + "']//following-sibling::td[5]")).getText();
		System.out.println(strRank);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		return strRank;
	}

}
