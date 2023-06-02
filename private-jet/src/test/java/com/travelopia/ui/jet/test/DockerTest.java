package com.travelopia.ui.jet.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DockerTest {

    @BeforeTest
    public void setup() {
        System.out.println("sample test");
    }

    @Test
    public void test() throws InterruptedException {
        Assert.assertTrue(true);
       // Thread.sleep(50000);
    }
}
