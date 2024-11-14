package JavaClass;

public class Class02 {
	
	int x =5;
	int y =5;

	//void không trả về bất kỳ giá trị nào
	public static void main(String[] args) {
		xeMythod();
//		Tạo đối tượng từ class02
		Class02 km1 = new Class02();
		km1.kmMythod();
		//tạo đối tượng xe máy  1
		XeMay xm1 = new XeMay();
		xm1.tocDo(999);//set giá trị cho phương thức
		
		myMethods();
	}
	
//	Static method
	static void xeMythod() {
		System.out.println("xin chào AB");
	}
	
//	Public method
	public void kmMythod() {
		System.out.println("120km");
	}
	
	static void myMethods() {
		Class02 cl = new Class02();
		System.out.println("Test : " +( cl.x * cl.y));
		System.out.println("Test : " + (cl.x + cl.y));
	}
	
}
