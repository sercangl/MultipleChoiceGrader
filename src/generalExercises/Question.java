package generalExercises;


public class Question {
	
	
	
	//initialize     
	private int questionid;
	private String question;
	private String þýkA;
	private String þýkB;
	private String þýkC;

	
	
	
	
	
	
	
	
	
	
	// constructor
	
	public Question(int questionid, String question, String þýkA, String þýkB, String þýkC) {
		super();
		this.questionid = questionid;
		this.question = question;
		this.þýkA = þýkA;
		this.þýkB = þýkB;
		this.þýkC = þýkC;
	
	}

	
	





	// Getter and Setter
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getÞýkA() {
		return þýkA;
	}
	public void setÞýkA(String þýkA) {
		this.þýkA = þýkA;
	}
	public String getÞýkB() {
		return þýkB;
	}
	public void setÞýkB(String þýkB) {
		this.þýkB = þýkB;
	}
	public String getÞýkC() {
		return þýkC;
	}
	public void setÞýkC(String þýkC) {
		this.þýkC = þýkC;
	}

	
	// toString
	@Override
	public String toString() {
		return "Question [questionid=" + questionid + ", question=" + question + ", þýkA=" + þýkA + ", þýkB=" + þýkB
				+ ", þýkC=" + þýkC + "]";
	}
}
