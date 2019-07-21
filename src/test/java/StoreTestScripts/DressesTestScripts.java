package StoreTestScripts;

import StoreObjects.BasePage;

import StoreObjects.DressesObjects;
import StoreObjects.HomePageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DressesTestScripts extends BasePage {
	
	DressesObjects dresses;
	BasePage bp;
	HomePageObjects HomePage;
	
	public DressesTestScripts() {
		dresses = new DressesObjects();
		bp = new BasePage();
		HomePage = new HomePageObjects();
	}
	
	@Test(enabled = true)
	public void verifycasualdresses() {
		HomePage.clickdresses();
		dresses.clickcasualdresses();
		Assert.assertTrue(bp.getTitlte().equals("Casual Dresses - My Store"));
	}
	
	@Test(enabled = false)
	public void verifysize() {
		Assert.assertTrue(bp.elementFound(dresses.getSmall()));
		Assert.assertTrue(bp.elementFound(dresses.getMedium()));
		Assert.assertTrue(bp.elementFound(dresses.getLarge()));
	}
	
	@Test(enabled = false)
	public void verifyproductcount() {
		int totalnum = dresses.getHeadcount();
		int prodcount = dresses.getProductcount();
		Assert.assertTrue(totalnum == prodcount);
	}
	
	@Test(enabled = false)
	public void verifyaddtocart() {
		HomePage.clickwomens();
		dresses.clickproduct();
		dresses.gotoFrame();
		dresses.clickaddtocart();
		Assert.assertTrue(bp.elementFound(dresses.getsuccessmessage()));
	}
}
	
