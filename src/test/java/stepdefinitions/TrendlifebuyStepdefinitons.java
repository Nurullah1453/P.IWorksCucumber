package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrendlifebuyHomePage;
import pages.TrendlifebuyNotificationsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TrendlifebuyStepdefinitons {
    TrendlifebuyHomePage homePage=new TrendlifebuyHomePage();
    TrendlifebuyNotificationsPage notificationsPage=new TrendlifebuyNotificationsPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Go to the Trendlifebuy homepage.")
    public void go_to_the_trendlifebuy_homepage() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("tbUrl"));
    }
    @Then("Login button is clicked")
    public void login_button_is_clicked() {
        homePage.loginLink.click();
    }
    @Then("User login is done")
    public void user_login_is_done() {
        homePage.loginEmailBox.sendKeys(ConfigReader.getProperty("tbEmail"));
        homePage.loginPasswordBox.sendKeys(ConfigReader.getProperty("tbPassword"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        homePage.loginSingInButton.click();
    }
    @Then("Dashboard button is clicked")
    public void dashboard_button_is_clicked() {
        homePage.dashBoardLink.click();
    }
    @Then("Click on the Notification link and test that the page is accessible")
    public void click_on_the_notification_link_and_test_that_the_page_is_accessible() {
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        notificationsPage.notificationLink.click();
        Assert.assertTrue(notificationsPage.notificationTitleText.isDisplayed());
    }

    @And("Verifies that incoming notifications are visible")
    public void verifiesThatIncomingNotificationsAreVisible() {
        Assert.assertTrue(notificationsPage.viewLink.isDisplayed());
    }

    @And("Notifications title and date headers are verified to be present")
    public void notificationsTitleAndDateHeadersAreVerifiedToBePresent() {
        Assert.assertTrue(notificationsPage.notificationTitle.isDisplayed());
        Assert.assertTrue(notificationsPage.notificationDate.isDisplayed());
    }

    @Then("Click on the Viev link")
    public void clickOnTheVievLink() {
        notificationsPage.viewLink.click();
    }

    @And("Confirms navigating to the page with notifications")
    public void confirmsNavigatingToThePageWithNotifications() {
        Assert.assertTrue(notificationsPage.packageCodeTitle.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(5);
    }

    @Then("Click the Setting button")
    public void clickTheSettingButton() {
        notificationsPage.notificationSettingButton.click();
    }

    @And("Confirm that the type is changeable on the Setting link")
    public void confirmThatTheTypeIsChangeableOnTheSettingLink() {
        notificationsPage.typeChange.click();
        Assert.assertTrue(notificationsPage.updatedSuccessfully.isDisplayed());
    }
}
