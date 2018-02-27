package tsy.DataDriverFramework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tsy.DataDriverFramework.Util.MapElement;

public class PublicElement {

	MapElement mapelement = new MapElement("./TSYProperties/Public.properties");
	private WebDriver driver;
	private WebElement element = null;
	
	public PublicElement(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * 页面顶部登陆按钮
	 * 当用户登陆成功后无此按钮
	 * @return
	 * @throws Exception
	 */
	public WebElement top_login() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.login"));
		return element;
	}
	
	/**
	 * 页面顶部注册按钮
	 * 当用户登陆成功后无此按钮
	 * @return
	 * @throws Exception
	 */
	public WebElement top_signup() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.signup"));
		return element;
	}
	
	/**
	 * 页面顶部退出按钮
	 * 当用户登陆成功后出现
	 * @return
	 * @throws Exception
	 */
	public WebElement top_logout() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.logout"));
		return element;
	}
	
	/**
	 * 页面顶部账户名
	 * 用户登陆成功后出现
	 * @return
	 * @throws Exception
	 */
	public WebElement top_account() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.account"));
		return element;
	}
	
	/**
	 * 页面顶部个人中心入口
	 * 当用户登陆成功后出现
	 * @return
	 * @throws Exception
	 */
	public WebElement top_personalcenter() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.personalcenter"));
		return element;
	}
	
	/**
	 * 页面顶部个人中心下充值按钮（鼠标悬浮出现）
	 * @return
	 * @throws Exception
	 */
	public WebElement top_deposit() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.deposit"));
		return element;
	}
	
	/**
	 * 页面顶部个人中心下体现按钮（鼠标悬浮出现）
	 * @return
	 * @throws Exception
	 */
	public WebElement top_draw() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.draw"));
		return element;
	}
	
	/**
	 * 页面顶部：我的游戏
	 * @return
	 * @throws Exception
	 */
	public WebElement top_mygames() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.mygames"));
		return element;
	}

	/**
	 * 页面顶部：我是买家
	 * @return
	 * @throws Exception
	 */
	public WebElement top_buyer() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.buyer"));
		return element;
	}
	
	/**
	 * 页面顶部：我是买家 -> 我要买
	 * @return
	 * @throws Exception
	 */
	public WebElement top_buyer_buy() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.buyer.buy"));
		return element;
	}
	
	/**
	 * 页面顶部：我是买家 -> 我的议价
	 * @return
	 * @throws Exception
	 */
	public WebElement top_buyer_bargains() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.buyer.bargains"));
		return element;
	}
	
	/**
	 * 页面顶部：我是买家  -> 已买到的宝贝
	 * @return
	 * @throws Exception
	 */
	public WebElement top_buyer_bought() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.buyer.bought"));
		return element;
	}
	
	/**
	 * 页面顶部：我是卖家
	 * @return
	 * @throws Exception
	 */
	public WebElement top_seller() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.seller"));
		return element;
	}
	
	/**
	 * 页面顶部：我是卖家 -> 我要卖
	 * @return
	 * @throws Exception
	 */
	public WebElement top_seller_sell() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.seller.sell"));
		return element;
	}
	
	/**
	 * 页面顶部：我是卖家 -> 已发布的商品
	 * @return
	 * @throws Exception
	 */
	public WebElement top_seller_goods() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.seller.goods"));
		return element;
	}
	
	/**
	 * 页面顶部：我是卖家 -> 收到的议价
	 * @return
	 * @throws Exception
	 */
	public WebElement top_seller_bargains() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.seller.bargains"));
		return element;
	}
	
	/**
	 * 页面顶部：我是卖家 -> 已卖出的宝贝
	 * @return
	 * @throws Exception
	 */
	public WebElement top_seller_sold() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.seller.sold"));
		return element;
	}
	
	/**
	 * 页面顶部：收藏夹
	 * @return
	 * @throws Exception
	 */
	public WebElement top_favorite() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.favorite"));
		return element;
	}
	
	/**
	 * 页面顶部：消息
	 * @return
	 * @throws Exception
	 */
	public WebElement top_messages() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.messages"));
		return element;
	}
	
	/**
	 * 搜索输入框
	 * @return
	 * @throws Exception
	 */
	public WebElement searchBox() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.searchBox"));
		return element;
	}
	
	/**
	 * 搜索按钮
	 * @return
	 * @throws Exception
	 */
	public WebElement searchButton() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.searchButton"));
		return element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
