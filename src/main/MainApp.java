package main;

import JavaClass.GetAndSet;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetAndSet gs = new GetAndSet();
		gs.setName("bo");
		GetAndSet gs2 = new GetAndSet();
		gs2.setName("dứa");
		GetAndSet gs3 = new GetAndSet();
		gs3.setName("thóc");
		System.out.println(gs.getName());
		System.out.println(gs2.getName());
		System.out.println(gs3.getName());
	}

}
