package java_modeling.ch01.asso2;

import java.util.ArrayList;

public class Course {
	//필드
	private String name;
	private ArrayList<Student> students;  //양방향관계 => 서로가 서로의 필드로 가지고 있다.

	//생성자
	public Course(String name) {
		this.name = name;
		students = new ArrayList<>();		
	}
	
	public String getName() {
		return name;
	}
	
	//수강신청한 학생 추가
	public void registorStudent(Student student) {
		students.add(student);
	}
	
	
	//수강취소한 학생 추가
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	
	
	
	
	
	
}
