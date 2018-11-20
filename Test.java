public class Test extends Person{
	
	private Person person;

	public Test(){
	}


	public static void main(String[] args){ 
		//Test t1 = new Test();
		Person p1 = new Person("Jackson", "Lewis");
		p1.setID(15532);
		p1.setHasPets(true);

		Person p1_mom = new Person("Jackie", "Patterson");
		Person p1_dad = new Person("Jorge", "Lewis");
		Parents p1_parents = new Parents(p1_mom, p1_dad);
		p1_parents.setCoupleID(324222);

		p1.setParents(p1_parents);



		System.out.println("id: "+p1.getID());
		System.out.println("full name: "+p1.getFullName());
		System.out.println("has pets: "+p1.getHasPets());
		System.out.println("---------------------------");
		System.out.println("mother of "+p1.getFullName()+": "+p1_mom.getFullName());
		System.out.println("father of "+p1.getFullName()+": "+p1_dad.getFullName());


	}




}