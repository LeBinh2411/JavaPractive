package JavaClass;

public class Enum02 {

	enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}
	
	public static void main(String[]args) {
		Level en1 = Level.HIGH;
		switch(en1) {
		case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
		}
		
	}
	
}
