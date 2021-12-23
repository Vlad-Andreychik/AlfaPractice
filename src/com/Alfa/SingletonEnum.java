package com.Alfa;

import org.openqa.selenium.chrome.ChromeDriver;

public enum SingletonEnum {
    DRIVER;

    ChromeDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "G:/Прога/Alfapractice/chromedriver.exe");
        return new ChromeDriver();
    }
}
