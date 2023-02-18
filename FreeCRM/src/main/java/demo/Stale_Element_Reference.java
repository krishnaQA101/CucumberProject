package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_Element_Reference {

	private static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		//chromedriver setup
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				//Launch url
				driver.get("https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
			
				//Events
		        driver.findElement(By.className("input-group-addon")).click();
		        Thread.sleep(1000);
		       WebElement ele =driver.findElement(By.xpath("//td[text()='21' and @class='day']"));
		       ele.click();
		       
		       //Try clicking the element again
		       driver.findElement(By.className("input-group-addon")).click();
		       Thread.sleep(500);
		       driver.findElement(By.xpath("//th[@class='clear']")).click();
		       driver.findElement(By.className("input-group-addon")).click();
		        Thread.sleep(1000);
		        
		        //Click on the element without using findElement method again.
		        //This means that the user 
		       ele.click();
		        
	}

}




//WebElement ele1 =driver.findElement(By.xpath("//td[text()='21' and @class='day']"));