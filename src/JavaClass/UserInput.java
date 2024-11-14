package JavaClass;

import java.util.Scanner;

public class UserInput {

	public static void main(String[]args) {
		Scanner sc1 =  new Scanner(System.in);
		
		
		System.out.println("Mời nhập tên");
		String userName = sc1.nextLine();
		System.out.println("Tên của bạn là: "+  userName);
		
		System.out.println("Mời nhập năm sinh ");
		int st = sc1.nextInt();
		sc1.nextLine(); // Xử lý dòng trống sau nextInt
		System.out.println("Năm sinh là: "+ st);
		
		
		System.out.println("Mời nhập địa chỉ chi tiết");
		int soNha = sc1.nextInt();
		sc1.nextLine(); // Xử lý dòng trống sau nextInt
		String diaChi = sc1.nextLine();
		String thanhPho = sc1.nextLine();
		System.out.println("số nhà: "+ soNha);
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Thanh Phố: "+ thanhPho);
		sc1.close(); // Đóng Scanner sau khi sử dụng
	}
}
