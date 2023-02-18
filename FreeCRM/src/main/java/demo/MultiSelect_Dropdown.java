package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_Dropdown {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		
		//chromedriver setup
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch url
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		//Events
		WebElement ddl=driver.findElement(By.id("multi-select"));
		Select select=new Select(ddl);
	    //Check Whether Its multiple dropdown
		if(select.isMultiple()) {
		//Select from Dropdown
		select.selectByIndex(0);
		select.selectByIndex(2);
		select.selectByVisibleText("New York");
		
		//get all selected options
		List<WebElement> selected_elements=select.getAllSelectedOptions();
		for(WebElement ele:selected_elements) {
			System.out.println(ele.getText());
		}
		}
	}

}
