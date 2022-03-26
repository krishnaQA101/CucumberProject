package WebAppFramework.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverWrapper {
	
	private static WebDriver driver;
	
	public static WebDriver getWebdriver() {
		return driver;
	}
	
	public static void initialiseBrowser(String BrowserName) {
		
		switch (BrowserName) {
		case("Chrome"):
			driver=new ChromeDriver();
		break;
		
		case("Firefox"):
			driver=new FirefoxDriver();
		break;
		
		case("Explorer"):
			driver=new InternetExplorerDriver();
		break;
		
		default:
			driver=new ChromeDriver();
			break;
		}
	}
	
	
	
	
	

}
