package tsy.DataDriverFramework.ActionModules;

import org.openqa.selenium.WebDriver;

import tsy.DataDriverFramework.PageObject.LoginPage;
import tsy.DataDriverFramework.Util.Log;
import tsy.DataDriverFramework.Util.Constants.cons;

public class LoginAction {

	/**
	 * 该函数可用于多个登陆测试用例，数据驱动，不同和username和不同的password组合
	 * @param driver
	 * @param username
	 * @param password
	 * @throws Exception
	 */
	public static void login(WebDriver driver, String username, String password) throws Exception {
		Log.info("访问登陆页面");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountInput().sendKeys(username);
		loginpage.passwordInput().sendKeys(password);
		loginpage.loginButton().click();
	}
	
	
	/**
	 * 使用正确用户名、密码登录
	 * @param driver
	 * @param username
	 * @param password
	 * @throws Exception
	 */
	public static void LoginNormal_username(WebDriver driver, String username, String password) throws Exception {
		Log.info("访问淘手游登录页面");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("输入正确用户名");
		loginpage.accountInput().sendKeys(username);
		Log.info("输入正确密码");
		loginpage.passwordInput().sendKeys(password);
		Thread.sleep(1000);
		Log.info("点击登录按钮");
		loginpage.loginButton().click();
		Log.info("等待3s");
		Thread.sleep(3000);
	}
	
	/**
	 * 使用正确手机号、密码登录
	 * @param driver
	 * @param mobile
	 * @param password
	 * @throws Exception
	 */
	public static void LoginNormal_mobile(WebDriver driver, String mobile, String password) throws Exception {
		Log.info("访问淘手游登录页面");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("输入正确手机号");
		loginpage.accountInput().sendKeys(mobile);
		Log.info("输入正确密码");
		loginpage.passwordInput().sendKeys(password);
		Thread.sleep(1000);
		Log.info("点击登录按钮");
		loginpage.loginButton().click();
		Log.info("等待2s");
		Thread.sleep(2000);
	}

	/**
	 * 账号密码均为空
	 * @param driver
	 * @param username_null
	 * @param password_null
	 * @throws Exception
	 */
	public static void LoginAbnormal_allnull(WebDriver driver, String username_null, String password_null) throws Exception {
		Log.info("访问淘手游登录页面");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("输入空账号");
		loginpage.accountInput().sendKeys(username_null);
		Log.info("输入空密码");
		loginpage.passwordInput().sendKeys(password_null);
		Thread.sleep(1000);
		Log.info("点击登录按钮");
		loginpage.loginButton().click();
		Log.info("等待2s");
		Thread.sleep(2000);
	}

	/**
	 * 输入正确用户名，空密码
	 * @param driver
	 * @param username
	 * @param password_null
	 * @throws Exception
	 */
	public static void LoginAbnormal_pwdnull1(WebDriver driver, String username, String password_null) throws Exception {
		Log.info("访问淘手游登录页面");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("输入正确用户名");
		loginpage.accountInput().sendKeys(username);
		Log.info("输入空密码");
		loginpage.passwordInput().sendKeys(password_null);
		Thread.sleep(1000);
		Log.info("点击登录按钮");
		loginpage.loginButton().click();
		Log.info("等待2s");
		Thread.sleep(2000);
	}
	
	/**
	 * 输入正确手机号，空密码
	 * @param driver
	 * @param mobile
	 * @param password_null
	 * @throws Exception
	 */
	public static void LoginAbnormal_pwdnull2(WebDriver driver, String mobile, String password_null) throws Exception {
		Log.info("访问淘手游登录页面");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("输入正确手机号");
		loginpage.accountInput().sendKeys(mobile);
		Log.info("输入空密码");
		loginpage.passwordInput().sendKeys(password_null);
		Thread.sleep(1000);
		Log.info("点击登录按钮");
		loginpage.loginButton().click();
		Log.info("等待2s");
		Thread.sleep(2000);
	}
	
	/**
	 * 输入正确用户名，错误密码
	 * @param driver
	 * @param mobile
	 * @param password_null
	 * @throws Exception
	 */
	public static void LoginAbnormal_pwderror1(WebDriver driver, String username, String password_error) throws Exception {
		Log.info("访问淘手游登录页面");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("输入正确用户名");
		loginpage.accountInput().sendKeys(username);
		Log.info("输入错误密码");
		loginpage.passwordInput().sendKeys(password_error);
		Thread.sleep(1000);
		Log.info("点击登录按钮");
		loginpage.loginButton().click();
		Log.info("等待2s");
		Thread.sleep(2000);
	}
	
	/**
	 * 输入正确手机号，错误密码
	 * @param driver
	 * @param mobile
	 * @param password_null
	 * @throws Exception
	 */
	public static void LoginAbnormal_pwderror2(WebDriver driver, String mobile, String password_error) throws Exception {
		Log.info("访问淘手游登录页面");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("输入正确手机号");
		loginpage.accountInput().sendKeys(mobile);
		Log.info("输入错误密码");
		loginpage.passwordInput().sendKeys(password_error);
		Thread.sleep(1000);
		Log.info("点击登录按钮");
		loginpage.loginButton().click();
		Log.info("等待2s");
		Thread.sleep(2000);
	}
	
	/**
	 * 输入未注册手机号
	 * @param driver
	 * @param mobile_unregistered
	 * @param password
	 * @throws Exception
	 */
	public static void LoginAbnormal_unreg(WebDriver driver, String mobile_unregistered, String password_error) throws Exception {
		Log.info("访问淘手游登录页面");
		driver.get(cons.loginUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.accountLogin().click();
		Log.info("输入未注册手机号");
		loginpage.accountInput().sendKeys(mobile_unregistered);
		Log.info("输入任意密码");
		loginpage.passwordInput().sendKeys(password_error);
		Thread.sleep(1000);
		Log.info("点击登录按钮");
		loginpage.loginButton().click();
		Log.info("等待2s");
		Thread.sleep(2000);
	}
	
	
}
