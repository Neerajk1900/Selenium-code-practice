package AUCC_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuccBank_C5_Journey {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		
		driver.get("https://cconboarduat.aubankuat.in/auccself/?utm_source=self&utm_medium=website&utm_campaign=swipeup_campaign&utm_card=swipeup");                      //Mobile=6969696969
				                                                                                 //Panno=ECLPS5505P
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("8686868686");
		driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()=' Get OTP ']")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("AALPQ6171F");  //div[text()='Lead ID:  ']
		driver.findElement(By.xpath("//button[text()=' Proceed ']")).click();
		Thread.sleep(10000);
System.out.println("Card Comparision page");
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  js.executeScript("window.scrollBy(0,1200)");

	     System.out.println("Card Comparision:: Proceed button is visible");

			Thread.sleep(6000);
		    // driver.findElement(By.xpath("//button[text()=' Proceed ']")).click();

	     
	    // driver.findElement(By.xpath("//div[@class='add-bg container__bottom']/child::button")).click();
	     
	}

}
