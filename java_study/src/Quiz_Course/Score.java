package Quiz_Course;

public class Score {
	private Student student;
	private Subject subject;
	
	private int score;
	private String grade;
	
	public Score(Student student, Subject subject) {
		this.student = student;
		this.subject = subject;
		
		this.student.addScore(this);
		this.subject.addScore(this);
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
