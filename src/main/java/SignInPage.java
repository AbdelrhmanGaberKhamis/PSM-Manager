import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends PageBase
{
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    private By userName= By.id("username-input-field");
    private By password=By.id("password-input-field");
    private By loginBtn=By.cssSelector("#login-form > div > form > button");
    private By forgetPasswordBtn=By.cssSelector("#login-form > div > form > div.form-group.col-auto > a");
    public void EnterUserName()
    {
        driver.findElement(userName).sendKeys("helmy");
    }
    public void EnterPassword()
    {
        driver.findElement(password).sendKeys("1234");
    }
    public void ClickOnLoginBtn()
    {
        driver.findElement(loginBtn).click();
    }

}
