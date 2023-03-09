package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendlifebuyHomePage {
    public TrendlifebuyHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement loginLink;
    @FindBy(xpath = "//a[text()='/ Logout']")
    public WebElement logoutLink;
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashBoardLink;
    @FindBy(xpath = "//input[@placeholder='Email address']")
    public WebElement loginEmailBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginPasswordBox;
    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement loginSingInButton;
}
