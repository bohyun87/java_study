package goodSchool;

public class Score {
	protected int studentId;
	protected Subject subject;
	protected int point;
	protected Student student;
		
	
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
		
		this.student.addSubjectScore(this);
		this.subject.register(this);
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}
	
	public String toString() {
		return "학번: " + studentId + "," + subject.getSubjectName() + " : " + point ;
	}
	
}
