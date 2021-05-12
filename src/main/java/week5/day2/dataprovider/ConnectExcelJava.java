package week5.day2.dataprovider;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ConnectExcelJava {

	@SuppressWarnings("resource")
	public  String[][] readExcel(String filename) throws IOException
	{
		
		//XSSFWorkbook wbook=new  XSSFWorkbook("./ExcelPractice/InputData.xlsx/");
		XSSFWorkbook wbook=new  XSSFWorkbook("./ExcelPractice/"+filename+".xlsx/");
		XSSFSheet wsheet=wbook.getSheetAt(0);
		int RowCount=wsheet.getLastRowNum();
		System.out.println("Row Count is "+RowCount);
		int ColCount=wsheet.getRow(0).getLastCellNum();
		System.out.println("Column count is "+ColCount);
		String[][] data=new String[RowCount][ColCount];
		for(int i=1;i<=RowCount;i++)
		{
			XSSFRow row=wsheet.getRow(i);
			for(int j=0;j<ColCount;j++)
			{
				XSSFCell cell=row.getCell(j);
				String value=cell.getStringCellValue();
				data[i-1][j]=value;
				
			}
			
		}
		return data;
		
	}

	

}
