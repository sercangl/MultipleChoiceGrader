package generalExercises;

import java.util.ArrayList;

public class questionRecordTest {

	public static void main(String[] args) {
		
		ArrayList<Question> questions = new ArrayList<Question>();
		
		questionRecord  quest = new questionRecord();
		
		quest.setPath("question.txt");
		
		quest.openFileToRead();
		quest.displayQuestionRecordsFromFile();
		quest.searchQuestion(003);
		quest.closeAfterRead();

	}

}
