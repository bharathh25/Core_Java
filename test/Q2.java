package in.test;
//Super Keyword

class Music{
	void sound() {
		System.out.println("Guitar");
	}
}

class Musician extends Music{
	void sound() {
		super.sound();
		System.out.println("Musician");
	}
}
public class Q2 {
	public static void main(String[] args) {
		Musician m = new Musician();
		m.sound();
	}

}
