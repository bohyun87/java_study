package java_modeling.ch01.asso2;

import java.util.ArrayList;

public class Student {
	//필드
	private String name;
	private ArrayList<Course> courses;  //양방향관계 => 서로가 서로의 필드로 가지고 있다.
	// 1..* 이상일 때는 n 개를 담아야되기 때문에 ArrayList<> 로 담기
	// 1 : 1 관계일때는 1개만 담으면 되기 때문에 ArrayList 에 담지 않고 Course courses 로..
	
	
	//생성자
	public Student(String name) {
		this.name = name;
		courses = new ArrayList<>();
		
	}
	
	//수강신청
	public void registorCourse(Course course) {
		courses.add(course);
	}
	
	//수강취소
	public void dropCourse(Course course) {
		courses.remove(course);
	}
	
	
	
	
	
}
