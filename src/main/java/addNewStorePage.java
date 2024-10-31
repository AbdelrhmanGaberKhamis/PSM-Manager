import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class addNewStorePage extends PageBase
{
    public addNewStorePage(WebDriver driver) {
        super(driver);
    }
    private By firstName=By.cssSelector("#fname");
    private By lastName=By.id("lname");
    private By phone=By.id("phone");

    private By email=By.id("email");

    private By confirmEmail=By.id("cemail");

    private By password=By.id("password");
    private By businessName=By.id("bname");
    private By address=By.id("address");
    private By suite=By.id("suite");

    private By city=By.id("city");

    private By postalcode=By.id("postalcode");
    private By state=By.cssSelector("#store-creation > form > div:nth-child(2) > div > div:nth-child(8) > select");
    private By armedForceoption=By.cssSelector("#store-creation > form > div:nth-child(2) > div > div:nth-child(8) > select > option:nth-child(2)");
    private By supportPhone=By.id("");
    private By submit=By.cssSelector("#store-creation > form > div.action-buttons > button.btn.btn-success.psm-primary-button");

    private By countryDropdown=By.cssSelector("select[formcontrolname='country_code']");
    private By stateDropdown=By.cssSelector("select[formcontrolname='state']");
    private By timeZoneDropdown=By.cssSelector("select[formcontrolname='timeZone']");

    public void EnterFirstName(String firstname)
    {
        wait=new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(firstName));
        driver.findElement(firstName).sendKeys(firstname);
    }


    public void EnterLastName(String lastname)
    {
        driver.findElement(lastName).sendKeys(lastname);
    }
    public void EnterPhone(String phonenumber)
    {
        driver.findElement(phone).sendKeys(phonenumber);
    }
    public void EnterEmail(String Email)
    {
        driver.findElement(email).sendKeys(Email);
    }
    public void EnterConfirmEmail(String confrimemail)
    {
        driver.findElement(confirmEmail).sendKeys(confrimemail);
    }
    public void Enterpassword(String Password)
    {
        driver.findElement(password).sendKeys(Password);
    }
    public void EnterBusinessName(String BusinessName)
    {
        wait=new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(businessName));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(businessName));
        driver.findElement(businessName).click();
        driver.findElement(businessName).sendKeys(BusinessName);
    }

    public void SelectCountry(String country)
    {
        Select select;
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(countryDropdown)); // Wait for the dropdown to be present

        // Find the dropdown element
        WebElement dropdownElement = driver.findElement(countryDropdown);

        // Create a Select object for the dropdown
        select = new Select(dropdownElement);

        // Select the country by visible text
        select.selectByVisibleText(country);

    }

    public void EnterAddress(String Address)
    {
        driver.findElement(address).click();
        driver.findElement(address).sendKeys(Address);
    }
    public void EnterSuite(String Suite)
    {
        driver.findElement(suite).click();
        driver.findElement(suite).sendKeys(Suite);
    }
    public void EnterCity(String City)
    {
        driver.findElement(city).click();
        driver.findElement(city).sendKeys(City);
    }

    public void SelectState(String State)
    {
        Select select;
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(stateDropdown)); // Wait for the dropdown to be present

        // Find the dropdown element
        WebElement dropdownElement = driver.findElement(stateDropdown);

        // Create a Select object for the dropdown
        select = new Select(dropdownElement);

        // Select the country by visible text
        select.selectByVisibleText(State);

    }

    public void EnterPostalCode(String PostalCode)
    {
        driver.findElement(postalcode).sendKeys(PostalCode);
    }

    public void SelectTimeZone(String TimeZone)
    {
        Select select;
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(timeZoneDropdown)); // Wait for the dropdown to be present

        // Find the dropdown element
        WebElement dropdownElement = driver.findElement(timeZoneDropdown);

        // Create a Select object for the dropdown
        select = new Select(dropdownElement);

        // Select the country by visible text
        select.selectByVisibleText(TimeZone);

    }

    public void ClickOnSubmit()
    {
        driver.findElement(submit).click();
    }



//    public void clickOnProvince()
//    {
//        driver.findElement(province).click();
//        wait=new WebDriverWait(driver,Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(provinceList));
//        wait.until(ExpectedConditions.elementToBeClickable(provinceSearch));
//        driver.findElement(provinceSearch).sendKeys("Eastern province");
//        driver.findElement(provinceType).click();
//    }
//    public void clickOnCity()
//    {
//        wait=new WebDriverWait(driver,Duration.ofSeconds(3));
//        driver.findElement(city2).click();
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cityList2));
//        wait.until(ExpectedConditions.elementToBeClickable(citySearch2));
//        try {
//            Thread.sleep(2000); // 2000 milliseconds = 2 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.findElement(citySearch2).sendKeys("Dammam");
//        driver.findElement(cityType2).click();
//    }
//
//    public void setDistrict()
//    {
//        wait=new WebDriverWait(driver,Duration.ofSeconds(3));
//        driver.findElement(district).click();
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(districtList));
//        wait.until(ExpectedConditions.elementToBeClickable(districtSearch));
//        try {
//            Thread.sleep(2000); // 2000 milliseconds = 2 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.findElement(districtSearch).sendKeys("Ad Dab");
//        driver.findElement(districtSearch).sendKeys(Keys.BACK_SPACE );
//        driver.findElement(districtSearch).sendKeys("bab");
//        driver.findElement(districtSearch).sendKeys(Keys.ENTER);
//    }
//    public void clickOnBookNowBtn()
//    {
//     driver.findElement(BookNowBtn).click();
//    }
//    public void clickOnUpdateNowBtn()
//    {
//        driver.findElement(updateNowBtn).click();
//    }
//    public void chooseCountryOfExpertise()
//    {
//        wait=new WebDriverWait(driver,Duration.ofSeconds(3));
//        driver.findElement(country).click();
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(countryList));
//        wait.until(ExpectedConditions.elementToBeClickable(countrySearch));
//        try {
//            Thread.sleep(2000); // 2000 milliseconds = 2 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.findElement(countrySearch).sendKeys("Philippines");
//        driver.findElement(districtSearch).sendKeys(Keys.ENTER);
//    }
//    public void chooseAdress()
//    {
//        driver.findElement(address).click();
//    }
//
//    public void chooseNumberOfVisits()
//    {
//        try {
//            Thread.sleep(2000); // 2000 milliseconds = 2 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.findElement(numberOfVisits).click();
//    }
//    public void chooseDate()
//    {
//        try {
//            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.findElement(date).click();
//    }
//    public checkOutPage clickOnNextBtn()
//    {
//        wait=new WebDriverWait(driver,Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
//        driver.findElement(nextBtn).click();
//        return new checkOutPage(driver);
//    }
}
