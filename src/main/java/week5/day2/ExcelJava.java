package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelJava {

	public static void main(String srgs[]) throws IOException
	{
		@SuppressWarnings("resource")
		XSSFWorkbook wbook=new  XSSFWorkbook("./ExcelPractice/InputData.xlsx/");
		XSSFSheet wsheet=wbook.getSheetAt(0);
		int RowCount=wsheet.getLastRowNum();
		System.out.println("Row Count is "+RowCount);
		int ColCount=wsheet.getRow(0).getLastCellNum();
		System.out.println("Column count is "+ColCount);
		for(int i=1;i<=RowCount;i++)
		{
			XSSFRow row=wsheet.getRow(i);
			for(int j=0;j<ColCount;j++)
			{
				XSSFCell cell=row.getCell(j);
				String value=cell.getStringCellValue();
				System.out.println(value+" ");
				
			}
			System.out.println(" ");
		}
		
	}

	

}
