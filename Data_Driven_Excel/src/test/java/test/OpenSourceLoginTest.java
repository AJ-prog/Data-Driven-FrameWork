package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class OpenSourceLoginTest {
	static WebDriver driver;
	ExcelReader reader = new ExcelReader("./data/login.xlsx");
	String userName = reader.getCellData("Sheet1", "UserName", 2);
	String passwrod = reader.getCellData("Sheet1", "Password", 2);
	LoginPage loginpage;
	DashBoardPage dashBoardPage;

	@Test
	public void loginTest() throws InterruptedException {
		driver = BrowserFactory.startBrowser();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(userName, passwrod);
		Thread.sleep(2000);

		dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashBoardPage.isDashboardDisplay();
		BrowserFactory.ClosingBrowser();
	}

}