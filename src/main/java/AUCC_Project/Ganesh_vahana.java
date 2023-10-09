package AUCC_Project;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ganesh_vahana {
	

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver;
		//NgWebDriver NgWebDriver ;
		JavascriptExecutor Jsdriver;
		//		WebDriverManager.chromedriver().setup();
		//		driver = new ChromeDriver();
		//		driver.manage().window().maximize();
		WebDriverManager.firefoxdriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);
	/*	FirefoxOptions options = new FirefoxOptions();
	//	options.setProfile(getProfile("autoprofile"));
		FirefoxDriver driver = new FirefoxDriver(options);*/
		//	WebDriver driver=new ChromeDriver();      
		// Storing the Application Url in the String variable  
		driver.get("https://accounts.vahanacloud.net/#/vwv/v1");  

		driver.manage().window().maximize();
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("ganesh.timande@decimal.co.in");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();

		Thread.sleep(6000);
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Decimal@12345");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='loginButton']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[normalize-space()='View all apps']")).click();
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

			String child_window=I1.next();


			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@placeholder='Search filter']")).sendKeys("Prepod12sept");
				Actions act = new Actions(driver);

				//Double click on element
				WebElement ele = driver.findElement(By.xpath("//div[@fxlayout='row']")); 
				act.doubleClick(ele).perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
				Thread.sleep(4000);
                 System.out.println("abccc");

				String m = driver.getWindowHandle();

				// store window handles in Set
				Set<String> w = driver.getWindowHandles();
				// iterate window handles
				for (String h: w){
					// switching to each window
					driver.switchTo().window(h);
					String s2= driver.getTitle();
					// checking specific window title
					if(s2.equalsIgnoreCase("vDesigner")){
						driver.findElement(By.xpath("//div[contains(text(),'Elements')]")).click();
						Thread.sleep(2000);
						System.out.println("b");
					}  
				}
			}
		}

		driver.navigate().refresh();
	
		
	      //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        
        
        System.out.println("Dd");
WebElement element = driver.findElement(By.xpath("//iframe[@id='vDeisgnerCanvas']"));
		

Actions act = new Actions(driver);

Dimension canvas_dimension = element.getSize();

System.out.println(canvas_dimension);

int xCoordinatesCenter = canvas_dimension.getWidth() / 2;

System.out.println("X Center Coordinates: " + xCoordinatesCenter);

int yCoordinatesCenter = canvas_dimension.getHeight() / 2;

System.out.println("Y Center Coordinates: " + yCoordinatesCenter);


System.out.println("f");
driver.switchTo().frame("vDeisgnerCanvas");
System.out.println("fff");



//For Number 1 Button
int xCoordinatesObject1 = (xCoordinatesCenter / 3) * 0 ;

int yCoordinatesObject1 = (yCoordinatesCenter / 6) * 1 ;

System.out.println("X Coordinates for the Center: " + xCoordinatesObject1);

System.out.println("Y Coordinates for the Center: " + yCoordinatesObject1);

Thread.sleep(2);

act.moveToElement(element, -(xCoordinatesObject1), yCoordinatesObject1).click().build().perform();
	}

}
