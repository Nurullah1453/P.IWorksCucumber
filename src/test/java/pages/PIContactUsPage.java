package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PIContactUsPage {
    public PIContactUsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@placeholder='First Name *']")
    public WebElement contactUsFirstNameBox;
    @FindBy(xpath = "//input[@placeholder='Last Name *']")
    public WebElement contactUsLastNameBox;

    @FindBy(xpath = "//input[@placeholder='Business E-Mail Address *']")
    public WebElement businessEmailBox;
    @FindBy(xpath = "//input[@placeholder='Company']")
    public WebElement companyBox;
    @FindBy(xpath = "//input[@placeholder='Business Phone']")
    public WebElement phoneNumberBox;
    @FindBy(xpath = "//select[@name='ContactCategory']")
    public WebElement categoryBox;
    @FindBy(xpath = "//textarea[@placeholder='Message*']")
    public WebElement messageBox;
    @FindBy(xpath = "//input[@name='GDPR']")
    public WebElement piWorksPolicy;
    @FindBy(xpath = "//button[text()='Send']")
    public WebElement contactUsSendButton;
}
