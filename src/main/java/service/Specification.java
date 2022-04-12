package service;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specification {
    public static RequestSpecification REQ_SPEC = new RequestSpecBuilder()
            .setBaseUri("https://dev.cbi.cloudmaster.ru")
            .setContentType(ContentType.JSON)
            .addFilter(new AllureRestAssured())
            .build();
    public static ResponseSpecification RES_SPEC = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();
}
