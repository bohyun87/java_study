package Quiz_Course;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	private Subject majorSubject;
	
	private ArrayList<Score> scoreList;
	
	public Student(String studentName, int studentID) {
		
	}

	public Student(String studentName, int studentID, Subject majorSubject) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.majorSubject = majorSubject;
		
		scoreList = new ArrayList<>();
	}
	
	public void addScore(Score score) {
		scoreList.add(score);
	}
	
	

}
