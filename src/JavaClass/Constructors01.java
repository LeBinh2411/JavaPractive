package JavaClass;

public class Constructors01 {

	int x; // khai báo biến int x
	String modelTen;
	int modelTuoi;
	int modelCanNang;
	
	//Tạo 1 hàm "constructor" cho class Contructors01
	public Constructors01(String ten ,int tuoi, int canNang) {
		//x = 5; //set giá trị x = 5;
		modelTen = ten;
		modelTuoi = tuoi;
		modelCanNang = canNang;
	}
	
	
	
	public static void main(String[] args) {
		//Tạo 1 đối tượng cho Constructors01
		//Constructors01 cs1 = new Constructors01();
		//System.out.println(cs1.x);
		Constructors01 cs1 = new Constructors01("Bình", 21, 78);
		System.out.println("Hi: " + cs1.modelTen 
				+ " __ Tuổi: "+ cs1.modelTuoi + " __Cân nặng: "+ cs1.modelCanNang);
		
		Constructors01 cs2 = new Constructors01("Dương", 22, 68);
		System.out.println("Hi: " + cs2.modelTen 
				+ " __ Tuổi: "+ cs2.modelTuoi + " __Cân nặng: "+ cs2.modelCanNang);
	}
	
}
