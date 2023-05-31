package Quiz_Course;

import java.util.ArrayList;

public class Subject {
	private String studentNme;
	private String geSubject;
	private String reSubject;
	private int score;
	
	private ArrayList<Score> scoreList;
	
	public Subject(String geSubject, String reSubject) {
		this.geSubject = geSubject; 
		this.reSubject = reSubject;
		
		scoreList = new ArrayList<>();
	}
	
	public void addScore(Score score) {
		scoreList.add(score);
	}
	
}
