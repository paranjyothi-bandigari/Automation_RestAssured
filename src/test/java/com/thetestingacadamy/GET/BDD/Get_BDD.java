package com.thetestingacadamy.GET.BDD;

import io.restassured.RestAssured;

public class Get_BDD {
    public static void main(String[] args) {
        //https://api.zippopotam.us
        //https://api.zippopotam.us/IN/501505

        RestAssured.given()
                        .baseUri("https://api.zippopotam.us").basePath("/IN/501505")
                .when().log().all().get()
                .then().statusCode(200).log().all();
    }
}