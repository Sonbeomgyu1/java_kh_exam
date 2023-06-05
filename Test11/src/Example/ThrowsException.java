package Example;

import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className)
			throws FileNotFoundException, ClassNotFoundException{
		//두 예외를 메서드가 호출 될떄 처리하도록 미룸
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
		test.loadClass("a.txt", "java.lang.String");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (ClassCastException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	
}
