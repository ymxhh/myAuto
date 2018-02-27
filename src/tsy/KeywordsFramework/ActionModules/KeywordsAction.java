package tsy.KeywordsFramework.ActionModules;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import tsy.DataDriverFramework.Util.Log;
import tsy.DataDriverFramework.Util.MapElement;
import tsy.DataDriverFramework.Util.WaitUtil;
import tsy.KeywordsFramework.Scripts.TestSuiteByExcel;
import tsy.KeywordsFramework.Util.KeyboardUtil;

public class KeywordsAction {

	public static WebDriver driver;
	private static MapElement mapelement = new MapElement("");
	
	static {
		PropertyConfigurator.configure("./log4.properties");
	}
	
	public static void open_browser(String string, String browserName) {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
			driver = new ChromeDriver();
			Log.info("Chrome������Ѿ�����");
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
			driver = new ChromeDriver();
			Log.info("Firefox������Ѿ�����");
		}
	}
	
	public static void getUrl(String url) {
		driver.get(url);
		Log.info("�����������ַ��" + url);
	}
	
	public static void input(String locatorExpression, String inputString) {
		try {
			driver.findElement(mapelement.getLocator(locatorExpression)).sendKeys(inputString);
			
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("�������ݳ����쳣���쳣��ϢΪ��" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void click(String locatorExpression) {
		try {
			driver.findElement(mapelement.getLocator(locatorExpression)).click();
			Log.info("�����ɹ���" + locatorExpression);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("����ʧ�ܣ�" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void waitfor_element(String locatorExpression) {
		try {
			WaitUtil.WaitWebElement(driver, locatorExpression);
			Log.info("��ʾ�ȴ�ҳ��Ԫ�سɹ���" + locatorExpression);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("��ʾ�ȴ�ҳ��Ԫ��ʧ�ܣ�" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void press_tab() {
		try {
			KeyboardUtil.pressTabKey();
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			e.printStackTrace();
		}
	}
	
	public static void paste_string(String string) {
		try {
			KeyboardUtil.setAndctrLVCLipboardData(string);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			e.printStackTrace();
		}
	}
	
	public static void sleep(String sleepTime) {
		try {
			WaitUtil.sleep(Integer.parseInt(sleepTime));
			Log.info("�ȴ�ʱ��" + Integer.parseInt(sleepTime)/1000 + "s�ɹ�");
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			e.printStackTrace();
		}
	}
	
	public static void assert_string(String assertString) {
		try {
			Assert.assertTrue(driver.getPageSource().contains(assertString));
			Log.info("���Գɹ�-��������ִ�гɹ�" + assertString);
		} catch (AssertionError e) {
			TestSuiteByExcel.testResult = false;
			Log.info(e.getMessage());
			System.out.println("����ʧ��");
		}
	}
	
	public static void close_browser() {
		try {
			System.out.println("������رպ�����ִ��");
			driver.quit();
			Log.info("�ر������-���Խ���");
		} catch (Exception e) {
			TestSuiteByExcel.testResult=false;
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
