package tsy.DataDriverFramework.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {

	/**
	 * �����ͼ
	 * @param driver
	 * @param namepng
	 * @throws IOException
	 */
	public static void screen(WebDriver driver, String namepng) throws IOException {
		// ָ����OutputType.FILE��Ϊ�������ݸ�getScreenshotAs()�������京���ǽ���ȡ����Ļ���ļ���ʽ����
		File img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// ����FileUtils�������copyFile()��������getScreenshotAs()���ص��ļ�����
		FileUtils.copyFile(img, new File(namepng));
	}
	
/*	public static void main(String[] args) throws IOException {
        //����chrome.exe��chromedriver.exe��ϵͳ����
//        System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//        System.setProperty("webdriver.chrome.driver", "��\\webdriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
        //����chromeʵ��
        WebDriver driver = new ChromeDriver();
        //���ʡ�������վ��ҳ��
        driver.get("http://www.jianshu.com/");
        //ָ����OutputType.FILE��Ϊ�������ݸ�getScreenshotAs()�������京���ǽ���ȡ����Ļ���ļ���ʽ���ء�
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //����FileUtils�������copyFile()��������getScreenshotAs()���ص��ļ�����
        FileUtils.copyFile(srcFile, new File("d:/screenshot1.png"));
        //�ر������
        driver.quit(); 
    }*/
}
