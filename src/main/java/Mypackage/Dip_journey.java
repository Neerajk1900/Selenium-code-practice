package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dip_journey {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		
		driver.get("https://cconboarduat.aubankuat.in/AU_DOPS/#/");                      //Mobile=6969696969
				                                                                                 //Panno=ECLPS5505P
		driver.findElement(By.xpath("//input[@formcontrolname='userId']")).sendKeys("981292");
		  Thread.sleep(5000);

	  driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("AUBank@123");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(5000);
      
	  driver.findElement(By.xpath("//span[normalize-space()='Add Case']")).click();
	  Thread.sleep(5000);
	  

	}

}
