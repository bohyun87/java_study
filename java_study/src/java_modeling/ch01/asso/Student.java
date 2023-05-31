package java_modeling.ch01.asso;

import java.util.ArrayList;

public class Student {
	//필드
	private String name;
	
	//단방향 관계 => 학생은 자기가 수강하는 과목을 알고 있다.
	private ArrayList<Course> courses;  
	
	//생성자
	public Student(String name) {
		this.name = name;
		courses = new ArrayList<>();
	}
	
	//수강신청 메소드
	public void registerCourse() {}
	
	//수강취소 메소드
	public void dropCourse() {}
}
