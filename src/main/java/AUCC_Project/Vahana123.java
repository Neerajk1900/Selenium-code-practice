package AUCC_Project;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vahana123 {

	public static void main(String[] args) throws Exception {
					
	      WebDriverManager.chromedriver().setup();
	      WebDriver driver =new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	      
	      
	      driver.get("https://accounts-dev.vahanacloud.com/agni/#/vwv/v1");
	      driver.findElement(By.cssSelector("#email")).sendKeys("nitesh.kumar@decimal.co.in"); Thread.sleep(5000);
	      driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
	      Thread.sleep(10000);
	      driver.findElement(By.cssSelector("#password")).sendKeys("Nitesh@12345");
	      
	      driver.findElement(By.xpath("//button[@id='loginButton']")).click();
	      Thread.sleep(10000);

	      driver.findElement(By.xpath("//span[text()='View all apps']")).click();
	      Set<String> winid=driver.getWindowHandles();
	      System.out.println(winid);
	      
	      List<String> winidlist= new ArrayList(winid);
	    	 String firstid= winidlist.get(0);
	    	 String secondid= winidlist.get(1);

	     driver.switchTo().window(secondid);
	      Thread.sleep(10000);
	      System.out.println(driver.getTitle());


	      WebElement Appname= driver.findElement(By.xpath("//strong[contains(text(),'Neeraj_sep12')]"));
	      Thread.sleep(10000);

		 Actions act = new Actions(driver);
         act.moveToElement(Appname).doubleClick().perform();
	     Thread.sleep(10000);
	     WebElement Appname1= driver.findElement(By.xpath("//strong[contains(text(),'Neeraj_sep12')]"));
	     Thread.sleep(10000);
	     
	     act.moveToElement(Appname1).doubleClick().perform();
	      Thread.sleep(10000);
	      Set<String> winid1=driver.getWindowHandles();
	      List<String> winidlist1= new ArrayList(winid1);
	    	 String firstid1= winidlist1.get(0);
	    	 String secondid1= winidlist1.get(1);
	    	 String Thirdid1= winidlist1.get(2);

	      System.out.println(winid);
	      System.out.println(winid1);

        driver.switchTo().window(Thirdid1);
	      Thread.sleep(10000);

         driver.findElement(By.xpath("//div[contains(text(),'Elements')]")).click();
         
         WebElement drag= driver.findElement(By.xpath("(//div[@class='height-inherit ng-star-inserted'])[1]"));
         System.out.println("element found");
	      Thread.sleep(5000);
         WebElement frame1= driver.findElement(By.xpath("//iframe[@id='vDeisgnerCanvas']"));
         driver.switchTo().frame(frame1);
	      Thread.sleep(10000);
         System.out.println("vDeisgnerCanvas frame");
         WebElement drop= driver.findElement(By.xpath("(//div[@id='phone'])[1]"));
        // WebElement drop= driver.findElement(By.xpath("(//canvas)[1]"));
         System.out.println("canvas found");
	      Thread.sleep(10000);
	      Actions builder = new Actions(driver);
	      Actions dragAndDrop = builder.clickAndHold(drag);
	      Thread.sleep(10000);

	      builder.moveToElement(drop);
	         builder.release(drop);
	        // builder.build();
	         dragAndDrop.perform();
	         


         //act1.dragAndDrop(src1, tar1).perform(); 
  
         
		
		
		

	}

}
