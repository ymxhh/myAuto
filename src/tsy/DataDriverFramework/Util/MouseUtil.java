package tsy.DataDriverFramework.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseUtil {

	private WebDriver driver;
	private Actions action = new Actions(driver);
	
	public MouseUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doubleClick(By by) {
		WebElement element = driver.findElement(by);
//		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
	}
	
	public void doubleClick(WebElement element) {
//		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
	}
	
	public void rightClick(By by) {
		action.contextClick(driver.findElement(by)).perform();
	}
	
	public void rightClick(WebElement element) {
		action.contextClick(element).perform();
	}
	
	public void roverOnElement(By by) {
		action.moveToElement(driver.findElement(by)).perform();
	}
	
	public void roveronElement(WebElement element) {
		action.moveToElement(element).perform();
	}
	
	public void clickAndRelease(By by) {
		action.clickAndHold(driver.findElement(by)).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		action.release(driver.findElement(by)).perform();
	}
	
	public void clickAndRelease(WebElement element) {
		action.clickAndHold(element).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		action.release(element).perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
