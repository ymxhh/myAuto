package tsy.DataDriverFramework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tsy.DataDriverFramework.Util.MapElement;

public class GoodsPage {
	
	MapElement mapelement = new MapElement("./TSYProperties/GoodsPage.priperties");
	private WebDriver driver;
	private WebElement element;
	
	public GoodsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void jqueryTest() {
		
	}
}
