package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		//InterfaceC가 InterfaceA, InterfaceB를
		//상속하고 있으므로 아래와 같이 사용가능
		InterfaceA ia = new InterfaceImpl();
		ia.methodA();
		
		InterfaceB ib = new InterfaceImpl();
		ib.methodB();
		
		//InterfaceC가 InterfaceA, InterfaceB를
		//상속하고 있으므로 InterfaceA, InterfaceB에 있는 메소드 사용 가능
		InterfaceC ic = new InterfaceImpl();
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
