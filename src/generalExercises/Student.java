package generalExercises;
/*
 * Student type
 * 
 * Author : Your LI
 * Date : May 24,2016
 */
public class Student {

	/*instance variables*/
	private String studentId;
	private String name;
	private String surname;
	private int age;
	private String password;
	
	/*constructor*/
	public Student(String studentId, String name, String surname, int age, String password) {
		this.studentId = studentId;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.password = password;
	}

	/*getters and setters*/
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


    /*toString*/

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", surname=" + surname + ", age=" + age
				+ ", password=" + password + "]";
	}

	
	
	
}
