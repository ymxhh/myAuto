package tsy.KeywordsFramework.Scripts;

import java.lang.reflect.Method;

import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import tsy.KeywordsFramework.ActionModules.KeywordsAction;
import tsy.KeywordsFramework.Util.ExcelUtil;

public class TestSuiteByExcel {

	public static Method method[];
	public static String keyword;
	public static String locatorExpression;
	public static String value;
	public static KeywordsAction keywordsaction;
	public static int testStep;
	public static int testLastStep;
	public static String testcaseID;
	public static String testcaseRunFlag;
	public static boolean testResult;
	
	@BeforeClass
	public void beforeclass() {
		PropertyConfigurator.configure("./log4.properties");
	}
	
	@Test
	public void testTestSuite() {
		keywordsaction = new KeywordsAction();
		method = keywordsaction.getClass().getMethods();
		String excelFilePath = "";
		ExcelUtil.setExcelFile(excelFilePath);
		int testcaseCount = ExcelUtil.getLastRowNum();
//		for (int testcaseNo = 1; testcaseNo <= testcaseCount; testcaseNo ++) {
//			testcaseID = ExcelUtil.getCellData(sheetName, rowNum, colNum)
//		}
	}
	
	private static void executeActions() {
		try {
			for (int i = 0; i < method.length; i++) {
				if (method[i].getName().equals(keyword)) {
					method[i].invoke(keywordsaction, locatorExpression, value);
					if (testResult == true) {
						// ��ʱд���������
						// ��excel�ļ��н����Բ������趨Ϊִ�гɹ�
						ExcelUtil.setCellData("", 0, 0, "", "");
						break;
					} else {
						// ��ʱд���������
						// ��excel�ļ��н����Բ������趨Ϊִ��ʧ��
						ExcelUtil.setCellData("", 0, 0, "", "");
						KeywordsAction.close_browser();
						break;
					}
				}
			}
		} catch (Exception e) {
			Assert.fail("ִ�г����쳣��fail...");
		}
	}
}
