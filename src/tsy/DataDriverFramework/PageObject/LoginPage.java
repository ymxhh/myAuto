package tsy.DataDriverFramework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tsy.DataDriverFramework.Util.MapElement;

public class LoginPage {

	private WebElement element = null;
	private MapElement mapelement = new MapElement("./MapElement.properties");
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * 返回登录页用户名/手机号输入框页面元素对象
	 * @throws Exception 
	 */
	public WebElement accountInput() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.LoginPage.accountInput"));
		return element;
	}
	
	/**
	 * 返回登录页用户密码输入框页面元素对象
	 * @return
	 * @throws Exception
	 */
	public WebElement passwordInput() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.LoginPage.passwordInput"));
		return element;
	}
	
	/**
	 * 返回登录页登录按钮页面元素对象
	 * @return
	 * @throws Exception
	 */
	public WebElement loginButton() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.LoginPage.loginButton"));
		return element;
	}
	
	/**
	 * 返回“账户登录”页面元素对象
	 * @return
	 * @throws Exception
	 */
	public WebElement accountLogin() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.LoginPage.accountLogin"));
//		element = driver.findElement(mapelement.getLocator("class>.right"));
		return element;
	}
	
	/**
	 * 返回“扫码登录”页面元素对象
	 * @return
	 * @throws Exception
	 */
	public WebElement qrcodeLogin() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.LoginPage.qrcodeLogin"));
		return element;
	}
	
	
}
