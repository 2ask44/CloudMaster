package api;

import io.restassured.response.Response;
import service.Specification;

import static io.restassured.RestAssured.given;

public class Api {
    public Response login(String code) {
        return given()
                .spec(Specification.REQ_SPEC)
                .body("{" + "\"code\": \"" + code + "\"\n" + "}")
                .when()
                .post("/data/auth/password")
                .then()
                .spec(Specification.RES_SPEC)
                .log().all()
                .extract().response();
    }
}
