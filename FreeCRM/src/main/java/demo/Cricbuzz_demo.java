package demo;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class Cricbuzz_demo {

	////Team 123
	//////////Krishna Kumar
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//chromedriver setup
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
				
		//Launch url
		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
		Thread.sleep(1000);
		
		//Events
		int NRR_index=0;
        List<WebElement> list_headings=driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']//td"));
        for(WebElement ele:list_headings) {
        	//Compare the point table headings with "NRR"
        	if(ele.getText().equals("NRR")) {
        		NRR_index++;
        		break; //Break the loop when match found
        		
        	}
        	
        	NRR_index++;
        }
        
        List<WebElement> list_NRR=driver.findElements(By.xpath("//td[@class='cb-srs-pnts-td']["+NRR_index+"]"));
        
        //Print the Net Run Rates
        for(WebElement we:list_NRR) {
        	
        	String text=we.getText();
        	System.out.println(text);
        	
        }
        driver.close();
        SessionId s=((RemoteWebDriver)driver).getSessionId();
        System.out.println(s);
       // Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
	}
	
	

}
