package generalExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class questionRecord {
	
	
	//initialize
	private ArrayList<Question> questions = new ArrayList<Question>();
	private Scanner input;
	private String path;
	
	public questionRecord() {
		
	}
	
	
	public ArrayList<Question> get() {
		return questions;
	}	
	
	
	//random
	public void random(){
	
	 Random rnd = new Random();
     int sayi;                              
     do{
                     sayi = rnd.nextInt(2);
                     System.out.println(sayi);         
                     searchQuestion(sayi);
     }while(sayi != 1);
	}
	
	
	//SearchQuestion
	int searchQuestion(int questionId){
		for(int i=0;i<questions.size();i++){
			Question qs = questions.get(i);
			if(qs.getQuestionid() == questionId){
				System.out.println(qs.getQuestionid()+" "+qs.getQuestion());
				return i;
			}
		}
		return -1;
	}
	
	
	//OpenFileToRead
	public void openFileToRead(){
		try{
			input = new Scanner(new File(path));
		}catch(SecurityException e){
			System.out.println("You don't have write access to this file !!!");
		}catch(FileNotFoundException e){
			System.out.println("File not Found!!");
			System.exit(1);
		}
		
	}
	
	//Read Records
	public void readRecords(){
		//questions.clear();
		Question qs;
		try{
			
			while(input.hasNext()){
				int questionId = input.nextInt();
				String question = input.next();
				String þýkA = input.next();
				String þýkB = input.next();
				String þýkC = input.next();
				
				
			qs = new Question(questionId, question, þýkA, þýkB, þýkC);
			questions.add(qs);
		//	System.out.println(questionId+" "+question+" "+þýkA+" "+þýkB+" "+þýkC);
			}
		}catch(NoSuchElementException nse){
			System.out.println("No Such Element Exception Occured!!");
			
		}catch(IllegalStateException ise){
			System.out.println("Ýllegal State ExCeption!!");
		}
	
			}
		//CloseAfterRead
	public void closeAfterRead(){
		if(input!=null){
			input.close();
		}
		
	}
		
	
	public void displayQuestionRecordsFromFile(){
		readRecords();
		
	}
	
	
	
	
	//Setter Getter 
	public ArrayList<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	
}
