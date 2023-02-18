package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class excel4 {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath="C:\\Users\\DELL\\Music\\New Microsoft Excel Worksheet.xlsx";
		File file=new File(filePath);
		FileOutputStream fos=new FileOutputStream(file);
		

	}

}
