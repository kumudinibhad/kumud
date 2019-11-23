package ass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RblDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rblbank.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("Credit Cards")).click();
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		//alert.accept(); //ok,yes
		alert.dismiss();//cancel,no
		
		
	
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[2]/div[1]/div/div[16]/div/div[1]/div[2]")).click();
	//	driver.findElement(By.id("Credit Card")).click();
	//	driver.findElement(By.id("")).click();
		
	}

}
