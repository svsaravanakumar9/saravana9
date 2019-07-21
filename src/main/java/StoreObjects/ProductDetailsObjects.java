package StoreObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsObjects extends BasePage {

	public ProductDetailsObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "*//button[contains(@onclick,'socialsharing_twitter_click')]")
	private WebElement tweet;
	
	public WebElement getTweet() {
		return tweet;
	}
	
	@FindBy(xpath = "*//button[contains(@onclick,'socialsharing_facebook_click();')]")
	private WebElement facebook;
	
	public WebElement getFacebook() {
		return facebook;
	}
	
	@FindBy(id = "short_description_content")
	private WebElement productdescription;
	
	public WebElement getProductDes() {
		return productdescription;
	}
}
