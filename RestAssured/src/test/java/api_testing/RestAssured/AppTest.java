package api_testing.RestAssured;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

import io.restassured.RestAssured;




/**
 * Unit test for simple App.
 */
public class AppTest 
{
   @Test
	void test() {
	   
	   RestAssured.baseURI="https://rahulshettyacademy.com";
	   
	   RestAssured.given().log().all().queryParam("key", "qaclick123").when().post("/maps/api/place/add/json")
	   .then().log().status();
		
	}
    
}
