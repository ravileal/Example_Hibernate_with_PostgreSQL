package idPrimaryKey;

public class Main {

	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		e1.setFirstName("Ara");
//		e1.setLastName("Ara");
//	
//		e1 = HandlerObject.getInstance().read(Employee.class, 2);
//		System.out.println(e1);
		
		Boss e1 = new Boss();
//		e1.setName("Yugi");
//		e1.setAge(25);
//	
//		HandlerObject.getInstance().create(e1);
//		System.out.println(e1);
		
		e1 = HandlerObject.getInstance().read(Boss.class, "Yu");
//		HandlerObject.getInstance().delete(e1);
		System.out.println(e1);
//		e1.setName("Naruto Uzumaki");
//		HandlerObject.getInstance().update(Boss.class, e1);
	}

}

