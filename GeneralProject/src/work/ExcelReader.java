package work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public int numberOfColumn = 0;
	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		ExcelReader reader = new ExcelReader();
		reader.excel();

	}

	
	public void excel() throws InvalidFormatException, IOException{
		
		File fil = new File("C:\\sample.xlsx");
		FileInputStream fis = new FileInputStream(fil);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		wb.getNumberOfSheets();
		System.out.println("number of sheets in this workbook");
		for(int k=0;k<=wb.getNumberOfSheets();k++){			
			System.out.println("number of rows is "+sheet.getLastRowNum());		
			for(int i=0;i<=sheet.getLastRowNum();i++) {
				//get number of column in this row
				XSSFRow row = sheet.getRow(i);
				numberOfColumn = row.getLastCellNum();
				
				System.out.println("number of columns"+sheet.getRow(i).getLastCellNum()+1);
				for(int j=0;j<=numberOfColumn;j++){
					if(sheet.getRow(i).getCell(j)!=null){
						System.out.println("cell value is "+sheet.getRow(i).getCell(j));
						
	//					System.out.println("cell value is "+sheet.getRow(i).getCell(j).getStringCellValue());					
					}
	
					
				}
			}
		}
		
	}
	
}
