package com.travelopia.ui.jet.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class JenkinsTest {


    @DataProvider(name = "test-data")
    public Object[][] dataProvider() {


        return new Object[][] {{1},{2},{3},{4},{5}};
    }

    @Test(dataProvider = "test-data")
    public void testOne(Integer data) {
        Assert.assertEquals(1,1);
    }

    @Test(dataProvider = "test-data")
    public void testTwo(Integer data) {
        Assert.assertEquals(1,data.intValue());
    }

}
