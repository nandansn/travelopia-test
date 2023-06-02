package com.travelopia.ui.jet.test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class Sampletest {

    WebDriver driver = null;
    final static String url = "https://www.tcsworldtravel.com/trip-finder";

    @BeforeTest
    public void createDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        //driver = WebDriverManager.chromedriver().capabilities(chromeOptions).create();

        //driver = createDriver();

    }


    @Test
    public void testOne() {
        driver.get(url);
        System.out.println(driver.getTitle());
        assertEquals(1,1);
    }

   @AfterTest
    public void closetest() {
        driver.quit();
   }
}
