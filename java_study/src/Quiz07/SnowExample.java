package Quiz07;

public class SnowExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;  //자동타입변화
		
		snowTire.run();  //다형성X
		tire.run();		//다형성O
			
	}

}
