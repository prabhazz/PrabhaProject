package dataFileReaderAndWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelWriter write = new ExcelWriter();
		write.writer();
	}
	
	public void writer() throws IOException{
	
		//define data to be written
		String dataTobeWritten1="one";
		String dataTobeWritten2="two";
		
		//create workbook
		XSSFWorkbook wb = new XSSFWorkbook();
		
		//create sheet inside it
		XSSFSheet sheet = wb.createSheet("Sheet1");
		
		//keep the for loop limit as per your data limit., in this 2
		//create row inside a sheet
		//create cell inside a row
		for (int i=0;i<2;i++){
			if(i==0)	
				sheet.createRow(i).createCell(0).setCellValue(dataTobeWritten1);
			else
				sheet.createRow(i).createCell(0).setCellValue(dataTobeWritten2);
		}		
		
		//since  workbook can be written to physical file as fileOutputStram, we have to 
		//create object for FileOutputStream with desired file path in it.
		
		File fil = new File("C:\\sample2.xlsx");
		FileOutputStream fos = new FileOutputStream(fil);

		//call write method from XSSFWorkBook class to write the data
		wb.write(fos);
		
	}
}
