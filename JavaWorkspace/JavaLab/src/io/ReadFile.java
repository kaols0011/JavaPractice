package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.Buffer;

public class ReadFile {

	public static void main(String[] args) {
		
	try(FileInputStream fis = new FileInputStream("c:\\iii\\a.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);	
			
			) {
	    int b = bis.read();
	    char c = (char)b;
	    System.out.println(c);
	
	    b =bis.read();
	    c =(char)b;
	    System.out.print(c);
	    
	    //System.out.println(fis.available());
	    
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
		
				
	}

}
