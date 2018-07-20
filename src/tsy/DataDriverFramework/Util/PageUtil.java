package tsy.DataDriverFramework.Util;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class PageUtil {

	private WebDriver driver;
	
	public PageUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * 返回到上一次访问的页面 (模拟单击浏览器的后退功能)
	 */
	public void visitRecentUrl() {
		driver.navigate().back();
	}
	
	/**
	 * 返回上一个访问的网页(模拟单击浏览器的后退功能)
	 */
	public void visitNextUrl() {
		driver.navigate().forward();
	}
	
	/**
	 * 刷新当前页面
	 */
	public void freshCurrentPage() {
		driver.navigate().refresh();
	}
	
	public void setPointOfBrowser() {
		// 声明一个Point对象，两个150表示浏览器的位置相对于屏幕的左上角(0,0)的横坐标距离和纵坐标距离
		Point point = new Point(150, 150);
		// setPoint()方法表示设定浏览器在屏幕上的位置未point对象的坐标(150,150)，在某些版本浏览器下此方法失效
		driver.manage().window().setPosition(point);
//		driver.manage().window().getPosition();
	}
	
	public void setDimensionOfBrowser() {		
		// 声明一个Dimension对象，两个500表示浏览器窗口的长度和宽度
		Dimension dimension = new Dimension(500, 500);
		// setSize()方法表示设定浏览器窗口的大小为长为500个单位和宽为500个单位
		driver.manage().window().setSize(dimension);
//		driver.manage().window().getSize();
	}
}
