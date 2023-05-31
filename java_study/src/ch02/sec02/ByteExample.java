package ch02.sec02;

public class ByteExample {

	public static void main(String[] args) {
		// byte var1 = -128;
		// byte var6 = 128;  // byte 는 127 까지만 사용할 수 있기 때문에 오류 표시됨
		
		long var1 = 10;  // long 형으로 작성했기 때문에 64bit로 작성될 것으로 생각하지만
						 // 컴파일러는 기본적으로 int 로 인식하기 때문에 32bit
						 // long 타입으로 사용하려면 long var1 = 10L; 로 작성해야됨
		long var3 = 10000000000L;  //
		
	}

}
