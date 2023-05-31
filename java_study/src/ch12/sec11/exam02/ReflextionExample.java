package ch12.sec11.exam02;

import java.lang.reflect.*;

public class ReflextionExample {

	public static void main(String[] args) {
		Class clazz = Car.class;  //클래스 객체
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor.getName());   //2개가 출력이 되는데 Car 클래스에서 생성자를 2개 만들어서임
		}
		
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		
		
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		
		
		
	}

}
