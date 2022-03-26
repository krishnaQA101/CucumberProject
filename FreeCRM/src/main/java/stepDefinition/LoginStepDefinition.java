package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
// In TestRunner.java


public class LoginStepDefinition {
	
	public static WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\framework\\framework\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
	}

	@When("^title of the page is Free CRM$")
	public void title_of_the_page_is_Free_CRM() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String title=driver.getTitle();
	    String expected_title="Google";
	    Assert.assertEquals(expected_title, title);
	}

	@Then("^the User provides the Username$")
	public void the_User_provides_the_Username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.name(""));
	}

	@Then("^the User enters the Password$")
	public void the_User_enters_the_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^User clicks on the Login button$")
	public void user_clicks_on_the_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ////throw new PendingException();
	}

	@Then("^User verifies that the user is landing on the Home Page$")
	public void user_verifies_that_the_user_is_landing_on_the_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	@Given("User is already on Login Page in Firefox")
	public void user_is_already_on_login_page_in_firefox() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\framework\\framework\\drivers\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    
	    driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	    
	}

	

}
