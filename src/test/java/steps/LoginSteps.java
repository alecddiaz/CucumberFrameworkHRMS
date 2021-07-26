package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Constants;

public class LoginSteps extends CommonMethods {
    @Given("user is on SYNTAX HRMS login page")
    public void user_is_on_syntax_hrms_login_page() {
        setUp();
    }

    @When("user enters valid credentials within Username textbox")
    public void user_enters_valid_credentials_within_username_textbox() {
        LoginPage loginPage=new LoginPage();
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        sendText(loginPage.usernameTxtbox, ConfigReader.getPropertyValue("username"));
    }

    @When("user enters valid credentials within Password textbox")
    public void user_enters_valid_credentials_within_password_textbox() {
        LoginPage loginPage=new LoginPage();
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        sendText(loginPage.passwordTxtBox,ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks ‘LOGIN’  button")
    public void user_clicks_login_button() {
        LoginPage loginPage=new LoginPage();
        click(loginPage.loginBtn);
    }

    @Then("the Dashboard will display logged in as admin")
    public void the_dashboard_will_display_logged_in_as_admin() {
        DashboardPage dashboardPage=new DashboardPage();
        Assert.assertEquals("Welcome Admin",dashboardPage.welcomeAdminTxt.getText());
        teardown();
    }

}
