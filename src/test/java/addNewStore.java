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
        addNewStorePage.EnterEmail("operator4@softxpertdev.com");
        addNewStorePage.EnterConfirmEmail("operator4@softxpertdev.com");
        addNewStorePage.EnterPhone("11");
        addNewStorePage.Enterpassword("12345678");
        addNewStorePage.EnterBusinessName("4");
        addNewStorePage.SelectCountry("United States");
        addNewStorePage.EnterAddress("Address");
        addNewStorePage.EnterSuite("Suite");
        addNewStorePage.EnterCity("City");
        addNewStorePage.SelectState("Alabama");
        addNewStorePage.EnterPostalCode("1234");
        addNewStorePage.SelectTimeZone("Africa/Cairo");
        addNewStorePage.ClickOnSubmit();
    }
}
