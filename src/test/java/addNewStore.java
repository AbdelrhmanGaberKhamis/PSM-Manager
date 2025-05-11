import org.testng.annotations.Test;

public class addNewStore extends TestBase{
    @Test
    public void addnewStore()
    {
        signInPage.EnterUserName();
        signInPage.EnterPassword();
        signInPage.ClickOnLoginBtn();
        addNewStorePage.EnterFirstName("OperatorFname");
        addNewStorePage.EnterLastName("OperatorLname");
        addNewStorePage.EnterEmail("operator543@softxpertdev.com");
        addNewStorePage.EnterConfirmEmail("operator543@softxpertdev.com");
        addNewStorePage.EnterPhone("11");
        addNewStorePage.Enterpassword("12345678");
        addNewStorePage.EnterBusinessName("testAbdelrhman23");
        addNewStorePage.SelectCountry("United States");
        addNewStorePage.EnterAddress("alaska");
        addNewStorePage.EnterSuite("Suite");
        addNewStorePage.EnterCity("alaskaCity2");
        addNewStorePage.SelectState("Alaska");
        addNewStorePage.EnterPostalCode("1234");
        addNewStorePage.SelectTimeZone("Africa/Cairo");
        addNewStorePage.ClickOnSubmit();
    }
}
