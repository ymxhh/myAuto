package tsy.DataDriverFramework.Util;

import org.apache.log4j.Logger;

public class Log {

	// 初始化一个Logger对象
	private static Logger Log = Logger.getLogger(Log.class.getName());

	// 定义一个静态方法，可以打印自定义的某个测试用例开始执行的日志
	public static void startTestCase(String sTestCaseName) {
		Log.info("**************************************");
		Log.info("*********" + sTestCaseName + "************");
	}

	// 定义一个静态方法，可以打印自定义的某个测试用例结束执行测试用例的日志信息
	public static void endTestCase(String sTestCaseName) {
		Log.info("*********" + sTestCaseName + "************");
		Log.info("---------------------------------------");
	}

	// 定义一个静态info方法 打印自定义的info级别的日志信息
	public static void info(String message) {
		Log.info(message);
	}

	// 定义一个静态 warn方法打印自定义的warn级别日志信息
	public static void warn(String message) {
		Log.warn(message);
	}

	// 定义一个静态error方法，打印自定义的error级别信息
	public static void error(String message) {
		Log.error(message);
	}

	// 定义一个静态fatal方法，打印自定义的error级别信息
	public static void fatal(String message) {
		Log.fatal(message);
	}

	// 定义一个静态error方法，打印自定义的error级别信息
	public static void debug(String message) {
		Log.debug(message);
	}

}
