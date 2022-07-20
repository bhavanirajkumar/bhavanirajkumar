package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws
	EncryptedDocumentException, FileNotFoundException, IOException {
		
		String path="./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String un = wb.getSheet("Sheet1").getRow(4).getCell(0).toString();
		System.out.println(un);
		String pw = wb.getSheet("Sheet1").getRow(4).getCell(1).toString();
		System.out.println(pw);
		
		//to write data in excel sheet
		wb.getSheet("Sheet1").getRow(4).getCell(1).setCellValue("SHEELA");
		wb.write(new FileOutputStream(path));
		wb.close();
	}

}
