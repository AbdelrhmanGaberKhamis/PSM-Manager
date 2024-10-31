import org.testng.Assert;
import org.testng.annotations.Test;

public class signIn extends TestBase{
@Test
public void signinScenario()
{
    signInPage.EnterUserName();
    signInPage.EnterPassword();
    signInPage.ClickOnLoginBtn();
}
}

