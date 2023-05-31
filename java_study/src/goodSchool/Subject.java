package goodSchool;

import java.util.ArrayList;

public class Subject {
	protected String subjectName;
	protected int studentId;
	protected int gradeType;
	
	protected ArrayList<Student> studentList;
	
	
		
	public Subject(String subjectName, int studentId) {
		this.subjectName = subjectName;
		this.studentId = studentId;
		
		studentList = new ArrayList<>();
	}
	
	public void addSubjectScore(Score score){
		studentList.addAll(score);
	}
		
	public void register(Student student) {
		studentList.add(student);
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	
}
