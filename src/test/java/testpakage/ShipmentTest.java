package testpakage;

import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.Test;



public class ShipmentTest  {

    public static String filePath = "C:\\Users\\Sandeep\\eclipse-workspace\\CucumberParameterization\\shipmentDetails.xlsx";
	public static String fileName = "shipmentDetails.xlsx";
	public static String sheetName ="Data";
	
	ReadExcel readExcelData  = new ReadExcel();
	
	@Test
	
    public void displayShipmentValues() throws IOException	
    {
     	Sheet sheet = readExcelData.readExcel(filePath,fileName,sheetName);
    	readExcelData.UpdateArrivalPort(sheet);
    	//dataprovider (shipmentId, shipmentName, shipmentWeight, shipmentArrivalPort, shipmentDeparturePort, shipemtTotalProfit);
    }
}
