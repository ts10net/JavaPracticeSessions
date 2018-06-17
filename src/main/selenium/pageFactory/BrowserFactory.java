package main.selenium.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    //static WebDriver driver;

    public static WebDriver startBrowser(String browser, String url){
        WebDriver driver;

        if(browser.equals("firefox")){
            driver = new FirefoxDriver();
        }else{
            return null;
        }

        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}
