package tsy.KeywordsFramework.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
	
	/**
	 * 获取Excel sheet中最后一行的行号（即总行数）
	 * @return
	 */
	public static int getLastRowNum() {
		return ExcelWSheet.getLastRowNum();
	}
	
	public static int getLastRowNum(String sheetName) {
		ExcelWSheet = ExcelWBook.getSheet(sheetName);
		int count = ExcelWSheet.getLastRowNum();
		return count;
	}
	
	/**
	 * 再Excel文件中执行单元格写入数据，这个函数支持.xlsx
	 * @param sheetName
	 * @param rowNum
	 * @param colNum
	 * @param result
	 * @param execlPath
	 * @throws IOException
	 */
	public static void setCellData(String sheetName, int rowNum, int colNum, String result, String execlPath) throws IOException {
		ExcelWSheet = ExcelWBook.getSheet(sheetName);
		
		try {
			Row = ExcelWSheet.getRow(rowNum);
			Cell = Row.getCell(colNum);
			if (Cell == null) {
				Cell = Row.createCell(colNum);
				Cell.setCellValue(result);
			} else {
				Cell.setCellValue(result);
			}
			
			FileOutputStream fileout = new FileOutputStream(execlPath);
			ExcelWBook.write(fileout);
			fileout.flush();
			fileout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
