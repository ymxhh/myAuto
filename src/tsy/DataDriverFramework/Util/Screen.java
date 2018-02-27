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
	 * 保存截图
	 * @param driver
	 * @param namepng
	 * @throws IOException
	 */
	public static void screen(WebDriver driver, String namepng) throws IOException {
		// 指定了OutputType.FILE作为参数传递给getScreenshotAs()方法，其含义是将截取的屏幕以文件形式返回
		File img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// 利用FileUtils工具类的copyFile()方法保存getScreenshotAs()返回的文件对象
		FileUtils.copyFile(img, new File(namepng));
	}
	
/*	public static void main(String[] args) throws IOException {
        //设置chrome.exe和chromedriver.exe的系统参数
//        System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//        System.setProperty("webdriver.chrome.driver", "。\\webdriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
        //启动chrome实例
        WebDriver driver = new ChromeDriver();
        //访问“简书网站首页”
        driver.get("http://www.jianshu.com/");
        //指定了OutputType.FILE做为参数传递给getScreenshotAs()方法，其含义是将截取的屏幕以文件形式返回。
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //利用FileUtils工具类的copyFile()方法保存getScreenshotAs()返回的文件对象。
        FileUtils.copyFile(srcFile, new File("d:/screenshot1.png"));
        //关闭浏览器
        driver.quit(); 
    }*/
}
