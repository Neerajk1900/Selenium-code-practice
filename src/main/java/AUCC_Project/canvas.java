package AUCC_Project;

	
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class canvas {


	public static void main(String[] args) {
		
 
		 WebDriverManager.chromedriver().setup();
	      WebDriver driver =new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	      
		  
		        driver.get("https://kitchen.applitools.com/ingredients/canvas");
	/*	        var canvas1 = driver.findElement(By.id("burger_canvas"));

		        //Calculate position canvas button
		        var canvas_dimensions = canvas1.getSize();
		        var canvas_center_x = canvas_dimensions.getWidth() / 2;
		        var canvas_center_y = canvas_dimensions.getHeight() / 2;
		        int button_x = (canvas_center_x / 3) * 2;
		        int button_y = (canvas_center_y / 3) * 2;

		        //Click button on the canvas
		        new Actions(driver)
		            .moveToElement(canvas1, button_x, button_y)
		            .click()
		            .perform();

		        //Verify canvas now displays burger
		        Eyes eyes = new Eyes();
		        eyes.open(driver, "The Kitchen", "burger on canvas");
		        eyes.checkElement(canvas1);
		        eyes.close();
		    */

		
	}

}
