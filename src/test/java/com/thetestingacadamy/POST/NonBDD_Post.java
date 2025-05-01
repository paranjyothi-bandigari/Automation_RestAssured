package com.thetestingacadamy.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDD_Post {
    @Test
    public void get_token(){
     RequestSpecification r= RestAssured.given();

        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

                r.baseUri("https://restful-booker.herokuapp.com");
                r.basePath("/auth").contentType(ContentType.JSON);
                r.body(payload);
          Response response =r.when().post();
        ValidatableResponse vr=response.then();
               vr.log().all().statusCode(200);

    }
}
