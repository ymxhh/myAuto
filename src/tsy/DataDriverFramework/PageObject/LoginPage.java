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
	 * ���ص�¼ҳ�û���/�ֻ��������ҳ��Ԫ�ض���
	 * @throws Exception 
	 */
	public WebElement accountInput() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.LoginPage.accountInput"));
		return element;
	}
	
	/**
	 * ���ص�¼ҳ�û����������ҳ��Ԫ�ض���
	 * @return
	 * @throws Exception
	 */
	public WebElement passwordInput() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.LoginPage.passwordInput"));
		return element;
	}
	
	/**
	 * ���ص�¼ҳ��¼��ťҳ��Ԫ�ض���
	 * @return
	 * @throws Exception
	 */
	public WebElement loginButton() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.LoginPage.loginButton"));
		return element;
	}
	
	/**
	 * ���ء��˻���¼��ҳ��Ԫ�ض���
	 * @return
	 * @throws Exception
	 */
	public WebElement accountLogin() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.LoginPage.accountLogin"));
//		element = driver.findElement(mapelement.getLocator("class>.right"));
		return element;
	}
	
	/**
	 * ���ء�ɨ���¼��ҳ��Ԫ�ض���
	 * @return
	 * @throws Exception
	 */
	public WebElement qrcodeLogin() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.LoginPage.qrcodeLogin"));
		return element;
	}
	
	
}
