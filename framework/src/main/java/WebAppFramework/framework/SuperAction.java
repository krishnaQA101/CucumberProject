package WebAppFramework.framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class SuperAction {
	
	protected static WebDriver driver=WebDriverWrapper.getWebdriver();
	
	/**
	 * 
	 * @param by
	 * @return
	 */
	public static WebElement getElement(By ele) {
		if(ele!=null) {
		return driver.findElement(ele);}
		
		return null;
		
	}
	
	public static List<WebElement> getElements(By elems) {
		if(elems!=null) {
		return driver.findElements(elems);}
		
		return null;
		
	}
	
	
	
}
