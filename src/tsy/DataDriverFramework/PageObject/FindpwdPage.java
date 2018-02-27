package tsy.DataDriverFramework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tsy.DataDriverFramework.Util.MapElement;

public class FindpwdPage {

	MapElement mapelement = new MapElement("./MapElement.properties");
	private WebElement element = null;
	private WebDriver driver;
	
	public FindpwdPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement mobileInput() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.FindpwdPage.mobielInput"));
		return element;
	}
	
	public WebElement getCheckCode() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.FindpwdPage.getCheckCode"));
		return element;
	}
	
	public WebElement checkCode() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.FindpwdPage.checkCode"));
		return element;
	}
	
	public WebElement newpwdInput() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.FindpwdPage.newpwdInput"));
		return element;
	}
	
	public WebElement okButton() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.FindpwdPage.okButton"));
		return element;
	}
}
