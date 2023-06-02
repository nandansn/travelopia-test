package com.travelopia.ui.jet.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

@Test
public class UsingLambdaTest {

    WebDriver driver = null;

    public String username = "";
    public String accesskey = "";

    public String gridURL = "@hub.lambdatest.com/wd/hub";

    @BeforeTest
    public void createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "70.0");
        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
        capabilities.setCapability("build", "LambdaTestSampleApp");
        capabilities.setCapability("name", "LambdaTestJavaSample");
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test() {
        String url = "https://www.tcsworldtravel.com/trip-finder";
        driver.get(url);
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void closeAll() {
        driver.quit();
    }
}
