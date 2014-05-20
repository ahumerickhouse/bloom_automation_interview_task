package com.bloomhealthco.helpers;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by Aaron on 4/28/2014.
 */
public class SeleniumBase {
    static public WebDriver getWebDriver() {
        String browser = System.getProperty("selenium.browser");
        if (browser == null ) {
           return new FirefoxDriver();
        } else {
            if (browser.equals("firefox")) {
                return new FirefoxDriver();
            } else if (browser.equals("ie")) {
                System.setProperty("webdriver.ie.driver", "C:\\Users\\Aaron\\IdeaProjects\\SingleClickDemo\\src\\test\\resources\\IEDriverServer.exe");
                DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                return new InternetExplorerDriver(caps);
            } else if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aaron\\IdeaProjects\\SingleClickDemo\\src\\test\\resources\\chromedriver.exe");
                return new ChromeDriver();
            } else {
                throw new IllegalArgumentException("Invalid Selenium Driver: " + browser);
            }
        }
    }
}
