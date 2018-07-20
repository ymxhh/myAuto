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
	 * ���ص���һ�η��ʵ�ҳ�� (ģ�ⵥ��������ĺ��˹���)
	 */
	public void visitRecentUrl() {
		driver.navigate().back();
	}
	
	/**
	 * ������һ�����ʵ���ҳ(ģ�ⵥ��������ĺ��˹���)
	 */
	public void visitNextUrl() {
		driver.navigate().forward();
	}
	
	/**
	 * ˢ�µ�ǰҳ��
	 */
	public void freshCurrentPage() {
		driver.navigate().refresh();
	}
	
	public void setPointOfBrowser() {
		// ����һ��Point��������150��ʾ�������λ���������Ļ�����Ͻ�(0,0)�ĺ������������������
		Point point = new Point(150, 150);
		// setPoint()������ʾ�趨���������Ļ�ϵ�λ��δpoint���������(150,150)����ĳЩ�汾������´˷���ʧЧ
		driver.manage().window().setPosition(point);
//		driver.manage().window().getPosition();
	}
	
	public void setDimensionOfBrowser() {		
		// ����һ��Dimension��������500��ʾ��������ڵĳ��ȺͿ��
		Dimension dimension = new Dimension(500, 500);
		// setSize()������ʾ�趨��������ڵĴ�СΪ��Ϊ500����λ�Ϳ�Ϊ500����λ
		driver.manage().window().setSize(dimension);
//		driver.manage().window().getSize();
	}
}
