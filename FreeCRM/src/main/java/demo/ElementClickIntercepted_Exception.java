package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class ElementClickIntercepted_Exception {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		
		//chromedriver setup
System.setProperty("webdriver.chrome.driver", 
		System.getProperty("user.dir")+"\\chromedriver.exe");

ChromeOptions options=new ChromeOptions();
options.addArguments("--silent");
options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
driver=new ChromeDriver(options);
driver.manage().window().maximize();

//Launch url
driver.get("https://www.google.com/");
//Events
driver.findElement(By.name("q")).sendKeys("abc");

///Modified code
WebElement search_btn=driver.findElement(By.name("btnK"));
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", search_btn);


	}

}
