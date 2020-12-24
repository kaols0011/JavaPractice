package io;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		File file = new File("c:\\Osrinst.log");
		if (file.exists()) {
			System.out.println("檔案不存在");
			
		}
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println("是否為目錄="+file.isDirectory());
		
		File dir = new File("c:\\iii");
		System.out.println("iii是否為目錄="+file.isDirectory());
		
		/*String[] list = dir.list();
		for (String fileName : list) {
			System.out.println(fileName);
		}
		*/
		File[]lisFiles =dir.listFiles();
		for (File file2 : lisFiles) {
			System.out.println(file2.getName()+"是不是目錄"+file2.isDirectory());
		}

	}

}
