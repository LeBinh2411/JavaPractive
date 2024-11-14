package JavaClass;

public class OverLoad1 {
	//overLoad Nạp chồng phương thức
	//tạo 1 method tính diện tích
	//Tính diện tích các hình
	
	
	
	//hình vuông
	public int tinhDienTich(int side) {
		
		return side * side;
	}
	
	//hình chữ nhật
	public int tinhDienTich(int length, int width) {
		return length * width;
	}
	
	//hình tròn
	public double tinhDienTich(double radius) {
		return Math.PI * radius * radius;
	}
	
	public static void main(String[] args) {
		OverLoad1 ov1 = new OverLoad1();
		
		System.out.println("Diện tích hình vuông là: " + ov1.tinhDienTich(5));
		System.out.println("Diện tích hình chữ nhật là: "+ ov1.tinhDienTich(7, 2));
		System.out.println("Diện tích hình tròn là: " + ov1.tinhDienTich(3.2));
	}
}
