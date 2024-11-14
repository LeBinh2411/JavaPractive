package JavaClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DataAndTime {

	  public static void main(String[] args) {
		    LocalDate ld = LocalDate.now(); // Tạo 1 đối tượng
		    System.out.println(ld); // ngay hiện tại
		    
		    LocalTime lc2 = LocalTime.now();//giờ phút giây nano giây
		    System.out.println(lc2);
		    
		    LocalDateTime lc3 = LocalDateTime.now();
		    System.out.println(lc3);
		    
		    
		    ///định dạng
		    LocalDateTime lc4 = LocalDateTime.now();
		    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		    String fomatDateTime = lc4.format(dtf1);
		    System.out.println("Định dạng: "+ fomatDateTime);
		    
		  }
}
