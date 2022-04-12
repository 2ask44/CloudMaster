package service;

import api.Api;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.xml.ws.Response;

public class BaseTest {
    Api api = new Api();
    //public static String sessionToken;
    @BeforeSuite
    public void getToken() {
        api.login("YWRtaW5AZGVtby5jbG91ZG1hc3Rlci5ydTpDbDB1ZG1Ac3Rlcg==");
      }
}
