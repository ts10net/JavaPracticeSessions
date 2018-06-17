package main.selenium.pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WordPressLogin {
    @FindBy(id="user_login")
    private WebElement username;

    @FindBy(how=How.XPATH, using = "//*[@id=\"user_pass\"]")
    private WebElement password;

    @CacheLookup
    @FindBy(how=How.NAME, using = "wp-submit")
    private WebElement submit;

    public void loginSteps(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        submit.click();
    }
}
