package tsy.DataDriverFramework.Util;

import org.apache.log4j.Logger;

public class Log {

	// ��ʼ��һ��Logger����
	private static Logger Log = Logger.getLogger(Log.class.getName());

	// ����һ����̬���������Դ�ӡ�Զ����ĳ������������ʼִ�е���־
	public static void startTestCase(String sTestCaseName) {
		Log.info("**************************************");
		Log.info("*********" + sTestCaseName + "************");
	}

	// ����һ����̬���������Դ�ӡ�Զ����ĳ��������������ִ�в�����������־��Ϣ
	public static void endTestCase(String sTestCaseName) {
		Log.info("*********" + sTestCaseName + "************");
		Log.info("---------------------------------------");
	}

	// ����һ����̬info���� ��ӡ�Զ����info�������־��Ϣ
	public static void info(String message) {
		Log.info(message);
	}

	// ����һ����̬ warn������ӡ�Զ����warn������־��Ϣ
	public static void warn(String message) {
		Log.warn(message);
	}

	// ����һ����̬error��������ӡ�Զ����error������Ϣ
	public static void error(String message) {
		Log.error(message);
	}

	// ����һ����̬fatal��������ӡ�Զ����error������Ϣ
	public static void fatal(String message) {
		Log.fatal(message);
	}

	// ����һ����̬error��������ӡ�Զ����error������Ϣ
	public static void debug(String message) {
		Log.debug(message);
	}

}
