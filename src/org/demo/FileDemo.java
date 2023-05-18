package org.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\thiru\\OneDrive\\Desktop\\Bala\\Selenium\\File\\Frame");

		//mkdir()---> to create a directory(folder)
		//boolean mkdir = f.mkdir();
		//System.out.println(mkdir);
		
		//mkdirs() ---> To Create Directories
		// boolean mkdirs = f.mkdirs();
		// System.out.println(mkdirs);

		// To Createnewfile() ---> to create a file
		//f.createNewFile();
		
		//boolean file = f.isFile();
		//System.out.println("Check whether it is file or not : " + file);
		
		//boolean directory = f.isDirectory();
		//System.out.println("Check whether it is Directory or not : " + directory );
		
		//boolean canWrite = f.canWrite();
		//System.out.println("Check whether it is canwrite or not : " + canWrite );
		
		//boolean canRead = f.canRead();
		//System.out.println("Check whether it is canread or not : " + canRead);
		
		//boolean canExecute = f.canExecute();
		//System.out.println("Check whether it is canExecute or not : " +  canExecute);
		
		//boolean hidden = f.isHidden();
		//System.out.println("Check whether it is hidden or not : " + hidden);
		
		
		String[] list = f.list();
		
		for (String string : list) {
			System.out.println(string);
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		File[] listFiles = f.listFiles();
		
		for (File file : listFiles) {
			System.out.println(file);
		}
		
		
	}
}
