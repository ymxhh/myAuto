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
	 * 使用JavaScriptExecutor单击元素
	 * @param element
	 */
	public void JavaScriptClick(WebElement element) {
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("使用js进行页面元素的单击");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} else {
				System.out.println("页面上的元素无法进行单击操作");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("页面元素没有附加再网页中" + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("页面中没有找到要操作的页面元素" + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("无法完成单击动作" + e.getStackTrace());
		}
	}
	
	/**
	 * 在Ajax方式产生的浮动框中，单击选择包含某个关键字的选项
	 * @param searchInputBox
	 * @param by
	 * @return
	 */
	public List<WebElement> AjaxDivOption(WebElement searchInputBox, By by) {
		searchInputBox.click();
		// 将浮动框中的所有选项存储到list容器中
		List<WebElement> suggetionOptions = driver.findElements(by);
		return suggetionOptions;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
