package com.restful.booker.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public  void inInt(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
       // RestAssured.port = 8080;
        //RestAssured.basePath = "/apidoc";
    }

}