package com.thetestingacadamy.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDD_PUT_Testing {
   // public void get_token(){
//return token;
   // }
   // public void bookingid(){
        //return bookingId;

   // }

@Test
    public void bdd_put() {

    String token="df8f7e27413609f";
        String bookingId="3044";

        String Put_Payload="{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        RequestSpecification r= RestAssured.given();
                r.baseUri("https://restful-booker.herokuapp.com");
                r.basePath("/booking/"+bookingId);
                r.contentType(ContentType.JSON);
                r.body(Put_Payload);
               // r.cookie("token",token);
        Response response=r.when().put();
        ValidatableResponse vr=response.then();
               vr.statusCode(200).log().all();
    }
}
