package AUCC_Project;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AU_Salary_Acc_Journey_Complete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
		System.out.println(driver.findElement(By.xpath("//div[@class='ng-star-inserted']")));
		Thread.sleep(5000);

		System.out.println(driver.getTitle());
		
		
		//driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c100-4']")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//span[normalize-space()='Salaried']")).click();
		
		
        Thread.sleep(15000);
		
		driver.findElement(By.xpath("//div[@class='mat-radio-label-content']")).click();

		//driver.findElement(By.xpath("//div[@class='address']")).click();
		
		Thread.sleep(25000);

		//////Personal Details///
		
		driver.findElement(By.xpath("//button[text()=' Next ']")).click(); // 54--77--100
		
		Thread.sleep(10000);
		
		System.out.println("Card Delivery Address");

		driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("(//div[@class='mat-radio-inner-circle'])[2]")).click();
		Thread.sleep(10000);
       
		
		////Enter Address details////
		System.out.println("Enter Address");

		
		driver.findElement(By.xpath("//input[@formcontrolname='caddress1']")).sendKeys("Gurgaon , Haryana");
		
		driver.findElement(By.xpath("//input[@formcontrolname='caddress2']")).sendKeys("Sector 46, Haryana");
		driver.findElement(By.xpath("//input[@formcontrolname='cpin']")).sendKeys("122003");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[text()=' Next ']")).click();    
		
		Thread.sleep(15000);
		
		System.out.println("Enter Personal Details");
		
		driver.findElement(By.xpath("//mat-select[@formcontrolname='nameCC']")).click();
		driver.findElement(By.xpath("//span[text()=' KUNJ D SHAH ']")).click();
		
		driver.findElement(By.xpath("//input[@formcontrolname='motherName']")).sendKeys("Kunj D");
		Thread.sleep(10000);
       
		driver.findElement(By.xpath("//button[text()=' Next ']")).click();   
		
		System.out.println("Employer Details");

		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@formcontrolname='companyName']")).sendKeys("Decimal");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//mat-option[@role='option'])[2]")).click();
		
		 driver.findElement(By.xpath("//input[@formcontrolname='designation']")).sendKeys("Testing");
		  driver.findElement(By.xpath("//input[@formcontrolname='monthlySalary']")).sendKeys("100000");
		  
			driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();

		
			driver.findElement(By.cssSelector("button.btn-filled")).click();
			
			String Cardselection= driver.findElement(By.xpath("//div[text()=' Congratulations! ']")).getText(); 
	        System.out.println(Cardselection  + "-- You are eligible for a Credit Card with a maximum limit of Rs. 6,00,000.: " );						
	       		
	        Thread.sleep(5000);

			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

			Thread.sleep(15000);
			
	        ///////////// Summary Details //////

			
			String Cardsummary= driver.findElement(By.xpath("//div[@class='container-subheading']")).getText(); 
	        System.out.println(Cardsummary); 
	        
	        driver.findElement(By.xpath("//button[text()='OK']")).click();
	        
	       System.out.println(" Application Submitted Successfully");
	       
	       System.out.println(" Application Under Review ");


	}

}
