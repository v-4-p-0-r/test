public class Parents {
	private Person mother;
	private Person father;
	private int couple_id;

	public Parents(){}

	public Parents(Person mom, Person dad) {
		mother = mom;
		father = dad;
	}

	public void setMother(Person mom) {
		mother = mom;
	}

	public Person getMother(){
		return mother;
	}

	public void setFather(Person dad){
		father = dad;
	}

	public Person getFather(){
		return father;
	}

	public void setCoupleID(int id){
		couple_id = id;
	}

	public int getCoupleID(){
		return couple_id;
	}






}