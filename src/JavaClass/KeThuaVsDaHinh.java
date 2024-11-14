package JavaClass;

public class KeThuaVsDaHinh {

	public void dongVat() {
		System.out.println("Toi muon an");
	}
	
	public static void main(String[]args) {
		KeThuaVsDaHinh ktdh = new  KeThuaVsDaHinh();
		KeThuaVsDaHinh kt1 = new Pig();
		KeThuaVsDaHinh kt2  = new  Dog();
		ktdh.dongVat();
		kt1.dongVat();
		kt2.dongVat();
		
	}
}

class Pig extends KeThuaVsDaHinh{
	
	public void dongVat() {
		System.out.println("Pig muốn ăn ngô");
	}
}

class Dog extends KeThuaVsDaHinh{
	public void dongVat() {
		System.out.println("Dog muốn ăn xương");
	}
}

