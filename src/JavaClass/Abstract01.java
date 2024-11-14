package JavaClass;

//kkhai báo class o to là abstract
//nếu k thì phải triển khai phần thân của phương thức abstract trong class

abstract class Oto{
	
	static String ten;
	static int namSanXuat;
	//phương thức abstract k có phần thân
	public abstract void test();
}

public class Abstract01 extends Oto{

	public String bienSo = "1";
	public int guong = 5;
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		Abstract01 abs1 = new Abstract01();
		abs1.bienSo = "005-95";//đặt giá trị cho biến
		abs1.guong = 2;
		
		System.out.println("Chiển khai nội dung phương thức trừu tượng");
		System.out.println("Biển số bình: AM" + abs1.bienSo);
	}
}
