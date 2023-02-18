package MyRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_Dropdown_sort_Alternative {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		///Setup the driver and launch the url
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
	///Dropdown Sort Check Code
		//Step 1
		WebElement dropdown_list=driver.findElement(By.id("select-demo"));
		//Step 2
		Select select=new Select(dropdown_list);
		List<WebElement> dropdown_elements=select.getOptions();
		//Step 3
		List<String> actual_options=new ArrayList<>();
		for(WebElement ele:dropdown_elements) {
			actual_options.add(ele.getText());	
		}
		//Step 4
		List<String> expected_options=new ArrayList<>();
		expected_options.addAll(actual_options);
		///Alternate Approach
		//Bubble Sort
		int n=expected_options.size();
		for(int i=0;i<n;i++) {
			
			boolean flag=true;
			
			for(int j=0;j<n-i-1;j++) {
				
				String a1=expected_options.get(j);
				String a2=expected_options.get(j+1);
				
				//a1.compareTo(a2)>0, means a1 should appear after a2 in alphabetical order
				if(a1.compareTo(a2)>0) {
					String temp=a1;
					expected_options.set(j, a2);
					expected_options.set(j+1, temp);
					flag=false;
					}
				}
			if(flag==true) {
				break;
			}
			
			
		}
		
		
		
		
		System.out.println("Actual  "+actual_options);
		System.out.println("Expected "+expected_options);
		//Step 5
		if(actual_options.equals(expected_options)) {
			
			System.out.println("The dropdown is in alphabetically sorted order");
			
		}
		
		else {
			System.out.println("The dropdown is unsorted");
		}
	}

}
