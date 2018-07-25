package tsy.DataDriverFramework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tsy.DataDriverFramework.Util.MapElement;

public class SellTradePage {

	private WebElement element = null;
	private MapElement mapelement = new MapElement("./MapElement.properties");
	private WebDriver driver;
	
	public SellTradePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSureAllButton() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.SellTradePage.sureAllButton"));
		return element;
	}
}
