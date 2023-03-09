package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrendlifebuyDashboardPage;
import pages.TrendlifebuyHomePage;
import pages.TrendlifebuyNotificationsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TrendlifebuyStepdefinitons {
    TrendlifebuyHomePage homePage=new TrendlifebuyHomePage();
    TrendlifebuyNotificationsPage notificationsPage=new TrendlifebuyNotificationsPage();
    TrendlifebuyDashboardPage dashboardPage=new TrendlifebuyDashboardPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Go to the Trendlifebuy homepage.")
    public void go_to_the_trendlifebuy_homepage() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("tbUrl"));
    }
    @Then("User login is done")
    public void user_login_is_done() {
        homePage.loginLink.click();
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
        ReusableMethods.bekle(1);
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
        ReusableMethods.bekle(1);
        Assert.assertTrue(notificationsPage.updatedSuccessfully.isDisplayed());
    }

    @And("Closes the page")
    public void closesThePage() {
        Driver.closeDriver();
    }
    @Given("Check that the LOGOUT link is visible")
    public void check_that_the_logout_link_is_visible() {
        Assert.assertTrue(homePage.logoutLink.isDisplayed());
    }
    @Then("Click on the LOGOUT link")
    public void click_on_the_logout_link() {
        homePage.logoutLink.click();
    }
    @Then("Successfully logged out of account")
    public void successfully_logged_out_of_account() {
        Assert.assertTrue(homePage.loginLink.isDisplayed());
    }
    @Then("There must be a logout link in the list")
    public void there_must_be_a_logout_link_in_the_list() {
        actions.sendKeys(Keys.PAGE_DOWN)
                        .sendKeys(Keys.PAGE_DOWN)
                                .perform();
        Assert.assertTrue(dashboardPage.dasboardListLogoutLink.isDisplayed());

    }
    @Then("Logs out by pressing the logout link in the list")
    public void logs_out_by_pressing_the_logout_link_in_the_list() {

        ReusableMethods.bekle(1);
        dashboardPage.dasboardListLogoutLink.click();
        Assert.assertTrue(homePage.logoutLink.isDisplayed());
    }


}

