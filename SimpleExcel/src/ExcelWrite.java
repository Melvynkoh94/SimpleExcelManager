import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExcelWrite {
	
	//private static final String EXCEL_FILE_LOCATION = "C:\\Users\\User\\Desktop\\T8-E-201950-R-BOT.xls";
	private static final String EXCEL_FILE_LOCATION = "C:\\Users\\User\\Desktop\\sample.xlsx";
	
	public String createString(Date date) {
		//return date.toLocaleString(); //what is deprecate
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		//return date.toString();
		return formatter.format(date);
	}
	
	public void ExcelWrite_Helper() {
		//1. Create an Excel file
	    WritableWorkbook myFirstWbook = null;
	    
	    try {

	        myFirstWbook = Workbook.createWorkbook(new File(EXCEL_FILE_LOCATION));

	        // create an Excel sheet
	        WritableSheet excelSheet = myFirstWbook.createSheet("Sheet 1", 0);

	        // add something into the Excel sheet
	        Label label = new Label(0, 0, "Test Count");
	        excelSheet.addCell(label);

	        Number number = new Number(0, 1, 1);
	        excelSheet.addCell(number);

	        label = new Label(1, 0, "Result");
	        excelSheet.addCell(label);

	        label = new Label(1, 1, "Passed");
	        excelSheet.addCell(label);

	        number = new Number(0, 2, 2);
	        excelSheet.addCell(number);

	        label = new Label(1, 2, "Passed 2");
	        excelSheet.addCell(label);

	        myFirstWbook.write();


	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (WriteException we) {
	        we.printStackTrace();
	    } finally {

	        if (myFirstWbook != null) {
	            try {
	                myFirstWbook.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            } catch (WriteException e) {
	                e.printStackTrace();
	            }
	        }
	    }
		
	}	
}
