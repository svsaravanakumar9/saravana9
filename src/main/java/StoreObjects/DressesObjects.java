package StoreObjects;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesObjects extends BasePage {

	public DressesObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div/ul/li/a[contains(@title,'You are looking for a dress')]")
	private WebElement casualdresses;

	public WebElement getcasualdresses() {
		return casualdresses;
	}
	
	public void clickcasualdresses() {
		casualdresses.click();
	}

	@FindBy(xpath = "//label/a[contains(@href,'category#size-s')]")
	private WebElement small;

	public WebElement getSmall() {
		return small;
	}

	@FindBy(xpath = "//label/a[contains(@href,'category#size-m')]")
	private WebElement medium;

	public WebElement getMedium() {
		return medium;
	}

	@FindBy(xpath = "//label/a[contains(@href,'category#size-l')]")
	private WebElement large;

	public WebElement getLarge() {
		return large;
	}

	@FindBy(xpath = "//span[@class='heading-counter']")
	private WebElement headcount;

	public int getHeadcount() {
		String text = headcount.getText();
		String arr[] = text.split(" ");
		String textnum = arr[2];
		int totalcount = Integer.parseInt(textnum);
		return totalcount;
		
		//return Integer.parseInt(headcount.getText().split("")[2]);
	}

	@FindBys(@FindBy(xpath = "//ul[@class='product_list grid row']/li"))
	private List<WebElement> productcount;

	public int getProductcount() {
		return productcount.size();
	}
	
	@FindBy(xpath = "*//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement product;
	
	public WebElement getProduct() {
		return product;
	}
	
	public void clickproduct() {
		product.click();
	}
	
	@FindBy(xpath = "*//button[@class='exclusive']")
	private WebElement addtocart;
	
	public WebElement addproductTocart() {
		return addtocart;
	}
	
	public void clickaddtocart() {
		addtocart.click();
	}
	
	@FindBy(xpath = "*//i[@class='icon-ok']")
	private WebElement successfulmessage;
	
	public WebElement getsuccessmessage() {
		return successfulmessage;
	}
	
	@FindBy(xpath = "*//iframe[contains(@id,'fancybox-frame')]")
	private WebElement productframe;
	
	public WebElement getproductframe() {
		return productframe;
	}
	
	public void gotoFrame() {
		getintoframe(productframe);
	}
}
