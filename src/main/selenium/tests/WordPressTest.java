package main.selenium.tests;

import main.selenium.pageFactory.BrowserFactory;
import main.selenium.pageObjectModel.WordPressLogin;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class WordPressTest {
    WebDriver driver;
    String url, user, pass;

    @Before
    public void before(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\tusha\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
        url = "http://demosite.center/wordpress/wp-login.php";
        user = "admin";
        pass = "demo123";
    }

    @Test
    public void simpleLoginTest(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        WordPressLogin wordPressLogin = new WordPressLogin(driver);
        wordPressLogin.setUserName(user);
        wordPressLogin.setPassword(pass);
        wordPressLogin.clickSubmit();
        driver.close();
    }

    @Test
    public void pageFactoryLoginTest(){
        driver = BrowserFactory.startBrowser("firefox", url);
        main.selenium.pageFactory.WordPressLogin wordPressLogin = PageFactory.initElements(driver, main.selenium.pageFactory.WordPressLogin.class);
        wordPressLogin.loginSteps(user, pass);
    }
}
