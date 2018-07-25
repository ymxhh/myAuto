package tsy.DataDriverFramework.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	/**
	 * ���ڲ��Թ�������ͣ����ִ�е����߷���
	 */
	public static void sleep(long millisecond) {
		try {
			// �߳�����Millsecond��������ĺ�����
			Thread.sleep(millisecond);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ��ʾ�ȴ�ҳ��Ԫ�س��ֵķ�װ����������Ϊҳ��Ԫ�ص�xpath��λ���ַ���
	public static void WaitWebElement(WebDriver driver, String XpathExpression) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// ����ExpectedConditions��PresencesOfElementLocated�������ж�ҳ��Ԫ���Ƿ����
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(XpathExpression)));
	}
	
	//��ʾ�ȴ�ҳ��Ԫ�س��ֵķ�װ����������Ϊ��ʾҳ��Ԫ�ص�By���������������֧�ָ���Ķ�λ���ʽ
	public static void waitWebElement(WebDriver driver,By by) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		// ����ExpectedConditions��PresencesOfElementLocated�������ж�ҳ��Ԫ���Ƿ����		
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
}
