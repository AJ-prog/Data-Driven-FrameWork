package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"wpbody-content\"]/div[4]/h1")
	WebElement DASHBOARD_TITLE;

	public void isDashboardDisplay() {
		Assert.assertEquals(DASHBOARD_TITLE.getText(), "Dashboard", "You in the wrong page!!");
	}

}