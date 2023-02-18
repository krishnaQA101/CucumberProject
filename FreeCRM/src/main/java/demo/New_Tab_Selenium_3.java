package demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New_Tab_Selenium_3 {

	private static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\chromedriver.exe");

			driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		
		action.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		

	}

}
