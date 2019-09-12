import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_ReadWrite {

	private static Workbook wb;
	private static Sheet sheet;
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static Row row;
	private static Cell cell;
	
	public static void main(String[] args) throws Exception{

		fis = new FileInputStream("./test.xlsx");
		wb = WorkbookFactory.create(fis);
		sheet = wb.getSheet("Sheet1");
		int noOfRows = sheet.getLastRowNum();
		System.out.println(noOfRows);
	}

}
