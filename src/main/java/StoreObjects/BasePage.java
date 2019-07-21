package StoreObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	public static WebDriver driver;
	public String browser = "chrome";

	public BasePage() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\SARAN\\Desktop\\Chrome driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} /*else if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "Firefox Driver Server Path");
				driver = new FirefoxDriver();
			}*/
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		}
	}

	public boolean elementFound(WebElement element) {
		boolean res = false;
		try {
			res = element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public void setText(WebElement element, String name) {
		if (name != null) {
			element.click();
			element.clear();
			element.sendKeys(name);
		}
	}
	public String getTitlte() {
		return driver.getTitle();
	}
	
	public void getintoframe(WebElement fram) {
		driver.switchTo().frame(fram);
	}
	
	public void getintodefault() {
		driver.switchTo().defaultContent();
	}


}
