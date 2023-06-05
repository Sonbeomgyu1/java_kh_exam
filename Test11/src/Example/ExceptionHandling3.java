package Example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		}catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		}finally {
			if(fis != null) {
			try {
				fis.close();
			}	catch (IOException e) {
				e.printStackTrace();
			}
			}
			System.out.println("항상 수행 됩니다.");
		}
		System.out.println("여기서도 수행 됩니다.");
	}

}
