package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {
    @FindBy(id="welcome")
    public WebElement welcomeAdminTxt;

    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }
}
