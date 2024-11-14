package JavaClass;

public class Contructor03 {

	 String brand;
	    int year;

	    // Constructor mặc định
	    public Contructor03() {
	        brand = "o";
	        year = 0;
	    }

	    // Constructor có một tham số
	    public Contructor03(String brand) {
	        this.brand = brand;
	        year = 0;
	    }

	    // Constructor có hai tham số
	    public Contructor03(String brand, int year) {
	        this.brand = brand;
	        this.year = year;
	    }

	    public void displayInfo() {
	        System.out.println("Brand: " + brand + ", Year: " + year);
	    }

	    public static void main(String[] args) {
	    	Contructor03 car1 = new Contructor03();              // Sử dụng constructor mặc định
	    	Contructor03 car2 = new Contructor03("Toyota");       // Sử dụng constructor có 1 tham số
	    	Contructor03 car3 = new Contructor03("Honda", 2022);  // Sử dụng constructor có 2 tham số

	        car1.displayInfo();  // Output: Brand: Unknown, Year: 0
	        car2.displayInfo();  // Output: Brand: Toyota, Year: 0
	        car3.displayInfo();  // Output: Brand: Honda, Year: 2022
	    }
}
