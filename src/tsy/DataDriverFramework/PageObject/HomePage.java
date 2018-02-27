package tsy.DataDriverFramework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tsy.DataDriverFramework.Util.MapElement;

public class HomePage {

	MapElement mapelement = new MapElement("./TSYProperties/HomePage.properties");
	private WebDriver driver;
	private WebElement element = null;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement middle_userinfo_buy() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.HomePage.middle.userinfo.buy"));
		return element;
	}
	
	public WebElement middle_userinfo_sell() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.HomePage.middle.userinfo.sell"));
		return element;
	}
	
	public WebElement middle_userinfo_login() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.HomePage.middle.userinfo.login"));
		return element;
	}
}
