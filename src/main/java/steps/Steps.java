package steps;

import api.Api;
import io.qameta.allure.Step;
import io.restassured.path.json.JsonPath;
import pojos.ServiceCodeResponse;

public class Steps {
    Api api = new Api();
    public static String sessionToken;

    @Step("Получение sessionToken")
    public String getToken() {
        String str = api.login("YWRtaW5AZGVtby5jbG91ZG1hc3Rlci5ydTpDbDB1ZG1Ac3Rlcg==").asString();
        JsonPath jsonPath = JsonPath.from(str);
        ServiceCodeResponse serviceCodeResponse = jsonPath.getObject("$", ServiceCodeResponse.class);
        return sessionToken = serviceCodeResponse.getSessionToken();

    }
}
