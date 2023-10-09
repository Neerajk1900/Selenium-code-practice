package AUCC_Project;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_page_test extends Excel_read {
	
	Excel_read exceldata= new Excel_read();

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		
		driver.get("https://cconboarduat.aubankuat.in/auccself/#/landing");                      //Mobile=6969696969//Panno=ECLPS5505P
		
		
		
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("mobile");
		driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();

		driver.findElement(By.xpath("//button[text()=' Get OTP ']")).click();
		
		//Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("panno");  //div[text()='Lead ID:  ']
		driver.findElement(By.xpath("//button[text()=' Proceed ']")).click();
	}

}
