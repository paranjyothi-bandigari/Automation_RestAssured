package com.thetestingacadamy.GET.BDD;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
public class Get_NonBDD_2tests {
    static RequestSpecification r= RestAssured.given();
    public static void main(String[] args) {
        //r.relaxedHTTPSValidation();
        r.baseUri("https://api.zippopotam.us");
        test001();
        test002();
    }
    private static void test002() {
        r.basePath("/IN/-1");
        r.when().get();
        r.then().log().all().statusCode(404);
    }
    private static void test001() {
        r.basePath("/IN/501505");
        r.when().get();
        r.then().log().all().statusCode(404);
    }
}
