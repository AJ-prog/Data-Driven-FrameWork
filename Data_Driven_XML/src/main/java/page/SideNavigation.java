package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideNavigation {
	
	WebDriver driver;
	public SideNavigation(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[11]/a")
	WebElement PRODUCTS_AND_SERVICES_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[11]/ul/li[1]/a")
	WebElement PROUDCTS_LOCATOR;
	@FindBy(how=How.LINK_TEXT,using="New Product")
	WebElement NEW_PRODUCTS_LOCATOR;
	
	
	
	public void clickOnProductsAndServices() {
		PRODUCTS_AND_SERVICES_LOCATOR.click();
	}
	public void clickOnNewProducts() throws InterruptedException {
		Thread.sleep(2000);
		NEW_PRODUCTS_LOCATOR.click();
	}
	
		
}