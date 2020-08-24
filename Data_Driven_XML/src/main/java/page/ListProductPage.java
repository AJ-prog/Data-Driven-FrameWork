package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListProductPage {


	WebDriver driver;
	public ListProductPage (WebDriver driver) {
	this.driver=driver;
}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/div/a")
	WebElement LIST_PRODUCTS_BUTTON_LOCATOR;
	
	public void clickOnListProductsButton() {
		LIST_PRODUCTS_BUTTON_LOCATOR.click();
	}
	
	
}