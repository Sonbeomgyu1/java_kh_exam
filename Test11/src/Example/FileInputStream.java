package Example;

import java.io.IOException;

public class FileInputStream {

	public FileInputStream(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			
		}catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				System.out.println(e);
			}catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

	private char[] read() {
		// TODO Auto-generated method stub
		return null;
	}

}
