package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchapplication {

	public static void main(String[] args) {
		
	  System.setProperty("WebDriver driver", "ChromeDriver driver");
		
      WebDriverManager.chromedriver().setup();
      WebDriver driver =new ChromeDriver();
      
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      
      driver.get("https://www.facebook.com/");
      driver.findElement(By.cssSelector("#email")).sendKeys("neeraj.kishor@gmail.co.in");
      driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
      WebElement click1=driver.findElement(By.xpath("//button[@name='login']"));
                       click1.click();
      
      
      
      
      
      
      
	
	
	}

}
