package requests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class httpreq {

	//given()->content type,cookies,add auth,add param,set headers,etc.,
	//when()->get,post,put,delete
	//then()->validate status code,extract responses,extract headers cookies,response body
	
	@Test
	void getuser() {
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
			
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
		
	}
}

