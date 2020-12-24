package io;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class WriteFile {

	public static void main(String[] args) {
		try(  FileOutputStream fos = new FileOutputStream("c:\\iii\\out.txt");                      ){
			//BufferedInputStream bis = new BufferedInputStream(fos);
			String conttent = "中文309";
			byte[] bytes = conttent.getBytes();
			fos.write(bytes);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
