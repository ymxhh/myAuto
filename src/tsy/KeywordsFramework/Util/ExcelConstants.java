package tsy.KeywordsFramework.Util;

public class ExcelConstants {

	public static final String excelFilePath = "./ExcelData/Data.xlsx";
	public static final String propertyPath = "./TSYProperties/";
	
	// SheetTestSteps和SheetTestSuite中testcase名字列
	public static final int ColTestcaseName = 0;
	
	// SheetTestSteps中关键字列
	public static final int ColKeywordsAction = 3;
	
	// SheetTestSteps中被操作元素定位表达式
	public static final int ColLocatorExpression = 4;
	
	// SheetTestSteps中被操作元素的值（如用户名、网址、浏览器名）
	public static final int ColActionValue = 5;
	
	// SheetTestSteps中每个步骤的执行结果
	public static final int ColTestStepTestResult = 6;
	
	// SheetTestSuite中测试用例的执行flag，“y”表示执行，“n”表示不执行
	public static final int ColRunFlag = 2;
	
	// SheetTestSuite中测试用例的执行结果
	public static final int ColTestcaseTestResult = 3;
	
	// 测试用例sheet，里面是该用例详细步骤（包含多个测试用例）
	public static final String SheetTestSteps = "";
	
	// 测试用例集合sheet，主要是用例描述、是否运行及测试结果
	public static final String SheetTestSuite = "";
}
