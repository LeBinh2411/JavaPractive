package JavaClass;

public class Class01 {


	static int x =5; // biến tĩnh
	 String ten = "Trần";
	 int z = 1;
	final int a = 1; // final k thể thay đổi"hằng số"
	 
	 
	public static void main(String[] args) {
	
		System.out.println("Giá trị x: "+ x );
		System.out.println("--------------------------------");

		//tạo đối tượng cl1
		//static biến tĩnh
		Class01 cl1 = new Class01();
		System.out.println("hi: Lê" + cl1.ten +" Bình");
		//ghi đè giá trị mới cho z
		cl1.z = 24;
		System.out.println("Giá trị của z là: "+ cl1.z);
		System.out.println("--------------------------------");
		//Tạo đối tượng xe máy xm1
		XeMay xm1 = new XeMay();
		System.out.println("Dung tích của xe: " + xm1.xang + " lit");
		System.out.println("--------------------------------");
		System.out.println("Hằng số là: " + cl1.a);
		
		System.out.println("--------------------------------");
		
	}
	
	
}
///Class01 cl1 = new Class01();