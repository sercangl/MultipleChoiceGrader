package generalExercises;

import java.awt.im.InputMethodHighlight;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.Sequencer.SyncMode;
import javax.swing.JOptionPane;

public class StudentRecordManagerTest {

	private static final int MAX_SCORE = 0;

	static Scanner input = new Scanner(System.in);
	
	static ArrayList<Student> students = new ArrayList<Student>();
	
	static ArrayList<answer> answers = new ArrayList<answer>();
	
	 static ArrayList<score> scores = new ArrayList<score>();
	
	 private static String name;
	 private static String surname;
	 private static Formatter output;
	 	static int[] array;
		static int[] array1;
		static int[] array2;
		static int[] array3;
		static int[] array4;
		static int c1 = 0;
		static int c2 = 0;
		static int c3 = 0;
		static int c4 = 0;
		static int c5 = 0;
		
	public static void main(String[] args) {
		
		StudentRecordManager std = new StudentRecordManager( students );
		std.setPath("students.txt");
		std.openFileToRead();
		std.readRecords();
		std.closeFileAfterRead();
				
		
		
		
		
		
		//**********************

		try {
            System.out.println("Lütfen öðrenci numaranýzý giriniz..");
            
			String id = input.next();

						//	System.out.println( students.size() );
			for (int i = 0; i < students.size(); i++) {
            	
				
				
				
				//System.out.println(id + ", " + students.get(i).getStudentId());
            	if(id.equals(students.get(i).getStudentId())){
               
            	
            		name = students.get(i).getName();
            		surname = students.get(i).getSurname();
            		
                   System.out.println("Lütfen kiþisel þifrenizi giriniz...");
                   String pass = input.next();
                   System.out.println("\n");
                    if (pass.equals(students.get(i).getPassword())) {
                    	System.out.println("Hoþgeldiniz..."+students.get(i).getName()+" "+students.get(i).getSurname());
                    	System.out.println("\n");
                    	
                    	String	namee=students.get(i).getName();
                    	String  surnamee = students.get(i).getSurname();
    
     //               	
                    	File file = new File(namee+surname+".txt");
                         if (!file.exists()) {
                             file.createNewFile();
                         }
                    		
                        System.out.println("Programa baþarýyla giriþ yaptýnýz ...\n");
                        menu();
                     //   quiz();
                    
                        break;
                 //   } else {
                 //       System.out.println("Password incorrect. Try Again");
                       
                    }

                } else if (i == students.size()-1) {
                    System.out.println("Kullanýcý adý veya þifre hatalý lütfen þifre bilgileri için @DESTEK ekibimize mail atýnýz..."); 
            }
			}
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
		//*********************
	}
		
	
		
public static void quiz() {
	 
	answerRecord answerrecords = new answerRecord();
	
	questionRecord  quest = new questionRecord();
	
	ScoreRecord scorecord = new ScoreRecord(scores);
	
	
	scorecord.setPathScore("score.txt");
	scorecord.openFileToRead();
	scorecord.readRecords2();
	scorecord.closeFileAfterRead();
	
	
	quest.setPath("question.txt");
	quest.openFileToRead();
	quest.readRecords();
	quest.closeAfterRead();
	
	
	PrintWriter yazici = null;
	
	
	answerrecords.setPath("answer.txt");
	answerrecords.openFileToRead();
	
	answerrecords.readRecords();
	answerrecords.closeAfterRead();
	
		int falsecounter = 0;
		int truecounter = 0;
		int c = 0;
		
		
		//for(int i = 0; i<quest.get().size();i++){
			
		File file = new File(name+surname+".txt");
		file.delete();
		
			for(int i = 0; i<20;i++){
			Random r = new Random();
	        int randomQ = r.nextInt(40-1
	        		);
	        
		Question q = quest.get().get(randomQ);
		
	System.out.println("");
   
	
	
	  	String Str = " "+q.getQuestion()+" \n"+q.getÞýkA()+" "+q.getÞýkB()+" "+q.getÞýkC()+" D-Boþ býrak";
	
		//System.out.println(Str);
		
		System.out.println(Str.replace('_', ' '));
		
		String a = input.next();
		
		///////////////
		
		try {
			yazici = new PrintWriter(new BufferedWriter(new FileWriter(name+surname+".txt", true)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		yazici.println(a);
		
		if(yazici != null){
			yazici.close();
		}
		
		
		
		
		
		
		
		
		if (a.equalsIgnoreCase(answerrecords.getAnswers().get(i).getAnswerr())) {
			System.out.println("");
			
			truecounter = truecounter + 1;
			c = truecounter * 5;
			
		 int yanlýs = 20-truecounter;
			
			
		} else {
			
			falsecounter = falsecounter + 1;
			System.out.println("");
			//System.out.println("Your total Point "+c);
			
			
			
			
		}
		
		}	
		System.out.println(c);
		System.out.println("Sistemden çýkýþ yapmak için -1 tuþlayýnýz");
		scorecord.openFileToWrite();
		scorecord.addScore(new score (name ,surname ,c));
		scorecord.closeFileAfterWrite();
		
	}
		
	

		
			/*Menu*/
	
	public static void menu(){
		int choice;
		do{
		
		System.out.println("             *****************************1.0 Quiz Demo Hoþgeldiniz*****************************");
		System.out.println("             1-Quize baþla...");
		System.out.println("             2-Tüm notlarý gör...");
		System.out.println("             3-En iyi 5 not....");
		System.out.println("             4-Histogramý gör....");
		System.out.println("           -1..Sistemden çýkýþ...");
		System.out.println("                                *************************************************");
		
		choice = input.nextInt();
		
		switch(choice){
		
		case 1 :
		quiz();
		break;
		
		
		case 2 :
		tumSkorlar();
		
		break;
		
		case 3 :
			sýrala();
			break;
			
		case 4:
			histogram();
			break;
		}
		
	
		
		}while(choice != -1);
		System.out.println("programdan çýktýnýz...");
			//return -1;
		
	}
	public static void tumSkorlar(){
	
		
		ScoreRecord scorecord = new ScoreRecord(scores);	
		scorecord.setPathScore("score.txt");
		scorecord.openFileToRead();
		scorecord.readRecords();
		scorecord.closeFileAfterRead();
		
		
	}
	
	
	public static void sýrala(){
		
		ScoreRecord scorecord = new ScoreRecord(scores);	
		scorecord.setPathScore("score.txt");
		scorecord.openFileToRead();
		scorecord.readRecords2();
		//add(10, object)
		
		Collections.sort(scorecord.scores, new Comparator<score>() {
	        @Override
	        public int compare(score sc1, score sc2){
	        	int result = 0;
	        	if (sc1.getPuan() < sc2.getPuan()) {
	        		result = 1;
	        	} else {
	        		result = -1;
	        	}
	            return result;
	        }
	    });

       //for(score s : scorecord.scores){
		for(int i=0;i<5;i++){
        	
    	   System.out.println(scores.get(i).toString());
        }
	
}

	
	
	
	public static void histogram(){
		
		ScoreRecord scorecord = new ScoreRecord(scores);	
		scorecord.setPathScore("score.txt");
		scorecord.openFileToRead();
		scorecord.readRecords2();
		
				for(int i = 0;i<scores.size();i++){
				
						if(scores.get(i).getPuan()<20 && scores.get(i).getPuan()>0){
						 	c1 = c1+1;
						 	//array[i] = scores.get(i).getPuan();
						}else if(scores.get(i).getPuan()<40 && scores.get(i).getPuan()>20){
							c2 = c2+1;
							//array1[i] = scores.get(i).getPuan();
						}else if(scores.get(i).getPuan()<60 && scores.get(i).getPuan()>40){
							c3=c3+1;
								//	array2[i] = scores.get(i).getPuan();
						}else if(scores.get(i).getPuan()<80 && scores.get(i).getPuan()>60){
							c4=c4+1;
							//array3[i] = scores.get(i).getPuan();
						}else if(scores.get(i).getPuan()<100 && scores.get(i).getPuan()>80){
							c5=c5+1;
							//array4[i] = scores.get(i).getPuan();
						}
						//System.out.println(c1+" "+c2);
				}
				System.out.println("Her bir '*' bir kiþiyi temsil etmektedir...\n");
				System.out.printf("0-20 = ");
				for (int i =0;i<c1;i++){
					System.out.printf("*");
						
				}
				System.out.println(c1);
				
				System.out.println("\n");
				System.out.printf("20-40 = ");
				for (int i =0;i<c2;i++){
					System.out.printf("*");
					
					
				}
				
				System.out.println("("+c2+")");
				System.out.println("\n");
				System.out.printf("40-60 = ");
				for (int i =0;i<c3;i++){
					System.out.printf("*");
					
				}
				System.out.println(c3);
				System.out.println("\n");
				System.out.printf("60-80 = ");
				for (int i =0;i<c4;i++){
					System.out.printf("*");
					
				}
				System.out.println(c4);
				System.out.println("\n");
				System.out.printf("80-100 = ");
				for (int i =0;i<c5;i++){
					System.out.printf("*");
					
				}
				System.out.println(c5);
				System.out.println("\n");
				
				System.out.println("\n");
				
			
				
				}
			
			
			
				
			        
			    }

			    
			   
			
			
			
			    

