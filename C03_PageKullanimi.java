package tecproed.tests.day24_Properties_Pages;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import tecproed.pages.TestCenterPage;
import tecproed.utilities.ConfigReader;
import tecproed.utilities.Driver;

public class C03_PageKullanimi {


    @Test
    public void test1() {
        //https://testcenter.techproeducation.com/index.php?page=form-authentication
        Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));
        //Page object Model kullanarak sayfaya giriş yapildigini test edin
        TestCenterPage testCenterTechproPage = new TestCenterPage();
        testCenterTechproPage.username.sendKeys(ConfigReader.getProperty("kullaniciAdi"), Keys.TAB,
                ConfigReader.getProperty("kullaniciPassword"),Keys.ENTER);
        Assert.assertTrue(testCenterTechproPage.text.isDisplayed());
        //Sayfadan cikis yap ve cikis yapildigini test et
        testCenterTechproPage.logout.click();
        Assert.assertTrue(testCenterTechproPage.giris.isDisplayed());
    }
}
