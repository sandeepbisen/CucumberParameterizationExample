package commonutilities;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadDataFromExcel {
		
		public String[] readDataFromExcel() throws IOException{
		  String[] excleValue = new String[2];
		  File src=new File("test.xlsx");
		  FileInputStream fis=new FileInputStream(src);
		  XSSFWorkbook wb = new XSSFWorkbook(fis);
		  XSSFSheet sheet= wb.getSheet("Data");
		  
		  File ff =new File("FilePath");
		  FileInputStream fis2 = new FileInputStream(ff);
		  XSSFWorkbook excelWb = new XSSFWorkbook(fis2);
		  XSSFSheet excelSheet = excelWb.getSheet("Data");
		  
		  String fromAddress = excelSheet.getRow(0).getCell(0).toString();
		  String toAddress = excelSheet.getRow(0).getCell(1).toString();
		  
		  int rowTotal = excelSheet.getLastRowNum()+1;
		  
		  for(int i=0;i<rowTotal;i++)
		  {
			  Row row = excelSheet.getRow(i);
			  for(int j=0; j<row.getLastCellNum();j++)
			  {
				  excleValue[i] = row.getCell(j).getStringCellValue();
			  }
		  }
		  
		  
		  
		  
		  //Find number of rows in excel file
 	      int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		  
		  //Create a loop over all the rows of excel file to read it
		    for (int i = 0; i < rowCount+1; i++) {
		        Row row = sheet.getRow(i);
		        //Create a loop to print cell values in a row
		        for (int j = 0; j < row.getLastCellNum(); j++) {
		            //Print Excel data in console
		            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
		        }
		        System.out.println();
     	    }
 	      
			  //Row row = sheet.getRow(0);
			 // Cell cell = row.getCell(0);
     		  //System.out.println(cell);
			 // System.out.println(sheet.getRow(0).getCell(0));			  
			  //String cellval = cell.getStringCellValue();
			  //System.out.println(cellval);
		    return excleValue;
		}
}
