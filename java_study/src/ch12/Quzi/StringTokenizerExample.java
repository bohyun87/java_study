package ch12.Quzi;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		StringTokenizerExample st = new StringTokenizerExample(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}

}
