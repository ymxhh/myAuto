package tsy.DataDriverFramework.Util;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeniorUtil {

	private WebDriver driver;
	
	public SeniorUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * ʹ��JavaScriptExecutor����Ԫ��
	 * @param element
	 */
	public void JavaScriptClick(WebElement element) {
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("ʹ��js����ҳ��Ԫ�صĵ���");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} else {
				System.out.println("ҳ���ϵ�Ԫ���޷����е�������");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("ҳ��Ԫ��û�и�������ҳ��" + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("ҳ����û���ҵ�Ҫ������ҳ��Ԫ��" + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("�޷���ɵ�������" + e.getStackTrace());
		}
	}
	
	/**
	 * ��Ajax��ʽ�����ĸ������У�����ѡ�����ĳ���ؼ��ֵ�ѡ��
	 * @param searchInputBox
	 * @param by
	 * @return
	 */
	public List<WebElement> AjaxDivOption(WebElement searchInputBox, By by) {
		searchInputBox.click();
		// ���������е�����ѡ��洢��list������
		List<WebElement> suggetionOptions = driver.findElements(by);
		return suggetionOptions;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
