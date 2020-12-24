package exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
 
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr =new FileReader("C:\\aaa.txt");

	}
	public static void checkFile(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		if (!file.exists()) {
			throw new FileNotFoundException();
			
		}
	}

}
