import java.util.Date;

public class ExcelProgram {

	public static void main(String[] args) {
		
		ExcelWrite write_excel = new ExcelWrite();
		
		System.out.println(write_excel.createString(new Date()));
		
		//write_excel.ExcelWrite_Helper();
		
		ExcelRead read_excel = new ExcelRead();
		
		read_excel.ExcelRead_Helper();

	}
}
