package com.thetestingacadamy.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class BDD_Put_Testng {
    @Test
    public void bdd_put() {
        String token="df8f7e27413609f";
        String bookingId="1965";

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
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/"+bookingId)
                .contentType(ContentType.JSON)
                .body(Put_Payload)
                .cookie("token",token)
                .when().log().all().put()
                .then().statusCode(200).log().all();

    }

}
