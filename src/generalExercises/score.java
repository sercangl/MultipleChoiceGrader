package generalExercises;

public class score {

	
	//initalize
	private String name;
	private String  surname;
	private int puan;
	
	
	
	//Getter setter 
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public int getPuan() {
		return puan;
	}



	public void setPuan(int puan) {
		this.puan = puan;
	}


	//contructor
	public score(String name, String surname, int puan) {
		super();
		this.name = name;
		this.surname = surname;
		this.puan = puan;
	}


	
	
	//toString
	@Override
	public String toString() {
		return "score [name=" + name + ", surname=" + surname + ", puan=" + puan + "]";
	}
	
	
	
}
