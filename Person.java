public class Person extends Parents{
	private Parents parents;
	private int id;
	private String first_name;
	private String last_name;
	private String full_name;
	private int height; 
	private boolean has_pets;

	public Person(String first, String last) {
		first_name = first;
		last_name = last;
		full_name = first+" "+last;
	}

	public Person(){}

	public String getFullName() {
		return full_name;
	}

	public void setParents(Parents p) {
		parents = p;
	}

	public Parents getParents(){
		return parents;
	}

	public void setID(int new_id) {
		id = new_id;
	}
	public int getID(){
		return id;
	}

	public void setFirstName(String first) {
		first_name = first;
	}

	public String getFirstName(){
		return first_name;
	}

	public void setLastName(String last) {
		last_name = last;
	}

	public String getLastName(){
		return last_name;
	}

	public void setHeight(int a_height) {
		height = a_height;
	}

	public int getHeight(){
		return height;
	}

	public void setHasPets(boolean pets) {
		has_pets = pets;
	}

	public boolean getHasPets(){
		return has_pets;
	}

}

