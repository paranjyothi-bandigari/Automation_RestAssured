package com.thetestingacadamy.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BDD_Post {
    public static void main(String[] args) {

        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RestAssured.given()
                        .baseUri("https://restful-booker.herokuapp.com")
                        .basePath("/auth").contentType(ContentType.JSON)
                        .body(payload)
                .when()
                        .post()
                .then()
                        .log().all()
                        .statusCode(200);

    }
}
