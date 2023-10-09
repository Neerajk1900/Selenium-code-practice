package AUCC_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class document_upload {

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
		String path1= "C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png";
		String path2= "C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png";

		WebElement element=driver.findElement(By.xpath("(//input[@type='file'])[1]"));
        Thread.sleep(10000);  
        System.out.println("1st document uploaded");
        
       element.sendKeys(path1);
        Thread.sleep(20000);  

       /* element.sendKeys(path2);

		//driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/app-upload-document[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]")).sendKeys("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png");
        Thread.sleep(10000);  
        System.out.println("2nd document uploaded"); */
		//driver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png");
  

		    WebElement salaryslip2=driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/app-upload-document[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]"));
		    JavascriptExecutor js=(JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].click();" ,salaryslip2);
	    	Thread.sleep(10000);
	    	salaryslip2.sendKeys("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png");

	        System.out.println("2nd  document uploaded");

	    	
	    	
		//driver.findElement(By.xpath("(//div[@class='ng-star-inserted'])[2]")).sendKeys("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png");
        Thread.sleep(15000);        

		

			driver.findElement(By.xpath("(//input[@type='file'])[2]")).sendKeys("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png");
        Thread.sleep(10000);
	    WebElement Bankstatement2=driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/app-upload-document[1]/div[1]/div[1]/form[1]/div[5]/div[2]/input[1]"));
    	js.executeScript("arguments[0].click();" ,Bankstatement2);
        Thread.sleep(10000);        
    	Bankstatement2.sendKeys("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png");

    	 Thread.sleep(10000);
 	    WebElement Bankstatement3=driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/app-upload-document[1]/div[1]/div[1]/form[1]/div[5]/div[3]/input[1]"));
     	js.executeScript("arguments[0].click();" ,Bankstatement3);
         Thread.sleep(10000);        
     	Bankstatement3.sendKeys("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png");
        System.out.println("3 document uploaded");

        Thread.sleep(5000);        

         driver.findElement(By.xpath("//button[@class='btn-filled']")).click();
         Thread.sleep(10000);  
         driver.findElement(By.xpath("//button[text()='OK']")).click();


	}

}
