package tsy.KeywordsFramework.Scripts;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import tsy.DataDriverFramework.Util.Log;
import tsy.KeywordsFramework.ActionModules.KeywordsAction;
import tsy.KeywordsFramework.Util.ExcelConstants;
import tsy.KeywordsFramework.Util.ExcelUtil;

public class TestSuiteByExcel {

	public static Method method[];
	public static String keyword;
	public static String locatorExpression;
	public static String value;
	public static KeywordsAction keywordsaction;
	public static int testStep;
	public static int testLastStep;
//	public static String testcaseID;
	public static String testcaseName;
	public static String testcaseRunFlag;
	public static boolean testResult;
		
	@BeforeClass
	public void beforeclass() {
		PropertyConfigurator.configure("./log4.properties");
	}
	
	@Test
	public void testTestSuite() throws IOException {
		keywordsaction = new KeywordsAction();
		// ������ƻ�ȡKeywordsAction�����еķ�������
		method = keywordsaction.getClass().getMethods();
		String excelFilePath = ExcelConstants.excelFilePath;
		ExcelUtil.setExcelFile(excelFilePath);
		// ����������
		int testcaseCount = ExcelUtil.getLastRowNum(ExcelConstants.SheetTestSuite);
		
		for (int testcaseNo = 1; testcaseNo <= testcaseCount; testcaseNo ++) {
			testcaseName = ExcelUtil.getCellData(ExcelConstants.SheetTestSuite, testcaseNo, ExcelConstants.ColTestcaseName);
			testcaseRunFlag = ExcelUtil.getCellData(ExcelConstants.SheetTestSuite, testcaseNo, ExcelConstants.ColRunFlag);
			if (testcaseRunFlag.equalsIgnoreCase("y")) {
				Log.startTestcase(testcaseName);
				testResult = true;
				// ĳ����������ʼ���裨�кţ�
				testStep = ExcelUtil.getFirstRowContainsTestcaseName(ExcelConstants.SheetTestSteps, testcaseName, ExcelConstants.ColTestcaseName);
				// ĳ����������ֹ���裨�кţ�
				testLastStep = ExcelUtil.getLastRowContainsTestcaseName(ExcelConstants.SheetTestSteps, testcaseName, ExcelConstants.ColTestcaseName, testStep);
				// �����ò����������в��Բ���
				for (; testStep < testLastStep; testStep++) {
					// ÿһ������Ĺؼ���
					keyword = ExcelUtil.getCellData(ExcelConstants.SheetTestSteps, testStep, ExcelConstants.ColKeywordsAction);
					Log.info("��excel�ļ��ж�ȡ�Ĺؼ����ǣ�" + keyword);
					locatorExpression = ExcelUtil.getCellData(ExcelConstants.SheetTestSteps, testStep, ExcelConstants.ColLocatorExpression);
					value = ExcelUtil.getCellData(ExcelConstants.SheetTestSteps, testStep, ExcelConstants.ColActionValue);
					Log.info("��excel�ļ��ж�ȡ���Ĳ���ֵ��" + value);
					executeActions();
					if (!testResult) {
						ExcelUtil.setCellData(ExcelConstants.SheetTestSuite, testcaseNo, ExcelConstants.ColTestcaseTestResult, "����ִ��ʧ��", excelFilePath);
						Log.endTestcase(testcaseName);
						break;
					} else {
						ExcelUtil.setCellData(ExcelConstants.SheetTestSuite, testcaseNo, ExcelConstants.ColTestcaseTestResult, "����ִ�гɹ�", excelFilePath);
					}
				}
			}
		}
	}
	
	private static void executeActions() {
		try {
			// ͨ�������жϹؼ��ֺ�KeywordsAction���е��ĸ���������һ��
			for (int i = 0; i < method.length; i++) {
				/**
				 * ʹ�÷��䷽ʽ���ҵ��ؼ��ֶ�Ӧ�ķ�������ʹ��value����ֵ��ν����ֵ���е���
				 */
				if (method[i].getName().equals(keyword)) {
					// ͨ��invoke������ɺ�������
					method[i].invoke(keywordsaction, locatorExpression, value);
					if (testResult == true) {
						// ��excel�ļ��н����Բ������趨Ϊִ�гɹ�
						ExcelUtil.setCellData(ExcelConstants.SheetTestSteps, testStep, ExcelConstants.ColTestStepTestResult, "���Բ���ִ�гɹ�", ExcelConstants.excelFilePath);
						KeywordsAction.close_browser();
						break;
					} else {
						// ��excel�ļ��н����Բ������趨Ϊִ��ʧ��
						ExcelUtil.setCellData(ExcelConstants.SheetTestSteps, testStep, ExcelConstants.ColTestStepTestResult, "���Բ���ִ��ʧ��", ExcelConstants.excelFilePath);
						KeywordsAction.close_browser();
						break;
					}
				}
			}
		} catch (Exception e) {
			// ִ�й����г����쳣�������������趨Ϊʧ�ܵ�״̬
			Assert.fail("ִ�г����쳣��fail...");
		}
	}
}
