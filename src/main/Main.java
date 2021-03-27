package main;

import connection.HandlerObject;
import model.Boss;

public class Main {

	public static void main(String[] args) {
		read();
		create();
		update();
		delete();
	}

	private static void read() {
		Boss e1 = new Boss();
		e1 = HandlerObject.getInstance().read(Boss.class, "Yugi");
		System.out.println(e1);
	}
	
	private static void create() {
		Boss e1 = new Boss();
		e1.setName("Yugi");
		e1.setAge(25);
		HandlerObject.getInstance().create(e1);
	}
	
	private static void update() {
		Boss e1 = HandlerObject.getInstance().read(Boss.class, "Yugi");
		e1.setName("Yugi Yami");
		HandlerObject.getInstance().update(Boss.class, e1);
	}
	
	private static void delete() {
		Boss e1 = HandlerObject.getInstance().read(Boss.class, "Yugi");
		HandlerObject.getInstance().delete(e1);
	}
}

