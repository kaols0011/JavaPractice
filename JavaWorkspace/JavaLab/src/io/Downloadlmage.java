package io;

import java.awt.event.InputEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Downloadlmage {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld");
        try (InputStream is = url.openStream();     
        	BufferedInputStream bis =new BufferedInputStream(is);
        	
        	FileOutputStream fos = new FileOutputStream("c:\\iii\\a.txt");
        	BufferedOutputStream bos =new BufferedOutputStream(fos);
        		){
        	byte[] buffer =new byte[1024];
        	int length;
        	while ((length =bis.read(buffer)) != -1 ) {
        		bos.write(buffer,0,length);
				
			}
        	
        	
        	
 
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
