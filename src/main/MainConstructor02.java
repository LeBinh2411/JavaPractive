package main;

import JavaClass.Constructor02;

public class MainConstructor02 {

	public static void main(String [] agrs) {
		Constructor02 cs = new Constructor02(1,"bình", 2003);
		Constructor02 cs2 = new Constructor02(2,"A", 2004);
		Constructor02 cs3 = new Constructor02(3,"B", 2005);
		Constructor02 cs4= new Constructor02(4,"C", 2006);
		Constructor02 cs5 = new Constructor02(5,"D", 2007);
		cs.load();
		cs2.load();
		cs3.load();
		cs4.load();
		cs5.load();
	}
}
