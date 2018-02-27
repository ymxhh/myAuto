package tsy.DataDriverFramework.ActionModules;

import org.openqa.selenium.WebDriver;

import tsy.DataDriverFramework.PageObject.LoginPage;
import tsy.DataDriverFramework.Util.Log;
import tsy.DataDriverFramework.Util.Constants.cons;

public class LoginAction {

	/**
	 * �ú��������ڶ����½����������������������ͬ��username�Ͳ�ͬ��password���
	 * @param driver
	 * @param username
	 * @param password
	 * @throws Exception
	 */
	public static void login(WebDriver driver, String username, String password) throws Exception {
		Log.info("���ʵ�½ҳ��");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountInput().sendKeys(username);
		loginpage.passwordInput().sendKeys(password);
		loginpage.loginButton().click();
	}
	
	
	/**
	 * ʹ����ȷ�û����������¼
	 * @param driver
	 * @param username
	 * @param password
	 * @throws Exception
	 */
	public static void LoginNormal_username(WebDriver driver, String username, String password) throws Exception {
		Log.info("���������ε�¼ҳ��");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("������ȷ�û���");
		loginpage.accountInput().sendKeys(username);
		Log.info("������ȷ����");
		loginpage.passwordInput().sendKeys(password);
		Thread.sleep(1000);
		Log.info("�����¼��ť");
		loginpage.loginButton().click();
		Log.info("�ȴ�3s");
		Thread.sleep(3000);
	}
	
	/**
	 * ʹ����ȷ�ֻ��š������¼
	 * @param driver
	 * @param mobile
	 * @param password
	 * @throws Exception
	 */
	public static void LoginNormal_mobile(WebDriver driver, String mobile, String password) throws Exception {
		Log.info("���������ε�¼ҳ��");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("������ȷ�ֻ���");
		loginpage.accountInput().sendKeys(mobile);
		Log.info("������ȷ����");
		loginpage.passwordInput().sendKeys(password);
		Thread.sleep(1000);
		Log.info("�����¼��ť");
		loginpage.loginButton().click();
		Log.info("�ȴ�2s");
		Thread.sleep(2000);
	}

	/**
	 * �˺������Ϊ��
	 * @param driver
	 * @param username_null
	 * @param password_null
	 * @throws Exception
	 */
	public static void LoginAbnormal_allnull(WebDriver driver, String username_null, String password_null) throws Exception {
		Log.info("���������ε�¼ҳ��");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("������˺�");
		loginpage.accountInput().sendKeys(username_null);
		Log.info("���������");
		loginpage.passwordInput().sendKeys(password_null);
		Thread.sleep(1000);
		Log.info("�����¼��ť");
		loginpage.loginButton().click();
		Log.info("�ȴ�2s");
		Thread.sleep(2000);
	}

	/**
	 * ������ȷ�û�����������
	 * @param driver
	 * @param username
	 * @param password_null
	 * @throws Exception
	 */
	public static void LoginAbnormal_pwdnull1(WebDriver driver, String username, String password_null) throws Exception {
		Log.info("���������ε�¼ҳ��");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("������ȷ�û���");
		loginpage.accountInput().sendKeys(username);
		Log.info("���������");
		loginpage.passwordInput().sendKeys(password_null);
		Thread.sleep(1000);
		Log.info("�����¼��ť");
		loginpage.loginButton().click();
		Log.info("�ȴ�2s");
		Thread.sleep(2000);
	}
	
	/**
	 * ������ȷ�ֻ��ţ�������
	 * @param driver
	 * @param mobile
	 * @param password_null
	 * @throws Exception
	 */
	public static void LoginAbnormal_pwdnull2(WebDriver driver, String mobile, String password_null) throws Exception {
		Log.info("���������ε�¼ҳ��");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("������ȷ�ֻ���");
		loginpage.accountInput().sendKeys(mobile);
		Log.info("���������");
		loginpage.passwordInput().sendKeys(password_null);
		Thread.sleep(1000);
		Log.info("�����¼��ť");
		loginpage.loginButton().click();
		Log.info("�ȴ�2s");
		Thread.sleep(2000);
	}
	
	/**
	 * ������ȷ�û�������������
	 * @param driver
	 * @param mobile
	 * @param password_null
	 * @throws Exception
	 */
	public static void LoginAbnormal_pwderror1(WebDriver driver, String username, String password_error) throws Exception {
		Log.info("���������ε�¼ҳ��");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("������ȷ�û���");
		loginpage.accountInput().sendKeys(username);
		Log.info("�����������");
		loginpage.passwordInput().sendKeys(password_error);
		Thread.sleep(1000);
		Log.info("�����¼��ť");
		loginpage.loginButton().click();
		Log.info("�ȴ�2s");
		Thread.sleep(2000);
	}
	
	/**
	 * ������ȷ�ֻ��ţ���������
	 * @param driver
	 * @param mobile
	 * @param password_null
	 * @throws Exception
	 */
	public static void LoginAbnormal_pwderror2(WebDriver driver, String mobile, String password_error) throws Exception {
		Log.info("���������ε�¼ҳ��");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("������ȷ�ֻ���");
		loginpage.accountInput().sendKeys(mobile);
		Log.info("�����������");
		loginpage.passwordInput().sendKeys(password_error);
		Thread.sleep(1000);
		Log.info("�����¼��ť");
		loginpage.loginButton().click();
		Log.info("�ȴ�2s");
		Thread.sleep(2000);
	}
	
	/**
	 * ����δע���ֻ���
	 * @param driver
	 * @param mobile_unregistered
	 * @param password
	 * @throws Exception
	 */
	public static void LoginAbnormal_unreg(WebDriver driver, String mobile_unregistered, String password_error) throws Exception {
		Log.info("���������ε�¼ҳ��");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("����δע���ֻ���");
		loginpage.accountInput().sendKeys(mobile_unregistered);
		Log.info("������������");
		loginpage.passwordInput().sendKeys(password_error);
		Thread.sleep(1000);
		Log.info("�����¼��ť");
		loginpage.loginButton().click();
		Log.info("�ȴ�2s");
		Thread.sleep(2000);
	}
	
	
}
