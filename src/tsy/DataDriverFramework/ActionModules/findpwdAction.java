package tsy.DataDriverFramework.ActionModules;

import org.openqa.selenium.WebDriver;

import tsy.DataDriverFramework.PageObject.FindpwdPage;
import tsy.DataDriverFramework.Util.Log;

public class findpwdAction {

	/**
	 * ע������
	 * ����
	 * ���ֻ��ţ���ĸ�����֡����š��գ�
	 * δע���ֻ���
	 * ���淶��֤��
	 * ���淶����
	 * @param driver
	 * @param mobile
	 * @param checkCode
	 * @param newpwd
	 * @throws Exception
	 */
	public static void findpwd(WebDriver driver, String mobile, String checkCode, String newpwd) throws Exception {
		Log.info("��������ҳ��");
		FindpwdPage findpwdpage = new FindpwdPage(driver);
		findpwdpage.mobileInput().sendKeys(mobile);
		findpwdpage.getCheckCode().click();
		findpwdpage.checkCode().sendKeys(checkCode);
		findpwdpage.newpwdInput().sendKeys(newpwd);
		findpwdpage.okButton().click();
		Thread.sleep(3000);
	}
}
