package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendlifebuyNotificationsPage {
    public TrendlifebuyNotificationsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[10]")
    public WebElement notificationLink;

    @FindBy(xpath = "//th[text()='Title']")
    public WebElement notificationTitle;
    @FindBy(xpath = "//th[text()='Date']")
    public WebElement notificationDate;
    @FindBy(xpath = "//a[text()='View']")
    public WebElement viewLink;
    @FindBy(xpath = "//a[text()='Setting']")
    public WebElement notificationSettingButton;
    @FindBy(xpath = "(//span[@class='checkmark mr_15'])[1]")
    public WebElement typeChange;
    @FindBy(xpath = "//h4[text()='Notifications ']")
    public WebElement notificationTitleText;
    @FindBy(xpath = "//h4[text()='Package Code:  ' ]")
    public WebElement packageCodeTitle;
    @FindBy(xpath = "//div[text()='Updated successfully!']")
    public WebElement updatedSuccessfully;
}
