import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {
    protected WebDriver driver = new ChromeDriver();
    protected addNewStorePage addNewStorePage;
    protected SignInPage signInPage;
    protected checkOutPage checkOutPage;


    @BeforeTest
    public void Setup() {

        driver.manage().window().maximize();
        driver.get("https://manager-dev.postscanmail.com/");
        addNewStorePage = new addNewStorePage(driver);
        signInPage = new SignInPage(driver);
        checkOutPage= new checkOutPage(driver);
    }

}
