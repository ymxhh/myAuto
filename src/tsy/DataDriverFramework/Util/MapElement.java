package tsy.DataDriverFramework.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author 27419
 *
 */
public class MapElement {

	Properties properties;
	WebElement element;
	
	public MapElement(String propertyPath) {
		properties = new Properties();
		try {
			FileInputStream in = new FileInputStream(propertyPath);
			properties.load(in);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public By getLocator(String elmentNameInPropFile) throws Exception {
		String[] locators = properties.getProperty(elmentNameInPropFile).split(">");
		String locatorType = locators[0];
		String locatorValue = locators[1];
		
		locatorType = new String(locatorType.getBytes("ISO-8859-1"), "utf-8");
		
		if (locatorType.toLowerCase().equals("id"))
			return By.id(locatorValue);

		else if (locatorType.toLowerCase().equals("name"))
			return By.name(locatorValue);

		else if ((locatorType.toLowerCase().equals("classname")) || (locatorType.toLowerCase().equals("class")))
			return By.className(locatorValue);

		else if ((locatorType.toLowerCase().equals("tagname")) || (locatorType.toLowerCase().equals("tag")))
			return By.className(locatorValue);

		else if ((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link")))
			return By.linkText(locatorValue);

		else if (locatorType.toLowerCase().equals("partiallinktext"))
			return By.partialLinkText(locatorValue);

		else if ((locatorType.toLowerCase().equals("cssselector")) || (locatorType.toLowerCase().equals("css")))
			return By.cssSelector(locatorValue);

		else if (locatorType.toLowerCase().equals("xpath"))
			return By.xpath(locatorValue);

		else
			throw new Exception("输入的LocatorType未在程序中被定义:" + locatorType);
	}
	
}
