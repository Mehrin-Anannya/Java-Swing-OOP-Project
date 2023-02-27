package iit.oop.project.sao;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Iterator;
import java.util.List;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.bouncycastle.util.test.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import iit.oop.project.model.Customer;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public void getCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveCustomer(Customer customer) throws IOException {
		// TODO Auto-generated method stub
//		String excelFileName = "E:\\Eclipse workspace\\JavaGUIProject\\src\\assets\\Test.xlsx";//name of excel file
		String excelFileName = "E:\\GUI.xlsx";//name of excel file
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream(excelFileName);
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}	

		//String sheetName = "Sheet1";//name of sheet

		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet sheet = wb.getSheetAt(0) ;
         
			Row row = sheet.createRow(sheet.getLastRowNum() + 1);
			Cell custIdCell =  row.createCell(0);
			custIdCell.setCellValue(sheet.getLastRowNum() + 1);
			
			Cell custNameCell = row.createCell(1);
			custNameCell.setCellValue(customer.getCustomerName());
			
			Cell custNIdCell = row.createCell(2);
			custNIdCell.setCellValue(customer.getNid());
				
			Cell custStatusCell = row.createCell(3);
			custStatusCell.setCellValue(customer.getCustomerStatus());
			
			FileOutputStream fileOut = new FileOutputStream(excelFileName);

			//write this workbook to an Outputstream.
			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}