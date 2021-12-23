package com.Alfa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {
    private static SingletonDriver driverInstance = null;
    private static WebDriver driver;

    private SingletonDriver(){
        System.setProperty("webdriver.chrome.driver", "G:/Прога/Alfapractice/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static SingletonDriver getInstance(){
        if (driverInstance == null){
            driverInstance = new SingletonDriver();
        }
        return driverInstance;
    }

    public WebDriver getDriver(){
        return driver;
    }

}
