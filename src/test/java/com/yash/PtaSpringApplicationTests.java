package com.yash;

import static org.hamcrest.CoreMatchers.equalTo;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jayway.restassured.RestAssured;

@RunWith(SpringJUnit4ClassRunner.class)  

@ContextConfiguration(classes =PtaSpringApplication.class) 

@TestPropertySource(value={"classpath:application.properties"})

@SpringBootTest
class PtaSpringApplicationTests {

	 @Value("${server.port}") 
	 int port;
	@Test
	void contextLoads() {
		}


	@Test
	void authenticateUser() {
       // get("/api/tdd/responseData").then().assertThat().body("data", equalTo("responseData"));

		
	}


	@Before

    public void setBaseUri () {

            RestAssured.port = port;

            RestAssured.baseURI = "http://localhost"; // replace as appropriate

    }

}
