package Interface;


public interface MyInterface {

	public void dongVat();
	public void  run();
	
	public static void main(String[]args) {
		MyInterface my1  =  new Pig();
		my1.dongVat();
		my1.run();
	}
	
}
class Pig implements MyInterface{

	@Override
	public void dongVat() {
		// TODO Auto-generated method stub
		System.out.println("Pig muốn ăn ngô");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Chạy nhanh phêt:))");
	}
	
	
}