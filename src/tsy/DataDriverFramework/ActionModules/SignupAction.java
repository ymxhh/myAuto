package tsy.DataDriverFramework.ActionModules;

import org.openqa.selenium.WebDriver;

import tsy.DataDriverFramework.PageObject.SignupPage;
import tsy.DataDriverFramework.Util.Log;
import tsy.DataDriverFramework.Util.Constants.cons;

public class SignupAction {

	/**
	 * ע���������
	 * ����������
	 * 	����ע��
	 * 	������֤��
	 * 	���ֻ��ţ���ĸ�����֡����š�������
	 * 	��ע���ֻ���
	 * @param driver
	 * @param mobile
	 * @param verificationCode
	 * @param password
	 * @throws Exception
	 */
	public static void signup(WebDriver driver, String mobile, String verificationCode, String password) throws Exception {
		Log.info("����ע��ҳ��");
		driver.get(cons.signupUrl);
		SignupPage signuppage = new SignupPage(driver);
		signuppage.mobileInput().sendKeys(mobile);
		signuppage.getCheckCode().click();
		signuppage.checkCode().sendKeys(verificationCode);
		signuppage.passwordInput().sendKeys(password);
		signuppage.agree().click();  // ��ͬ�����Э��ѡ��Ĭ��Ϊδѡ��
		signuppage.signupButton().click();
		Thread.sleep(3000);
	}
	
	/**
	 * ������д����ͬ�����Э��ѡ��δ��ѡ
	 * @param driver
	 * @param mobile
	 * @param verificationCode
	 * @param password
	 * @throws Exception
	 */
	public static void signup_noagree(WebDriver driver, String mobile, String verificationCode, String password) throws Exception {
		Log.info("����ע��ҳ��");
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
