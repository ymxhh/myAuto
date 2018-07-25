package tsy.DataDriverFramework.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	/**
	 * 用于测试过程中暂停程序执行的休眠方法
	 */
	public static void sleep(long millisecond) {
		try {
			// 线程休眠Millsecond参数定义的毫秒数
			Thread.sleep(millisecond);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 显示等待页面元素出现的封装方法，参数为页面元素的xpath定位的字符串
	public static void WaitWebElement(WebDriver driver, String XpathExpression) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// 调用ExpectedConditions的PresencesOfElementLocated方法来判断页面元素是否出现
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(XpathExpression)));
	}
	
	//显示等待页面元素出现的封装方法，参数为表示页面元素的By对象，这个函数可以支持更多的定位表达式
	public static void waitWebElement(WebDriver driver,By by) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		// 调用ExpectedConditions的PresencesOfElementLocated方法来判断页面元素是否出现		
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
}
