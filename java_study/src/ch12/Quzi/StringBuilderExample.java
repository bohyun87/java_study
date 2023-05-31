package ch12.Quzi;

public class StringBuilderExample {

	public static void main(String[] args) {
		/*
		String str = "";
		for(int i=0; i<=100; i++) {
			str += i;
		}
		
		
		System.out.println(str);
		*/
		
		
		String str = new StringBuilder()
				.append("100")
				.insert(0, "1")
				
				.toString();
				
		
		System.out.println(str);
		
	}

}
