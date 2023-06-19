import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class example {

	public static void main(String[] args) {
//		2023-06-12
//		1.try - catch - finally 가 각각 어떤 역할을 하는지 작성하시오.
//		여기
//
//		2.파일 a.txt 파일에 “Hello, World”를 나타나게 하시오.
//		이때 사용되는 class를 모두 나열하시오.
//		github링크
//
//		3.파일 b.txt 파일의 내용의 읽어서 console 창에 display 하시오.
//		이때 사용되는 class를 모두 나열하시오.
//		github링크
//
//		4.socket 통신을 위한 프로그램 작성 순서에 맞춰 작성하고 그 순서를 정리하시오.
//		github링크
//
//		5.실행 순서를 작성하고 그 순서를 정리하여 작성하시오.
//		여기
//--------------------------------------------------------
		// try~ catch 구문은 예외가 발생한다 즉 프로그램에러
		// 프로그램이 돌다가 데이터를 잘못받거나 다른 데이터 타입의 자료를
		// 사용하는것
		// try = 예외가 발생할 가능성이 있는 코드를 넣어서 에러를 감지하고
		// catch 발생한 에러를 예외처리를 하고
		// finally는 에러가 발생하거나 안하거나 반드시 실행해야하는 부분입니다.
		//

		int num1 = 10, num2 = 0;
		double result;
		try {
			result = num1 / num2;
			System.out.println("정상 결과값 :" + String.valueOf(result));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눗셈을 하면 안됩니다.");
			System.out.println("에러내용 :" + e.toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이를 벗어났습니다.");
			System.out.println("에러내용 :" + e.toString());
		} finally {
			System.out.println("여기는 반드시 실행해야하는 부분입니다.");
		}

		// ----------------------------------------------------------
		//파일생성코드
	try {
		OutputStream output = new FileOutputStream("C:/workspace/output.txt");
		String str = "Hello, world.";
		byte[] by = str.getBytes();
	} catch(Exception e) {
		e.getStackTrace();
	}
	//txt파일 불러오기
	try {
		// 파일 객체 생성
	String file = "C:/workspace/output.txt";
	//입력 스트림생성 //파일에 글자쓰기 
	String lineToAppend = "Hello,World";
	byte[] byteArr=lineToAppend.getBytes();
	Files.write(Paths.get(file), byteArr, StandardOpenOption.APPEND);
	}
	catch(Exception e) {
		System.out.println(e);
	}
//-----------------------------------------------------------	
	// 파일 콘솔에 호출하기 
	File file = new File("C:/workspace/output.txt");
	//파일 코드를 쓰고 임포트 시켜야함.
	
	try {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		reader.lines().forEach(System.out::println);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	//-------------------------------------------------
	public void fileSave(String fileName) {
		try(ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(fileName));)
		{
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//---------------------------------------------
	
	
	}
	
	}
	

