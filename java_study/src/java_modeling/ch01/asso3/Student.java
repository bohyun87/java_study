package java_modeling.ch01.asso3;

import java.util.ArrayList;

public class Student {
	//필드
	private String name;
	private ArrayList<Transcript> transcripts;
	//학생 1명이 여러개의 성적을 가질 수 있으므로 ArrayList 로 담기
	
	//생성자
	public Student(String name) {
		this.name = name;
		transcripts = new ArrayList<>();
	}
	
	
	//메소드
	//수강신청 추가
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	
	
	
}
