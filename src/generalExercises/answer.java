
package generalExercises;

public class answer {

	// initialize
	private int answerid;
	private String answerr;
	
	
	
	//Constructor
	public answer(int answerid, String answerr) {
		super();
		this.answerid = answerid;
		this.answerr = answerr;
	}
	// Getter setter
	public int getAnswerid() {
		return answerid;
	}



	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}



	public String getAnswerr() {
		return answerr;
	}



	public void setAnswerr(String answerr) {
		this.answerr = answerr;
	}



	
	//toString
	
	@Override
	public String toString() {
		return "answer [answerid=" + answerid + ", answerr=" + answerr + "]";
	}



	
	
	
}
