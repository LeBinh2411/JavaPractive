package main;

import JavaClass.SubclassSuperclass;


public class MainSubclass extends SubclassSuperclass{

private String ten = "Ab";
	
	//java k tự tạo contructor mặc định nếu lớp cha có contructor có tham số
	public MainSubclass(String NSX, String dungTich) {
		//gọi contructor của lớp cha
		super(NSX, dungTich);
	
	}
	

	public static void main(String[] agsr) {
		//tạo đối tượng lớp test
		MainSubclass ts1 = new MainSubclass("Honda","125cc");
		///gọi phương thức thông tin xe
		ts1.ThongTinXe();
		System.out.println("Xe " + ts1.ten 
				+" "+ts1.nsx + " dung tích: " + ts1.dungTich);
	}
}
