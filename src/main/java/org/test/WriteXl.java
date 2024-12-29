package org.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteXl {
	
	public static void main(String[] args) throws IOException {
		
		write();
	}
	
	
	public static void write() throws IOException {
		
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet sheet = wb.createSheet("New");
		
		
		
		 String[][] data = {{"FirstName","lastName","Telephone",},
				 
				 {"Arun","Kumar","9291729782"},  {"kevin","F","801828020"},{"Messi","leo","677126721"},};
		 
		 
		for(int i=0; i<data.length; i++) {
			 
			Row row = sheet.createRow(i);
			
			for(int j=0;j<3;j++) {
			
			Cell cell = row.createCell(j);
			
			cell.setCellValue(data[i][j]);
			
			
			}
			
		}
		
		File f = new File("C:\\Users\\Arun\\eclipse-workspace\\TestNGGamil\\src\\test\\resources\\ExcelDatat\\new.xlsx");
		
		FileOutputStream os = new FileOutputStream(f);
		
		wb.write(os);
		
		
	}

}
