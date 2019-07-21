package StoreTestScripts;

import StoreObjects.BasePage;

import StoreObjects.DressesObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DressesTestScripts extends BasePage {
	
	DressesObjects dresses;
	BasePage bp;
	
	public DressesTestScripts() {
		dresses = new DressesObjects();
		bp = new BasePage();
	}
	
	@Test(enabled = true)
	public void verifytabs() {
		Assert.assertTrue(bp.elementFound(dresses.getdressestab()));
		Assert.assertTrue(bp.elementFound(dresses.getWomenstab()));
		Assert.assertTrue(bp.elementFound(dresses.getTshirtstab()));
	}
	
	@Test(enabled = true)
	public void verifydressestab() {
		dresses.clickdresses();
		Assert.assertTrue(bp.getTitlte().equals("Dresses - My Store"));
		}
	
	@Test(enabled = false)
	public void verifywomenstab() {
		dresses.clickwomens();
		Assert.assertTrue(bp.getTitlte().equals("Women - My Store"));
	}
	
	@Test(enabled = false)
	public void verifyTshirtstab() {
		dresses.clickTshirts();
		Assert.assertTrue(bp.getTitlte().equals("T-shirts - My Store"));
	}
	
	@Test(enabled = false)
	public void verifycasualdresses() {
		dresses.clickdresses();
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
	public void verifysubscription() {
		dresses.getsubscription();
		Assert.assertTrue(dresses.getsubscriptionmessage().contains("successfully subscribed"));
	}
	
	@Test(enabled = false)
	public void verifysociallink() {
		dresses.clickwomens();
		dresses.clickproduct();
		dresses.gotoFrame();
		Assert.assertTrue(bp.elementFound(dresses.getProduct()));
		Assert.assertTrue(bp.elementFound(dresses.getFacebook()));
		Assert.assertTrue(bp.elementFound(dresses.getTweet()));
		Assert.assertTrue(bp.elementFound(dresses.getProductDes()));
	}	
	
	@Test(enabled = false)
	public void verifyaddtocart() {
		dresses.clickwomens();
		dresses.clickproduct();
		dresses.gotoFrame();
		dresses.clickaddtocart();
		Assert.assertTrue(bp.elementFound(dresses.getsuccessmessage()));
	}
}
	
