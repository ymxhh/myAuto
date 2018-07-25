package tsy.DataDriverFramework.Scripts;

import java.awt.Toolkit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tsy.DataDriverFramework.PageObject.LoginPage;
import tsy.DataDriverFramework.PageObject.SellTradePage;
import tsy.DataDriverFramework.Util.WaitUtil;

public class publishGoods {

	public WebDriver driver;
	public String sellUrl = "http://cdt0-web.taoshouyou.com/user/sell-trade-game-account?gameid=3781&goodsid=1&sellmodeid=2&clientid=1&isquick=0";
	String goodsName = "ww22";
	double price = 0.01;
	String[] goodsInfo = {"wwww", "666"};
	
	@BeforeClass
	public void beforeclass() {
		PropertyConfigurator.configure("./log4.properties");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		maximise(driver);
	}
	
	@AfterMethod
	public void aftermethod() {
		driver.quit();
	}
	
	@Test(enabled=false)
	public void testAccountLoginClick() throws InterruptedException {
		driver.get("http://cdt0-web.taoshouyou.com/siteauth/auth/login?returnurl=http%3A%2F%2Fcdt0-web.taoshouyou.com%2F");
		Thread.sleep(5000);
//		driver.findElement(By.className(".js-gb-login-logincontent-tabs.right")).click();
		WebElement ele = null;
		try {
//			ele = driver.findElement(By.xpath("//div[@class='js-gb-login-logincontent-tabs']/div[@class='right']"));
//			ele = driver.findElement(By.className("js-gb-login-logincontent-tabs"));
			ele = driver.findElement(By.className("right"));
			Thread.sleep(3000);
			System.out.println(ele.getText());

			System.out.println(ele.isDisplayed());
			System.out.println(ele.isEnabled());
			System.out.println(ele.isSelected());
//			ele.sendKeys(Keys.ENTER);
			ele.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(enabled=true)
	public void publish() throws Exception {
		LoginPage lg = new LoginPage(driver);
		driver.get("http://cdt0-web.taoshouyou.com/siteauth/auth/login?returnurl=http%3A%2F%2Fcdt0-web.taoshouyou.com%2F");
//		Thread.sleep(3000);
		WaitUtil.waitWebElement(driver, By.className("right"));
		lg.accountLogin().click();
//		Thread.sleep(3000);


		
/*		Actions actions = new Actions(driver);
		actions.moveToElement(accountInput);
		actions.click();
		actions.sendKeys("yangm");
		actions.build().perform();
		System.out.println(accountInput.getText());*/
		
//		Thread.sleep(1000);
		WaitUtil.waitWebElement(driver, By.className("js-gb-login-logincontent-name"));	// 找到这个元素之后用户名、密码、登录按钮均可以找到
		WebElement accountInput = lg.accountInput();
		accountInput.clear();
		accountInput.sendKeys("grace2");	// 因为没定位到input的class，所以cannot focus element
		
		WebElement passwordInput = lg.passwordInput();
//		Thread.sleep(1000);
		passwordInput.clear();
		passwordInput.sendKeys("123456");
		
		WebElement loginButton = lg.loginButton();		
		loginButton.click();
		Thread.sleep(1000);
		
		/*
		 * http://cdt0-web.taoshouyou.com/com/errors/errmsg?msg=%25E5%25AF%25B9%25E4%25B8%258D%25E8%25B5%25B7%25EF%25BC%258C%25E6%2582%25A8%25E5%25BD%2593%25E6%2597%25A5%25E5%258F%2591%25E5%25B8%2583%25E7%259A%2584%25E8%25BF%2599%25E6%25AC%25BE%25E6%25B8%25B8%25E6%2588%258F%25E6%2595%25B0%25E9%2587%258F%25E5%25B7%25B2%25E7%25BB%258F%25E8%25B6%2585%25E8%25BF%2587%25E4%25BA%2586%25E9%2599%2590%25E5%2588%25B6%25EF%25BC%258C%25E8%25AF%25B7%25E4%25BA%258E%25E6%2598%258E%25E5%25A4%25A9%25E9%2587%258D%25E6%2596%25B0%25E5%258F%2591%25E5%25B8%2583&returnurl=%252Fuser%252Fsell-trade&seconds=5
		 * 非成品号商家的用户有发布担保交易类型的限制：每天每款游戏每个客户端只能发10个担保，超过后隐藏担保交易选项，以上是错误提示页
		 */
		
		driver.get("http://cdt0-web.taoshouyou.com/user/sell-trade-game-account?gameid=3781&goodsid=1&sellmodeid=2&clientid=1&isquick=0");
		WaitUtil.waitWebElement(driver, By.className("p-sellgoods-gtitle"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		injectjQuery(js);
		/*js.executeScript("// 商品标题\r\n" + 
				"    $(\"input[placeholder='请勿在商品标题中留下联系方式']\").val(\"wx-6\");\r\n" + 
				"    $(\"input[placeholder='请输入商品价格']\").val(0.01);\r\n" + 
				"    $(\"#js-p-sellgoods-piture\").find(\".js-gb-checkbox-wrap>div\").eq(0).addClass(\"checked\").end().eq(1).removeClass(\"checked\");\r\n" + 
				"    $(\"#js-p-sellgoods-picture\").attr(\"data-haspic\",\"0\")\r\n" + 
				"    $(\"textarea\").val(\"wwww\");\r\n" + 
				"    $(\"#js-b-tradechoice-tradename\").find(\"input\").val(666);"
				);*/
		js.executeScript("// 商品标题\r\n" + 
				"    $(\"input[placeholder='请勿在商品标题中留下联系方式']\").val(arguments[0]);\r\n" + 
				"    $(\"input[placeholder='请输入商品价格']\").val(0.01);\r\n" + 
				"    $(\"#js-p-sellgoods-piture\").find(\".js-gb-checkbox-wrap>div\").eq(0).addClass(\"checked\").end().eq(1).removeClass(\"checked\");\r\n" + 
				"    $(\"#js-p-sellgoods-picture\").attr(\"data-haspic\",\"0\")\r\n" + 
				"    $(\"textarea\").val(\"wwww\");\r\n" + 
				"    $(\"#js-b-tradechoice-tradename\").find(\"input\").val(666);",
				goodsName
				);
//		Thread.sleep(5000);
		js.executeScript("scrollTo(\"0\",\"10000\");"
				+ "$(\"#js-b-tradechoice-sureall\").attr(\"isclick\", \"1\");");
		SellTradePage stp = new SellTradePage(driver);		
//		Thread.sleep(1000);
		stp.getSureAllButton().click();
//		WaitUtil.waitWebElement(driver, By.id("con"));
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
////		String line = "http://cdt0-web.taoshouyou.com/user/sell-trade-prop/ok?id=7451191";
//		String pattern = "(\\D*)(\\d+)(.*)";
//		Pattern r = Pattern.compile(pattern);
//		Matcher m = r.matcher(currentUrl);
//		String goodsId = "";
//		if (m.find()) {
//			goodsId = m.group(0);
//		}
		Thread.sleep(5000);
		driver.get("http://cdt0-web.taoshouyou.com/user/sellertrade/index?tab=0");
		Thread.sleep(5000);
//		WaitUtil.waitWebElement(driver, By.className("p-center-release-orderbox"));
		// 未加return返回null
		String targetGoodsName = (String) js.executeScript("return $(\".b-common-goodsimg-goodsname\").eq(0).find(\"a\").text()");
		System.out.println(targetGoodsName);
//		String targetGoodsNames = (String) js.executeScript("return $(\".b-common-goodsimg-goodsname\").find(\"a\").text()");
//		System.out.println(targetGoodsNames);
		Assert.assertEquals(targetGoodsName, goodsName);
		Thread.sleep(8000);
	}
	
	public void injectjQuery(JavascriptExecutor js) {
		js.executeScript("// 商品标题\r\n" + 
				"    $(\"input[placeholder='请勿在商品标题中留下联系方式']\").val(\"wx-6\");\r\n" + 
				"    $(\"input[placeholder='请输入商品价格']\").val(0.01);\r\n" + 
				"    $(\"#js-p-sellgoods-piture\").find(\".js-gb-checkbox-wrap>div\").eq(0).addClass(\"checked\").end().eq(1).removeClass(\"checked\");\r\n" + 
				"    $(\"#js-p-sellgoods-picture\").attr(\"data-haspic\",\"0\")\r\n" + 
				"    $(\"textarea\").val(\"wwww\");\r\n" + 
				"    $(\"#js-b-tradechoice-tradename\").find(\"input\").val(666);"
				);		
	}
	
	public void maximise(WebDriver driver) {
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open('','testwindow','width=400,height=200')");
		driver.close();
		driver.switchTo().window("testwindow");
		js.executeScript("window.moveTo(0,0);");
		/*
		* 1280和1024分别为窗口的宽和高，可以用下面的代码得到 screenDims =
		* Toolkit.getDefaultToolkit().getScreenSize(); width = (int)
		* screenDims.getWidth(); height = (int) screenDims.getHeight();
		*/
//		js.executeScript("window.resizeTo(1280,1024);");
		js.executeScript("window.resizeTo(1920, 1080);");
		System.out.println(Toolkit.getDefaultToolkit().getScreenSize().getWidth());
		System.out.println(Toolkit.getDefaultToolkit().getScreenSize().getHeight());
	}
	
//	public static void main(String[] args) {
//		String loginUrl = "http://cdt0-web.taoshouyou.com/siteauth/auth/login?returnurl=http%3A%2F%2Fcdt0-web.taoshouyou.com%2F";
//		String sellUrl = "http://cdt0-web.taoshouyou.com/user/sell-trade-game-account?gameid=3781&goodsid=1&sellmodeid=2&clientid=1&isquick=0";
//		publishGoods pg = new publishGoods();
//		try {
//			pg.publish(loginUrl, sellUrl);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
