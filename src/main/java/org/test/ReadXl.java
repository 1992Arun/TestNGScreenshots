package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import  org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class ReadXl {
	
	public static Workbook wb;
	
	public static Sheet sheet;
	
	
	
	public static void main(String[] args) throws IOException {
		
		read();
		
	}
	
	
	
	
	@DataProvider(name="details")
	public static String[][] read() throws IOException{
	
	File f = new File("C:\\Users\\Arun\\eclipse-workspace\\TestNGGamil\\src\\test\\resources\\ExcelDatat\\new.xlsx");
	
	FileInputStream is = new FileInputStream(f);
	
	     wb = new XSSFWorkbook(is);
	
	       sheet = wb.getSheet("Email");
	       
	      
	   
	   int row = sheet.getPhysicalNumberOfRows();
	   
	   int cell = sheet.getRow(0).getPhysicalNumberOfCells();
	   
	   String[][] data = new String[row-1][cell];
	   
	   
	   for(int i=1; i<row; i++) {
		   
	   data[i-1][0]= Cell(i,0);
	   
	   data[i-1][1]= Cell(i,1);
	   
	   data[i-1][2]= Cell(i,2);
	   
	   data[i-1][3]= Cell(i,3);
	   
	   
		   
	   }
	   
	   
	   return data;
	
	 
	
	
	}
	
	
	public static String Cell(int row1, int column){
		
		String value;
		
		Row row = sheet.getRow(row1);
		
	     Cell cell = row.getCell(column);
	     
	  int cellType = cell.getCellType(); 
	     
	     
	     if(cellType==1) {
	    	 
	    	  value = cell.getStringCellValue();
	    	 
	     } else if(DateUtil.isCellDateFormatted(cell)) {
	    	 
	    	 Date date = cell.getDateCellValue();
	    	 
	    	 SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
	    	 
	    	  value = sd.format(date);
	    	 
	    	 
	     } else {
	    	 
	    	 double num = cell.getNumericCellValue();
	    	 
	    	 long n = (long)num;
	    	 
	    	  value = String.valueOf(n);
	    	 
	     }
		   
		return value;
	   }
	   

}
