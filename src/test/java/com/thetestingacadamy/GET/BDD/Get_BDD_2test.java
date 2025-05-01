package com.thetestingacadamy.GET.BDD;

import io.restassured.RestAssured;

public class Get_BDD_2test {
    public static void main(String[] args) {
        //https://api.zippopotam.us
        //https://api.zippopotam.us/IN/501505
test1();
test2();

    }

    private static void test1() {
        RestAssured.given()
                .baseUri("https://api.zippopotam.us").basePath("/IN/501505")
                .when().log().all().get()
                .then().statusCode(200).log().all();
    }

    private static void test2() {
        RestAssured.given()
                .baseUri("https://api.zippopotam.us").basePath("/IN/-1")
                .when().log().all().get()
                .then().statusCode(404).log().all();

    }
}
