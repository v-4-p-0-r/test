import java.util.*;

public class Run extends Person{
	

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner s = new Scanner(System.in);

		System.out.println("What is your first name?: ");
		String first_name = s.nextLine();
		System.out.println("What is your last name?: ");
		String last_name = s.nextLine();

		Person p = new Person(first_name, last_name);
		int id = rand.nextInt((99999) + 1);
		
		System.out.println("Here is your id: "+id);
		System.out.println("------------------------");
		System.out.println("------------------------");
		System.out.println("------------------------");



	}


}