package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
 	static FileInputStream f;   //opens/read the excel file
 	static XSSFWorkbook w;      //Represent entire excel book
 	static XSSFSheet sh;        //Represent one sheet inside the excel
  
 	public static String readStringData(int row, int col) throws IOException {  //method to read string
 		f = new FileInputStream("D:\\demo.xlsx");                               //path of the file
 		w = new XSSFWorkbook(f);                    //convert excel file into obj
 		sh = w.getSheet("Sheet1");                  //getting the excel sheet name
 		XSSFRow r = sh.getRow(row);                 //getting th row
 		XSSFCell c = r.getCell(col);                //getting the cell
 		return c.getStringCellValue();              //read the string value
  
 	} 
  
 	public static String readIntegerData(int row, int col) throws IOException { 
 		f = new FileInputStream("D:\\demo.xlsx"); 
 		w = new XSSFWorkbook(f); 
 		sh = w.getSheet("Sheet1"); 
 		XSSFRow r = sh.getRow(row); 
 		XSSFCell c = r.getCell(col); 
 		int val =   (int) c.getNumericCellValue();  //convert double to int using typecasting 
 		return String.valueOf(val);                //convert int to string using valueOf() method 
 		 
 	 
 	} 
  
 }


