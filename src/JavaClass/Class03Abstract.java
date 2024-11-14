package JavaClass;

public class Class03Abstract {

	public static void main(String[] agsr) {
		
		Abstract01 ab = new Abstract01();
//		System.out.println("Dung tích xăng: " + ab.ten+"L");
		System.out.println("Biển số bình: AM" + ab.bienSo);
		System.out.println("guong : "+ ab.guong);
		System.out.println("Nghịch : " + (ab.bienSo + ab.guong));
		ab.test();
	}
}
