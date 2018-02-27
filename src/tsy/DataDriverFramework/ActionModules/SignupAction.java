package tsy.DataDriverFramework.ActionModules;

import org.openqa.selenium.WebDriver;

import tsy.DataDriverFramework.PageObject.SignupPage;
import tsy.DataDriverFramework.Util.Log;
import tsy.DataDriverFramework.Util.Constants.cons;

public class SignupAction {

	/**
	 * 注册测试用例
	 * 数据驱动：
	 * 	正常注册
	 * 	错误验证码
	 * 	非手机号（字母、汉字、符号。。。）
	 * 	已注册手机号
	 * @param driver
	 * @param mobile
	 * @param verificationCode
	 * @param password
	 * @throws Exception
	 */
	public static void signup(WebDriver driver, String mobile, String verificationCode, String password) throws Exception {
		Log.info("进入注册页面");
		driver.get(cons.signupUrl);
		SignupPage signuppage = new SignupPage(driver);
		signuppage.mobileInput().sendKeys(mobile);
		signuppage.getCheckCode().click();
		signuppage.checkCode().sendKeys(verificationCode);
		signuppage.passwordInput().sendKeys(password);
		signuppage.agree().click();  // 该同意服务协议选项默认为未选择
		signuppage.signupButton().click();
		Thread.sleep(3000);
	}
	
	/**
	 * 正常填写，但同意服务协议选项未勾选
	 * @param driver
	 * @param mobile
	 * @param verificationCode
	 * @param password
	 * @throws Exception
	 */
	public static void signup_noagree(WebDriver driver, String mobile, String verificationCode, String password) throws Exception {
		Log.info("进入注册页面");
		driver.get(cons.signupUrl);
		SignupPage signuppage = new SignupPage(driver);
		signuppage.mobileInput().sendKeys(mobile);
		signuppage.getCheckCode().click();
		signuppage.checkCode().sendKeys(verificationCode);
		signuppage.passwordInput().sendKeys(password);
		signuppage.signupButton().click();
		Thread.sleep(3000);
	}
}
