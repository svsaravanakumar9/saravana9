package StoreTestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import StoreObjects.BasePage;
import StoreObjects.DressesObjects;
import StoreObjects.HomePageObjects;
import StoreObjects.ProductDetailsObjects;

public class ProductDetailsTests extends BasePage {

	ProductDetailsObjects ProductObjects;
	BasePage bp;
	DressesObjects dresses;
	HomePageObjects HomePage;
	
	public ProductDetailsTests() {
		ProductObjects = new ProductDetailsObjects();
		bp = new BasePage();
		dresses = new DressesObjects();
		HomePage = new HomePageObjects();
	}
	
	
	@Test(enabled = true)
	public void verifysociallink() {
		HomePage.clickwomens();
		dresses.clickproduct();
		dresses.gotoFrame();
		Assert.assertTrue(bp.elementFound(dresses.getProduct()));
		Assert.assertTrue(bp.elementFound(ProductObjects.getFacebook()));
		Assert.assertTrue(bp.elementFound(ProductObjects.getTweet()));
		Assert.assertTrue(bp.elementFound(ProductObjects.getProductDes()));
	}	
}
