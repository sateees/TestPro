package TST;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleGetTest {

@Test
public void getWheatherDetails(){
	
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	
	RequestSpecification httpRequest = RestAssured.given();
	
	Response response = httpRequest.request(Method.GET, "/Hyderabad");
	
	//httpRequest.given().param(arg0, arg1)
	
	String responseBody = response.asString();
	String value  = response.jsonPath().get("Humidity");
	System.out.println(value);
	//httpRequest.given().when().then();
	//response.body().jsonPath().
	System.out.println("the response is: "+responseBody);
	
	System.out.println("the Humidity is: "+value);
	
} 
	
	
	
	
}
