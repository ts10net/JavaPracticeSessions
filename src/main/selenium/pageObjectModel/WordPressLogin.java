package main.selenium.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class WordPressLogin {
    private WebDriver driver;
    private By username = By.id("user_login");
    private By password = By.xpath("//*[@id=\"user_pass\"]");
    private By submit = By.name("wp-submit");

    public WordPressLogin(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String userName){
        driver.findElement(username).sendKeys(userName);
    }

    public void setPassword(String passWord){
        driver.findElement(password).sendKeys(passWord);
    }

    public void clickSubmit(){
        driver.findElement(submit).click();
    }
}
