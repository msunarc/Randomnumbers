package finalexamans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practical1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
			String path="C:\\ABC\\JAVA\\hello.xlsx";
			File f= new File(path);
			FileOutputStream fo=new FileOutputStream (f);
			XSSFWorkbook wb =new XSSFWorkbook();
			XSSFSheet ws = wb.createSheet("random");
			ws.createRow(0).createCell(0).setCellValue("ser.no");
			ws.getRow(0).createCell(1).setCellValue("ran.no");
			for(int i=1;i<200;i++) {
				ws.createRow(i).createCell(0).setCellValue(i);
				ws.getRow(i).createCell(1).setCellValue(abc(1,500));
			}
		    wb.write(fo);
		    wb.close();
		}	
	
	public static int abc(int min,int max) {	
		if (min>=max) {	
		throw new IllegalArgumentException("dont confuse me");}
		 Random r= new Random();  
		   return r.nextInt((max-min)+1) +min; 
	}
		


		


	

	}


