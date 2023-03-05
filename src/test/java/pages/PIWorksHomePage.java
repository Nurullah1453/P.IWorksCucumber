package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PIWorksHomePage {

    public PIWorksHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='logo-piworks-5g']")
    public WebElement logo;
    @FindBy(xpath = "//a[text()='Learn More']")
    public WebElement learnMoreButton;
    @FindBy(xpath = "//a[text()='ABOUT']")
    public WebElement aboutDropdown;
    @FindBy(xpath = "//a[text()='OFFERINGS']")
    public WebElement offeringsDropdown;
    @FindBy(xpath = "//a[text()='INSIGHTS']")
    public WebElement ınsıghtsDropdown;
    @FindBy(xpath = "//li[text()='Services']")
    public WebElement servicesDropdown;
    @FindBy(xpath = "//span[text()='Contact Us']")
    public WebElement cotactUsButton;
    @FindBy(xpath = "//h5[text()='Customers']")
    public WebElement customersDropdown;
    @FindBy(xpath = "//h5[text()='Blog']")
    public WebElement blogDropdown;
    @FindBy(xpath = "//h5[text()='Managed Services']")
    public WebElement managedServicesDropdown;
    @FindBy(xpath = "//h5[text()='Professional Services']")
    public WebElement professionalServicesDropdown;
    @FindBy(xpath = "//h5[text()='Training Services']")
    public WebElement trainingServicesDropdown;

}
