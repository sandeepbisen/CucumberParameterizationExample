package testpakage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	FileInputStream input_document;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException
	{
		input_document = new FileInputStream(new File(filePath));
		wb = new XSSFWorkbook(input_document); 
		sheet= wb.getSheet(sheetName);
		return sheet;
	}
	
	public void UpdateArrivalPort(Sheet sheet) throws IOException
	{
		sheet.getRow(1).getCell(3).setCellValue("Agra");
//		//Find number of rows in excel file
//	      int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
//		  
//		  //Create a loop over all the rows of excel file to read it
//		    for (int i = 0; i < rowCount+1; i++) {
//		        Row row = sheet.getRow(i);
//		        //Create a loop to print cell values in a row
//		        for (int j = 0; j < row.getLastCellNum(); j++) {
//		            //Print Excel data in console
//		        	if(row.getCell(j).getStringCellValue().toString().equalsIgnoreCase("Chennai"))
//		            	row.getCell(j).setCellValue("Agra");
//		            System.out.print(row.getCell(j).getStringCellValue().toString()+"|| ");
//		            //String.format("%-15s%-25s%-25s%-25s%-15s%15s",....)
//	    
//		        }
//		        System.out.println();
//	 	    }
//		    
		    Iterator ite = sheet.rowIterator();
			while(ite.hasNext()){
				Row row = (Row) ite.next();
				Iterator<Cell> cite = row.cellIterator();
				DataFormatter formatter = new DataFormatter();
				while(cite.hasNext()){
					Cell c = cite.next();
//					if(formatter.formatCellValue(c.getStringCellValue().equalsIgnoreCase("Chennai"))
//						c.setCellValue("Agra");
					String rowdata = formatter.formatCellValue(c);
					String output = String.format("%-15s%-25s%-25s%-25s%-15s%15s",rowdata);
					System.out.print(output +"  ");
				}
				System.out.println();
			}
			input_document.close();		
	}
	

}
