package tecproed.tests.day24_Properties_Pages.SmokeTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import tecproed.pages.BlueRentalPage;
import tecproed.utilities.ConfigReader;
import tecproed.utilities.Driver;
import tecproed.utilities.ReusableMethods;

public class NegativeTest {
    @Test
    public void test1() throws InterruptedException {
      /*
        Description:
        Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
        Acceptance Criteria
        Customer email: fake@bluerentalcars.com
        Customer password: fakepass
        Error:
        User with email fake@bluerentalcars.com not found
         */
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("fakeEmail"),
                Keys.TAB,ConfigReader.getProperty("fakepass"));
        blueRentalPage.login2.click();
        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi();
        Assert.assertTrue(blueRentalPage.hataMesaji.isDisplayed());
        Driver.closeDriver();

}}
