package StoreTestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import StoreObjects.BasePage;
import StoreObjects.HomePageObjects;

public class HomePageTests extends BasePage {
	
	HomePageObjects HomePage;
	BasePage bp;
	
	public HomePageTests() {
		HomePage = new HomePageObjects();
		bp = new BasePage();
	}
	
	@Test(enabled = true)
	public void verifytabs() {
		Assert.assertTrue(bp.elementFound(HomePage.getdressestab()));
		Assert.assertTrue(bp.elementFound(HomePage.getWomenstab()));
		Assert.assertTrue(bp.elementFound(HomePage.getTshirtstab()));
	}

	@Test(enabled = true)
	public void verifydressestab() {
		HomePage.clickdresses();
		Assert.assertTrue(bp.getTitlte().equals("Dresses - My Store"));
	}
	
	@Test(enabled = true)
	public void verifywomenstab() {
		HomePage.clickwomens();
		Assert.assertTrue(bp.getTitlte().equals("Women - My Store"));
	}
	
	@Test(enabled = true)
	public void verifyTshirtstab() {
		HomePage.clickTshirts();
		Assert.assertTrue(bp.getTitlte().equals("T-shirts - My Store"));
	}
	
	@Test(enabled = true)
	public void verifysubscription() {
		HomePage.getsubscription();
		Assert.assertTrue(HomePage.getsubscriptionmessage().contains("successfully subscribed"));
	}
}
