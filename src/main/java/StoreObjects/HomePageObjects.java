package StoreObjects;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "*//div/ul/li[2]//a[@title='Dresses']")
	private WebElement dressestab;

	public WebElement getdressestab() {
		return dressestab;
	}
	
	public void clickdresses() {
		dressestab.click();
	}
	
	@FindBy(xpath = "*//a[@title='Women']")
	private WebElement womenstab;
	
	public WebElement getWomenstab() {
		return womenstab;
	}
	
	public void clickwomens() {
		womenstab.click();
	}
	
	@FindBy(xpath = "*//ul/li[3]/a[@title='T-shirts']")
	private WebElement Tshirtstab;
	
	public WebElement getTshirtstab() {
		return Tshirtstab;
	}
	
	public void clickTshirts() {
		Tshirtstab.click();
	}
	
	@FindBy(id="newsletter-input")
	private WebElement newsletter;
	
	@FindBy(name = "submitNewsletter")
	private WebElement submitnews;
	
	public WebElement getSubscriptiontab() {
		return newsletter;
	}
	
	public WebElement sendSubscription() {
		return submitnews;
	}
	
	public void getsubscription() {
		Random numb = new Random();
		int number = numb.nextInt(50000);
		setText(newsletter, "automation" + number + "@gmail.com");
		System.out.println(number);
		submitnews.click();
	}
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement subscriptionmessage;
	
	public WebElement getsubscribemessage() {
		return subscriptionmessage;
	}
	
	public String getsubscriptionmessage() {
		return subscriptionmessage.getText();
	}

}
