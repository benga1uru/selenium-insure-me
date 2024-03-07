package com.selenium.test.insureme;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.out.println( "Starting the Selenium Testing" );
    	
    	WebDriverManager.chromedriver().setup();
    	ChromeOptions chromeOptions = new ChromeOptions(); 

	// Operate in headless mode -without UI
    	chromeOptions.addArguments("--headless");
  	  
  	  	WebDriver driver = new ChromeDriver(chromeOptions);
  	  
  	  	System.out.println("Scripted Executing");
  	  
  	  	//1. Open the browser and get to the url
  	  	driver.get("http://18.232.49.165:8085/contact.html");
  	  	
  	  	// Implicit wait time
  	  	Thread.sleep(2000);
  	  	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
  	  	
  	  	//2. Fill Name
	  	driver.findElement(By.id("inputName")).sendKeys("Lingesh");
		System.out.println("Scripted inputName successfully");	  
	    
		//3. Fill Mobile Number
	    	driver.findElement(By.id("inputNumber")).sendKeys("1011011010");
	    	System.out.println("Scripted inputNumber successfully");
	    
	    	//4. Fill email address
	    	driver.findElement(By.id("inputMail")).sendKeys("lingesh@insure-me.com");
	    	System.out.println("Scripted inputMail successfully");
	    
	    	//5. Fill message
	    	driver.findElement(By.id("inputMessage")).sendKeys("I have some questions, please reach me on my cellnumber by tomorrow 10 am");
	    	System.out.println("Scripted inputMessage successfully");
	    
	    	//6. Click send button
	    	driver.findElement(By.id("my-button")).click();
	    	System.out.println("Scripted my-button clicked successfully");
  	  	
	System.out.println("Scripts completed successfully");
  	  	
    }
}
