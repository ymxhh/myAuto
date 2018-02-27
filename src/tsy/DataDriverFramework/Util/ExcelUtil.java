package tsy.DataDriverFramework.Util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	/**
	 * 设定要操作的Excel的文件路径和Excel文件中的Sheet名称
	 * @param path
	 */
	public static void setExcelFile(String path) {
		FileInputStream ExcelFile;
		try {
			ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
		} catch (Exception e) {
			System.out.println("set excel path fail...");
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取单元格数据
	 * @param sheetName
	 * @param rowNum
	 * @param colNum
	 * @return
	 */
	public static String getCellData(String sheetName, int rowNum, int colNum) {
		ExcelWSheet = ExcelWBook.getSheet(sheetName);		
		try {
			Cell = ExcelWSheet.getRow(rowNum).getCell(colNum);
			String CellData = Cell.getCellTypeEnum() == CellType.STRING ? Cell.getStringCellValue() + ""
					: String.valueOf(Math.round(Cell.getNumericCellValue()));
			return CellData;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
}
