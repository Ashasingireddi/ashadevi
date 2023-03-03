package com.dynamicvalidation;

import org.junit.jupiter.api.Test;
import org.testng.annotations.DataProvider;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
public class valiadteuser {
	@Test

    public void addUser(){

		System.out.println("hiii");
	RestAssured.baseURI="http://172.17.12.104:8083";


	  given().log().all().header("Content-Type","application/json") 

	      .body(payload.userDetails("ServicesBay")).when().post("/login").then().

	log().all

	().assertThat().statusCode(200);

	}

	@DataProvider

    public Object[][] sendData(){
		

       return new Object[][] {{"username","ServicesBay"},{"password","password"}};

    }
	@Test

	public void addUser(String username,String password){

	    RestAssured.baseURI="http://172.17.12.104:8083";

	    given().log().all().header("Content-Type","application/json")

	            .body(payload.userDetails("ServicesBay")).

	            when().post("/login").then().log().all().assertThat().statusCode(200);

	}
}
