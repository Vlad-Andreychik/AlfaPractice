package com.Alfa.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverFactory {
    private WebDriver driver;


    @Override
    public void createDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver",
                    "G:/Прога/Alfapractice/chromedriver.exe");
            driver = new ChromeDriver();
        }
    }
}
