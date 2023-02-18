package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_Element_Reference2 {

	private static WebDriver driver;
	private static final String baseurl="https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html";
	private static final By _calendarButton=By.className("input-group-addon");
	private static final By _clearButton=By.xpath("//th[@class='clear']");
	private static final By _selectDate=By.xpath("//td[text()='21' and @class='day']");
	
	public static void main(String[] args) throws InterruptedException {
		//chromedriver setup
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				//Launch url
				driver.get(baseurl);
			
				//Events
		        driver.findElement(_calendarButton).click();
		        Thread.sleep(1000);
		       WebElement ele =driver.findElement(_selectDate);
		       ele.click();
		       
		       //Try clicking the element again
		       driver.findElement(_calendarButton).click();
		       Thread.sleep(500);
		       driver.findElement(_clearButton).click();
		       driver.findElement(_calendarButton).click();
		        Thread.sleep(1000);
		        
		        //Click on the element without using findElement method again.
		        //This means that the user 
		       ele.click();
		        
	}

}




//WebElement ele1 =driver.findElement(By.xpath("//td[text()='21' and @class='day']"));