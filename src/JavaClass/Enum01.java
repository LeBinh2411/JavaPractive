package JavaClass;

public class Enum01 {
	  enum Level {
	    LOW,
	    MEDIUM,
	    HIGH
	  }

	  public static void main(String[] args) {
	    Level myVar = Level.MEDIUM; 
	    System.out.println("Đồ họa: "+myVar);
	  }
	}