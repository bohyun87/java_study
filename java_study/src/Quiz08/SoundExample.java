package Quiz08;

public class SoundExample {

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	
	public static void main(String[] args) {
		Soundable s1 = new Cat();
		printSound(new Cat());

		Soundable s2 = new Dog();		
		printSound(new Dog());
	}

}
