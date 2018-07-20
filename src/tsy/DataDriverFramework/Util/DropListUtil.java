package tsy.DataDriverFramework.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropListUtil {

	private WebDriver driver;
	
	public DropListUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * 下拉单选
	 * @param by
	 */
	public void operateDropList(By by) {
		Select dropList = new Select(driver.findElement(by));
		// isMutiple表示此下拉列表是否允许多选
		Assert.assertFalse(dropList.isMultiple());
		dropList.getFirstSelectedOption().getText();
		List<String> exceptOptions = Arrays.asList((new String[] {}));
		List<String> actualOptions = new ArrayList<>();
		
		for (WebElement option : dropList.getOptions()) {
			actualOptions.add(option.getText());			
		}
		
		Assert.assertEquals(exceptOptions.toArray(), actualOptions.toArray());
	}
	
	/**
	 * 判断是否可多选
	 * @param by
	 * @return
	 */
	public boolean isMultipleDropList(By by) {
		Select dropList = new Select(driver.findElement(by));
		Boolean flag = dropList.isMultiple();
		return flag;
	}
	
	
	/**
	 * 选中选项按钮
	 * @param radioOption
	 */
	public void operateRadio(WebElement radioOption) {
		if (!radioOption.isSelected()) {
			radioOption.click();
		}
		
		Assert.assertTrue(radioOption.isSelected());
	}
	
	/**
	 * 找到目标选项并选中
	 * @param by
	 * @param target
	 */
	public void operateRadios(By by, String target) {
		List<WebElement> all = driver.findElements(by);
		for (WebElement element : all) {
			if (element.getAttribute("value").equals(target) && !element.isSelected()) {
				element.click();
				Assert.assertTrue(element.isSelected());
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
