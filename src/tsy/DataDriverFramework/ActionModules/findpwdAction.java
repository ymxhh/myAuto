package tsy.DataDriverFramework.ActionModules;

import org.openqa.selenium.WebDriver;

import tsy.DataDriverFramework.PageObject.FindpwdPage;
import tsy.DataDriverFramework.Util.Log;

public class findpwdAction {

	/**
	 * 注册流程
	 * 正常
	 * 非手机号（字母、汉字、符号、空）
	 * 未注册手机号
	 * 不规范验证码
	 * 不规范密码
	 * @param driver
	 * @param mobile
	 * @param checkCode
	 * @param newpwd
	 * @throws Exception
	 */
	public static void findpwd(WebDriver driver, String mobile, String checkCode, String newpwd) throws Exception {
		Log.info("忘记密码页面");
		FindpwdPage findpwdpage = new FindpwdPage(driver);
		findpwdpage.mobileInput().sendKeys(mobile);
		findpwdpage.getCheckCode().click();
		findpwdpage.checkCode().sendKeys(checkCode);
		findpwdpage.newpwdInput().sendKeys(newpwd);
		findpwdpage.okButton().click();
		Thread.sleep(3000);
	}
}
