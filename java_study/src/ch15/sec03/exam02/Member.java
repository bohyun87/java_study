package ch15.sec03.exam02;

public class Member {

	public String name;
	public int age;
	
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public int hashCode() { //객체의 주소 => 객체를 구분할 때 사용
		return name.hashCode() + age;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {  
			//instanceof => obj 객체가 member 객체를 가지고 있는지?
			// => 가지고 있으면 강제타입변환 하기
			Member target = (Member)obj;  //강제타입변환
			return target.name.equals(name) && (target.age == age);
				// obj 의 name  // 필드 name
		} else {
			return false;
		}
	}
	
	
	
}
