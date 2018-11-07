package generalExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class answerRecord {

	//initialize
		ArrayList<answer> answers = new ArrayList<answer>();
		private Scanner input;
		private String path;
		
	
	//Constructor
		public answerRecord(ArrayList<answer> answers, Scanner input, String path) {
			super();
			this.answers = answers;
			this.input = input;
			this.path = path;
		}
	
	
		public answerRecord() {
			// TODO Auto-generated constructor stub
		}


		//SearchAnswer
		int searchAnswer(int answerId){
			for(int i=0;i<answers.size();i++){
				answer as = answers.get(i);
				if(as.getAnswerid() == answerId){
					System.out.println(as.getAnswerid()+" "+as.getAnswerr());
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
			//answers.clear();
			answer as;
			try{
				
				while(input.hasNext()){
					int answerId = input.nextInt();
					String answer = input.next();
				
					
					
				as = new answer(answerId , answer);
				answers.add(as);
			//	System.out.println(answerId+" "+answer);
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
		
		public void displayAnswerRecordsFromFile(){
			readRecords();
			
		}
		
		
		
		
	
		//Getter And Setter
		public ArrayList<answer> getAnswers() {
			return answers;
		}


		public void setAnswers(ArrayList<answer> answers) {
			this.answers = answers;
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
