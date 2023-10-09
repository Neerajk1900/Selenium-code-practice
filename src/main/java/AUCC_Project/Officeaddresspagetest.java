package AUCC_Project;

import org.openqa.selenium.WebDriver;

public class Officeaddresspagetest extends Login_page_test  {
		   
	    public WebDriver driver;
		public Login_page_test Login_test ;

	    public Officeaddresspagetest(){
	        super();
	    }
	    

	    public void loginTest() throws Exception
	       {       
	    	Login_test = new Login_page_test();
	      //  Login_page_test.login(prop.getProperty("mobile"),prop.getProperty("panno"));      
	       }
	   
	  	    public void tearDown() 
	    {
	        
	        driver.quit();
	        
	    }

}
