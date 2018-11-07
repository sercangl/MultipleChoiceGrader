package generalExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * This type will deal with file I/O
 * 
 * Author : Your LI
 * Date : May 24,2016
 */

public class StudentRecordManager {

	/*instance variables*/
	ArrayList<Student> students = new ArrayList<Student>();
	
	private Scanner input;
	private Formatter output;
	private String path;
	
	/*constructor*/
	public StudentRecordManager(ArrayList<Student> students) {
		this.students = students;
	}
	
	/*find student*/
	private int findStudent(String studentId){
		for(int i=0;i<students.size();i++){
			Student st = students.get(i);
			
			if(st.getStudentId().equals(studentId)){
				return i;
			}
		}
		return -1;
	}
	/*add student*/
	public void addStudent(Student student){
		int recordIndex = findStudent(student.getStudentId());
		if(recordIndex==-1){
			students.add(student);
			openFileToWrite();
			writeRecords();
			closeFileAfterWrite();
		}else{
			System.out.println("Duplicate record is not alllowed!");
		}
	}

	public void closeFileAfterWrite() {
		if(output!=null){
			output.close();
		}
		
	}

	public void writeRecords() {
		try{
			for(Student st: students){
				output.format("%s  %s  %s  %d\n", st.getStudentId(), st.getName(), st.getSurname(), st.getAge());
			}
		}catch(NoSuchElementException e){
			System.out.println("Formatter closed!");
		}	
	}

	public void openFileToWrite() {
		
		try {
			output = new Formatter(path);
		}catch (SecurityException e) {
			System.out.println("You do not have write access to this file!");
		}
		
		catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(1);
		}
		
	}

	/*reading from file*/
	public void openFileToRead(){
		try {
			input = new Scanner(new File(path));
		}catch (SecurityException e) {
			System.out.println("You do not have write access to this file!");
		}
		
		catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(1);
		}
	}

	public void readRecords(){
		students.clear();
		Student st;
		try{
			while(input.hasNext()){
			
				String studentId = input.next();
				String name = input.next();
				String surname = input.next();
				int age = input.nextInt();
				String password = input.next();
				
				st = new Student(studentId, name, surname, age , password);
				students.add(st);
				//System.out.println(studentId+" "+name+" "+surname+" "+age+" "+password);
			}
		}catch(NoSuchElementException nse){
			//System.out.println("No such element exception occured");
		}catch(IllegalStateException ise){
			System.out.println("IllegalStateException");
		}
	}
	
	public void closeFileAfterRead(){
		if(input!=null){
			input.close();
		}
		
	}
	
	
	
	
	
	public void displayStudentRecordsFromFile(){
		readRecords();
	}
	/*setters and getters*/
	public ArrayList<Student> getStudents() {
		return students;
	}


	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public Formatter getOutput() {
		return output;
	}

	public void setOutput(Formatter output) {
		this.output = output;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	
}
