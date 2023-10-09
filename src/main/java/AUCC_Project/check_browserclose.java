package AUCC_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check_browserclose {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		
		driver.get("https://cconboarduat.aubankuat.in/auccself/#/landing");                      //Mobile=6969696969
				                                                                                 //Panno=ECLPS5505P
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("6969696969");
		driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();

		driver.findElement(By.xpath("//button[text()=' Get OTP ']")).click();
		
		//Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("ECLPS5505P");  //div[text()='Lead ID:  ']
		driver.findElement(By.xpath("//button[text()=' Proceed ']")).click();
		
		String leadid= driver.findElement(By.xpath("//div[starts-with(text(),'CS')]")).getText(); 
        System.out.println("Lead id: " + leadid);
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		//Thread.sleep(15000);
        System.out.println("click ok and close submit successfully");

		driver.close();
		
	}

}
