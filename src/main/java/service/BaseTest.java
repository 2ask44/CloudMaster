package service;

import org.testng.annotations.BeforeSuite;
import steps.Steps;

public class BaseTest {
    public Steps steps = new Steps();

    @BeforeSuite
    public void getToken() {
        System.out.println(steps.authorization());
    }


}
