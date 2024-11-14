package JavaClass;

public class Constructor02 {
	
	int ma;
	String ten;
	int nam;
	
	//Constructor với các tham số
	public Constructor02(int ma ,String name, int year) {
		this.ma = ma;
		this.ten = name;
		this.nam = year;
	}
	public void load() {
		System.out.println("ID: " + ma);
		System.out.println("Tên là: "  + ten + " LT");
		System.out.println("Năm là: " +  nam);
	}
	
	
}
