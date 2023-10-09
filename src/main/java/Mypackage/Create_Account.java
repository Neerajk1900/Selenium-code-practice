package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Account {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//div[5]")).click();


		//WebElement create_element= 
		driver.findElement(By.id("//a[@id='u_0_0_FN']")).click(); //unable to perform click action
		
		driver.findElement(By.cssSelector("//a[contains(text(),'Create a Page')]")).click();
		//WebElement sign_up= 
		
		Actions action= new Actions(driver);
		//action.moveToElement(create_element).click().build().perform();
		System.out.println("Successfully click");
		
		//driver.findElement(By.cssSelector("//a[text()='Sign Up'])[1]")).click();

		
		
		WebElement day= driver.findElement(By.cssSelector("#day"));
		Select select_day= new Select(day);
		select_day.selectByValue("15");
		
		WebElement month= driver.findElement(By.cssSelector("#month"));
		Select select_month= new Select(month);
		select_month.selectByVisibleText("Jan");
		
		WebElement year= driver.findElement(By.cssSelector("#year"));
		Select select_year= new Select(year);
		select_year.selectByIndex(2000);


		
		

	}

}
