package JavaClass;

public enum EnumTest {

	LOW,
	MEDIUM,
	HIGH;
	
	private String may;
	
	//contructor của enum
	EnumTest(){	
	}
	EnumTest(String may){
		this.may = may;
	}
	//getter
	public String getMay() {
		return may;
	}
	//setter
	public void setMay(String newMay) {
		this.may = newMay;
	}
}

