package com.thetestingacadamy;

import io.restassured.RestAssured;

public class GetBooking {
   public static void main(String[] args){
       RestAssured
               .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/booking/1").log().all()
               .when()
                    .get()
               .then()
               .statusCode(200).log().all();
   }
}
