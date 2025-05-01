package com.thetestingacadamy.GET.BDD;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDD_Get {
    @Test
    public void bookingId() {
        //https://api.zippopotam.us
        RequestSpecification r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/501505");
        r.when().get();
        r.then().log().all().statusCode(200);



    }
}
