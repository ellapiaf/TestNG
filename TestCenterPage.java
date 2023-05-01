package tecproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tecproed.utilities.Driver;

public class TestCenterPage {


    public TestCenterPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='exampleInputEmail1']")
    public WebElement username;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement text;

    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement logout;
    @FindBy(xpath = "//*[text()='Login Page']")
    public WebElement giris;

}

