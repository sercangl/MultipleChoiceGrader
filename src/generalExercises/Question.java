package generalExercises;


public class Question {
	
	
	
	//initialize     
	private int questionid;
	private String question;
	private String ��kA;
	private String ��kB;
	private String ��kC;

	
	
	
	
	
	
	
	
	
	
	// constructor
	
	public Question(int questionid, String question, String ��kA, String ��kB, String ��kC) {
		super();
		this.questionid = questionid;
		this.question = question;
		this.��kA = ��kA;
		this.��kB = ��kB;
		this.��kC = ��kC;
	
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
	public String get��kA() {
		return ��kA;
	}
	public void set��kA(String ��kA) {
		this.��kA = ��kA;
	}
	public String get��kB() {
		return ��kB;
	}
	public void set��kB(String ��kB) {
		this.��kB = ��kB;
	}
	public String get��kC() {
		return ��kC;
	}
	public void set��kC(String ��kC) {
		this.��kC = ��kC;
	}

	
	// toString
	@Override
	public String toString() {
		return "Question [questionid=" + questionid + ", question=" + question + ", ��kA=" + ��kA + ", ��kB=" + ��kB
				+ ", ��kC=" + ��kC + "]";
	}
}
