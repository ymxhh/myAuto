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
	 * ҳ�涥����½��ť
	 * ���û���½�ɹ����޴˰�ť
	 * @return
	 * @throws Exception
	 */
	public WebElement top_login() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.login"));
		return element;
	}
	
	/**
	 * ҳ�涥��ע�ᰴť
	 * ���û���½�ɹ����޴˰�ť
	 * @return
	 * @throws Exception
	 */
	public WebElement top_signup() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.signup"));
		return element;
	}
	
	/**
	 * ҳ�涥���˳���ť
	 * ���û���½�ɹ������
	 * @return
	 * @throws Exception
	 */
	public WebElement top_logout() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.logout"));
		return element;
	}
	
	/**
	 * ҳ�涥���˻���
	 * �û���½�ɹ������
	 * @return
	 * @throws Exception
	 */
	public WebElement top_account() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.account"));
		return element;
	}
	
	/**
	 * ҳ�涥�������������
	 * ���û���½�ɹ������
	 * @return
	 * @throws Exception
	 */
	public WebElement top_personalcenter() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.personalcenter"));
		return element;
	}
	
	/**
	 * ҳ�涥�����������³�ֵ��ť������������֣�
	 * @return
	 * @throws Exception
	 */
	public WebElement top_deposit() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.deposit"));
		return element;
	}
	
	/**
	 * ҳ�涥���������������ְ�ť������������֣�
	 * @return
	 * @throws Exception
	 */
	public WebElement top_draw() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.draw"));
		return element;
	}
	
	/**
	 * ҳ�涥�����ҵ���Ϸ
	 * @return
	 * @throws Exception
	 */
	public WebElement top_mygames() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.mygames"));
		return element;
	}

	/**
	 * ҳ�涥�����������
	 * @return
	 * @throws Exception
	 */
	public WebElement top_buyer() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.buyer"));
		return element;
	}
	
	/**
	 * ҳ�涥����������� -> ��Ҫ��
	 * @return
	 * @throws Exception
	 */
	public WebElement top_buyer_buy() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.buyer.buy"));
		return element;
	}
	
	/**
	 * ҳ�涥����������� -> �ҵ����
	 * @return
	 * @throws Exception
	 */
	public WebElement top_buyer_bargains() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.buyer.bargains"));
		return element;
	}
	
	/**
	 * ҳ�涥�����������  -> ���򵽵ı���
	 * @return
	 * @throws Exception
	 */
	public WebElement top_buyer_bought() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.buyer.bought"));
		return element;
	}
	
	/**
	 * ҳ�涥������������
	 * @return
	 * @throws Exception
	 */
	public WebElement top_seller() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.seller"));
		return element;
	}
	
	/**
	 * ҳ�涥������������ -> ��Ҫ��
	 * @return
	 * @throws Exception
	 */
	public WebElement top_seller_sell() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.seller.sell"));
		return element;
	}
	
	/**
	 * ҳ�涥������������ -> �ѷ�������Ʒ
	 * @return
	 * @throws Exception
	 */
	public WebElement top_seller_goods() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.seller.goods"));
		return element;
	}
	
	/**
	 * ҳ�涥������������ -> �յ������
	 * @return
	 * @throws Exception
	 */
	public WebElement top_seller_bargains() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.seller.bargains"));
		return element;
	}
	
	/**
	 * ҳ�涥������������ -> �������ı���
	 * @return
	 * @throws Exception
	 */
	public WebElement top_seller_sold() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.seller.sold"));
		return element;
	}
	
	/**
	 * ҳ�涥�����ղؼ�
	 * @return
	 * @throws Exception
	 */
	public WebElement top_favorite() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.favorite"));
		return element;
	}
	
	/**
	 * ҳ�涥������Ϣ
	 * @return
	 * @throws Exception
	 */
	public WebElement top_messages() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.top.messages"));
		return element;
	}
	
	/**
	 * ���������
	 * @return
	 * @throws Exception
	 */
	public WebElement searchBox() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.searchBox"));
		return element;
	}
	
	/**
	 * ������ť
	 * @return
	 * @throws Exception
	 */
	public WebElement searchButton() throws Exception {
		element = driver.findElement(mapelement.getLocator("TSY.Public.searchButton"));
		return element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
