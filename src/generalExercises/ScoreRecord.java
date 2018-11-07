package generalExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScoreRecord {

	
	
	// initialize
	
	ArrayList<score> scores = new ArrayList<score>();
	
	
	private Scanner input;
	private Formatter output;
	private String pathScore;
	
	
	// Constructor
	public ScoreRecord(ArrayList<score> scores) {
		super();
		this.scores = scores;
	}
	
	
	
	/*add student*/
	public void addScore(score scoress){
		
			
			scores.add(scoress);
			openFileToWrite();
			writeRecords();
			closeFileAfterWrite();
		
	}

	
	
	public void closeFileAfterWrite() {
		if(output!=null){
			output.close();
		}
		
	}
	
	
	
	public void writeRecords() {
		try{
			
			for(score sc: scores){
				output.format("%s  %s  %d\n", sc.getName(),sc.getSurname(),sc.getPuan());
			}
		}catch(NoSuchElementException e){
			System.out.println("Formatter closed!");
		}	
	}
	


	
				public void openFileToWrite() {
						
						try {
							output = new Formatter(pathScore);
						}catch (SecurityException e) {
							System.out.println("You do not have write access to this file!");
						}
						
						catch (FileNotFoundException e) {
							System.out.println("File Not Found!");
							System.exit(1);
						}
						
					}
					

		
				public void openFileToRead(){
			try {
				input = new Scanner(new File(pathScore));
			}catch (SecurityException e) {
				System.out.println("You do not have write access to this file!");
			}
			
			catch (FileNotFoundException e) {
				System.out.println("File Not Found!");
				System.exit(1);
			}
		}
	
	
	
				public void readRecords(){
					
					score sc;
					try{
						while(input.hasNext()){
						
							String name = input.next();
							String surname = input.next();
							int puan = input.nextInt();
							
								
							sc = new score(name, surname, puan);
							scores.add(sc);
							System.out.println(" "+name+" "+surname+" "+puan);
						}
					}catch(NoSuchElementException nse){
						System.out.println("No such element exception occured");
					}catch(IllegalStateException ise){
						System.out.println("IllegalStateException");
					}
				}
	
	
				public void readRecords2(){
					
					score sc;
					try{
						while(input.hasNext()){
						
							String name = input.next();
							String surname = input.next();
							int puan = input.nextInt();
							
								
							sc = new score(name, surname, puan);
							scores.add(sc);
							//System.out.println(" "+name+" "+surname+" "+puan);
						}
					}catch(NoSuchElementException nse){
						System.out.println("No such element exception occured");
					}catch(IllegalStateException ise){
						System.out.println("IllegalStateException");
					}
				}
	
				
				
				
	
				public void closeFileAfterRead(){
					if(input!=null){
						input.close();
					}
					
				}


//Getter Setter
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



				public String getPathScore() {
					return pathScore;
				}



				public void setPathScore(String pathScore) {
					this.pathScore = pathScore;
				}




				
	
	
}
