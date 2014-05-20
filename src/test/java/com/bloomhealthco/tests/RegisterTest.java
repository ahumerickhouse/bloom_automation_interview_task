package com.bloomhealthco.tests;

import com.bloomhealthco.helpers.SeleniumBase;

import java.util.concurrent.TimeUnit;

public class RegisterTest {
    WebDriver driver;
    @Before
    public beforeTest() {
        driver = SeleniumBase.getWebDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.meetup.com/TC-TAG/");
    }

    @Test
    public registerTest() {

    }

    @After
    public afterTest() {
        driver.quit();
    }
}
