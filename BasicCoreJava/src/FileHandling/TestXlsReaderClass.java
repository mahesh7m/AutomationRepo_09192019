package FileHandling;

import java.io.IOException;

public class TestXlsReaderClass {

	public static void main(String[] args) throws IOException
	{
	
		Xls_Reader x1=new Xls_Reader("D:\\AutomationRepo_09192019\\BasicCoreJava\\src\\FileHandling\\TextData.xls");
		
		//Get Row Count
		System.out.println(x1.getrowcount("Sheet1"));
		
		//Get Coloumn Count
		System.out.println(x1.getColumncount("Sheet1"));
		
		//Get Cell Data
		System.out.println(x1.getCellData("sheet1", 1, 1));
		
	}

}
