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
		// 反射机制获取KeywordsAction类所有的方法对象
		method = keywordsaction.getClass().getMethods();
		String excelFilePath = ExcelConstants.excelFilePath;
		ExcelUtil.setExcelFile(excelFilePath);
		// 测试用例数
		int testcaseCount = ExcelUtil.getLastRowNum(ExcelConstants.SheetTestSuite);
		
		for (int testcaseNo = 1; testcaseNo <= testcaseCount; testcaseNo ++) {
			testcaseName = ExcelUtil.getCellData(ExcelConstants.SheetTestSuite, testcaseNo, ExcelConstants.ColTestcaseName);
			testcaseRunFlag = ExcelUtil.getCellData(ExcelConstants.SheetTestSuite, testcaseNo, ExcelConstants.ColRunFlag);
			if (testcaseRunFlag.equalsIgnoreCase("y")) {
				Log.startTestcase(testcaseName);
				testResult = true;
				// 某测试用例起始步骤（行号）
				testStep = ExcelUtil.getFirstRowContainsTestcaseName(ExcelConstants.SheetTestSteps, testcaseName, ExcelConstants.ColTestcaseName);
				// 某测试用例终止步骤（行号）
				testLastStep = ExcelUtil.getLastRowContainsTestcaseName(ExcelConstants.SheetTestSteps, testcaseName, ExcelConstants.ColTestcaseName, testStep);
				// 遍历该测试用例所有测试步骤
				for (; testStep < testLastStep; testStep++) {
					// 每一个步骤的关键字
					keyword = ExcelUtil.getCellData(ExcelConstants.SheetTestSteps, testStep, ExcelConstants.ColKeywordsAction);
					Log.info("从excel文件中读取的关键字是：" + keyword);
					locatorExpression = ExcelUtil.getCellData(ExcelConstants.SheetTestSteps, testStep, ExcelConstants.ColLocatorExpression);
					value = ExcelUtil.getCellData(ExcelConstants.SheetTestSteps, testStep, ExcelConstants.ColActionValue);
					Log.info("从excel文件中读取到的操作值：" + value);
					executeActions();
					if (!testResult) {
						ExcelUtil.setCellData(ExcelConstants.SheetTestSuite, testcaseNo, ExcelConstants.ColTestcaseTestResult, "测试执行失败", excelFilePath);
						Log.endTestcase(testcaseName);
						break;
					} else {
						ExcelUtil.setCellData(ExcelConstants.SheetTestSuite, testcaseNo, ExcelConstants.ColTestcaseTestResult, "测试执行成功", excelFilePath);
					}
				}
			}
		}
	}
	
	private static void executeActions() {
		try {
			// 通过遍历判断关键字和KeywordsAction类中的哪个方法名称一致
			for (int i = 0; i < method.length; i++) {
				/**
				 * 使用反射方式，找到关键字对应的方法，并使用value操作值所谓函数值进行调用
				 */
				if (method[i].getName().equals(keyword)) {
					// 通过invoke方法完成函数调用
					method[i].invoke(keywordsaction, locatorExpression, value);
					if (testResult == true) {
						// 在excel文件中将测试步骤结果设定为执行成功
						ExcelUtil.setCellData(ExcelConstants.SheetTestSteps, testStep, ExcelConstants.ColTestStepTestResult, "测试步骤执行成功", ExcelConstants.excelFilePath);
						KeywordsAction.close_browser();
						break;
					} else {
						// 在excel文件中将测试步骤结果设定为执行失败
						ExcelUtil.setCellData(ExcelConstants.SheetTestSteps, testStep, ExcelConstants.ColTestStepTestResult, "测试步骤执行失败", ExcelConstants.excelFilePath);
						KeywordsAction.close_browser();
						break;
					}
				}
			}
		} catch (Exception e) {
			// 执行过程中出现异常，将测试用例设定为失败的状态
			Assert.fail("执行出现异常，fail...");
		}
	}
}
