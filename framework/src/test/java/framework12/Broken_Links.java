package framework12;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken_Links {
	
	private static WebDriver driver;
	
	@Test
	void test() throws InterruptedException, MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\framework\\framework\\src\\test\\java\\framework12\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		for(WebElement k:driver.findElements(By.tagName("a"))) {
		
			String url=k.getAttribute("href");
			
			if(url==null) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
			}
			
			
			try {
				URL url1=new URL(url);
				
				HttpURLConnection huc=(HttpURLConnection)(url1.openConnection());
				
				huc.connect();
				
				int respCode=huc.getResponseCode();
				
				if(respCode>=400) {
					
					System.out.println(url+"----------broken link");
				}
				
				else {
					System.out.println(url+"-----------valid link");
				}
				
				
				
				
			}
			
			catch (Exception e) {
				
				
				
			}
		}
		

	}

}
