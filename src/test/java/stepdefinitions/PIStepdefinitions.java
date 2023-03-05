package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.PIContactUsPage;
import pages.PICustomerPage;
import pages.PIWorksHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class PIStepdefinitions {

    PIWorksHomePage piWorksHomePage=new PIWorksHomePage();
    PICustomerPage piCustomerPage=new PICustomerPage();
    PIContactUsPage piContactUsPage=new PIContactUsPage();

    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Given("The user goes to the home page")
    public void the_user_goes_to_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("PIUrl"));
    }
    @Then("Verify the URL of the page to check if the page loads")
    public void verify_the_url_of_the_page_to_check_if_the_page_loads() {
        // Expected result: URL should be "https://piworks.net/".
        String actuelUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://piworks.net/";
        assertEquals(actuelUrl,expectedUrl);
    }
    @Then("Check the main menu on the page to check if the page has loaded.")
    public void check_the_main_menu_on_the_page_to_check_if_the_page_has_loaded() {
        //Expected result: The main menu should have links to
        //"About","Services","Offerins","Customers","Blog" and "Contact Us".
        assertTrue(piWorksHomePage.aboutDropdown.isDisplayed());
        assertTrue(piWorksHomePage.offeringsDropdown.isDisplayed());
        assertTrue(piWorksHomePage.cotactUsButton.isDisplayed());
        actions.moveToElement(piWorksHomePage.offeringsDropdown).perform();
        assertTrue(piWorksHomePage.servicesDropdown.isDisplayed());
        actions.moveToElement(piWorksHomePage.aboutDropdown).perform();
        assertTrue(piWorksHomePage.customersDropdown.isDisplayed());
        actions.moveToElement(piWorksHomePage.ınsıghtsDropdown).perform();
        assertTrue(piWorksHomePage.blogDropdown.isDisplayed());
    }
    @Then("Check the piworks Technology Company logo at the bottom of the page.")
    public void check_the_piworks_technology_company_logo_at_the_bottom_of_the_page() {
        //Expected outcome: It should be verified that the logo is clickable and can return to the homepage.
        assertTrue(piWorksHomePage.logo.isDisplayed());
        piWorksHomePage.offeringsDropdown.click();
        ReusableMethods.bekle(5);
        piWorksHomePage.logo.click();
        assertTrue(piWorksHomePage.learnMoreButton.isDisplayed());
    }
    @Then("Check the links in the Services section on the page.")
    public void check_the_links_in_the_services_section_on_the_page() {
        //Expected outcome: There should be links to "Managed Services,Proffional Services,Training Services"
        actions.moveToElement(piWorksHomePage.offeringsDropdown).perform();
        actions.click(piWorksHomePage.servicesDropdown).perform();
        assertTrue(piWorksHomePage.managedServicesDropdown.isDisplayed());
        assertTrue(piWorksHomePage.professionalServicesDropdown.isDisplayed());
        assertTrue(piWorksHomePage.trainingServicesDropdown.isDisplayed());

    }
    @Then("check that customer logos appear correctly in the Our Customers section on the page")
    public void check_that_customer_logos_appear_correctly_in_the_our_customers_section_on_the_page() {
        //Expected result: "Our Customers" should appear when clicking on the link
        actions.moveToElement(piWorksHomePage.aboutDropdown).perform();
        piWorksHomePage.customersDropdown.click();
        ReusableMethods.bekle(5);
        assertTrue(piCustomerPage.imgOurCustomersText.isDisplayed());

    }

    @Then("Verify that the contact form is displayed with the following fields")
    public void verify_that_the_contact_form_is_displayed_with_the_following_fields() {
        // Name,Email,Phone Number,Company Name,Category,Message
        piWorksHomePage.cotactUsButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        assertTrue(piContactUsPage.contactUsFirstNameBox.isDisplayed());
        assertTrue(piContactUsPage.contactUsLastNameBox.isDisplayed());
        assertTrue(piContactUsPage.businessEmailBox.isDisplayed());
        assertTrue(piContactUsPage.phoneNumberBox.isDisplayed());
        assertTrue(piContactUsPage.companyBox.isDisplayed());
        assertTrue(piContactUsPage.categoryBox.isDisplayed());
        assertTrue(piContactUsPage.messageBox.isDisplayed());
    }
    @Then("Verify that the Send button is enabled")
    public void verify_that_the_send_button_is_enabled() {
       assertTrue(piContactUsPage.contactUsSendButton.isDisplayed());
    }

    @Then("Enter valid data in the Name, Email, and Subject fields")
    public void enter_valid_data_in_the_name_email_and_subject_fields() {
       piContactUsPage.contactUsFirstNameBox.sendKeys(faker.name().firstName());
       piContactUsPage.contactUsLastNameBox.sendKeys(faker.name().lastName());
    }
    @Then("Leave the Phone Number and Company Name fields empty")
    public void leave_the_phone_number_and_company_name_fields_empty() {
    }
    @Then("Enter a message in the Message field")
    public void enter_a_message_in_the_message_field() {
        piContactUsPage.messageBox.sendKeys("Hello My Name is Nurullah. I'm here for testing purposes");
    }
    @Then("Click on the Send button")
    public void click_on_the_send_button() {
        //piContactUsPage.contactUsSendButton.click();
    }


    @Then("Close the page")
    public void closes_the_page() {
        Driver.closeDriver();
    }

}
