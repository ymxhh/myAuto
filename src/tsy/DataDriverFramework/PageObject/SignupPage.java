package tsy.DataDriverFramework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tsy.DataDriverFramework.Util.MapElement;

public class SignupPage {

	private WebElement element = null;
	private MapElement mapelement = new MapElement("./MapElement.properties");
	private WebDriver driver;
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement mobileInput() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.SignupPage.mobileInput"));
		return element;
	}
	
	public WebElement getCheckCode() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.SignupPage.getCheckCode"));
		return element;
	}
	
	public WebElement checkCode() {
		try {
			element = driver.findElement(mapelement.getLocator("TSY.SignupPage.checkCode"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return element;
	}
	
	public WebElement passwordInput() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.SignupPage.passwordInput"));
		return element;
	}
	
	public WebElement agree() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.SignupPage.agree"));
		return element;
	}
	
	public WebElement signupButton() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.SignupPage.signupButton"));
		return element;
	}
}
