import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AU_Self_Employed_journey {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c100-4']")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//span[text()=' Self Employed ']")).click();
		System.out.println("Employement Type - Self Employed is selected");
        Thread.sleep(15000);
		
		driver.findElement(By.xpath("//div[@class='mat-radio-label-content']")).click();		
		Thread.sleep(25000);
		
       driver.findElement(By.xpath("//button[text()=' Next ']")).click();
       
       
       driver.findElement(By.xpath("//button[text()=' Next ']")).click(); // 54--77--100
		
		Thread.sleep(10000);
		
		System.out.println("Enter Delivery Address");

		driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("(//div[@class='mat-radio-inner-circle'])[2]")).click();
		Thread.sleep(10000);
      
         driver.findElement(By.xpath("//input[@formcontrolname='caddress1']")).sendKeys("M3M Urbana , Haryana");
		
		driver.findElement(By.xpath("//input[@formcontrolname='caddress2']")).sendKeys("Sector 67, Haryana");
		driver.findElement(By.xpath("//input[@formcontrolname='cpin']")).sendKeys("122001");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[text()=' Next ']")).click();    
		
		Thread.sleep(15000);
	}

}
