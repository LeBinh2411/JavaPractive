package JavaClass;

public class GetAndSet {

	//private <access modifier> chỉ sử dụng trong class
	private String name;
	
	//Cung cấp phương thức get và set công khai để truy cập private
	//Getter trả về giá trị biến name
	public String getName() {
		return name;
	}
	//setter thiết lập giá trị - set
	//this. từ khóa đc sử dụng để tham chiếu đến đối tượng hiển tại
	public void setName(String newName) {
		this.name = newName;
	}
	
}
