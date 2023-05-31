package ch12.sec03.exam02;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
		
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student target = (Student) obj;
			//no와 name의 값이 같은지 비교한다.
			// no 는 int 타입이니까 == 로 비교, name 은 String 타입이니까 equals
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		
		return false;
	}
	
	
}
