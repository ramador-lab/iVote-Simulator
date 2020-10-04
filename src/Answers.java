
import java.util.*;

public class Answers {
	
	public Answers() {};
	
	//Answer Choices provided to for the user
	private List <String> repository = new ArrayList<String>();
	
	//Correct Answers that will be compared to submitted answers by the user
	private String answer;

	
	
	private String user_input;

	
	
	//Will Set the answers that can be selected
	public void answer_choices (List <String> r) {
		this.repository = r;
		
	}
	 
	
	
	
	
	public void display_answer_choices () {
		if(!repository.isEmpty()) {
				
			for(int i = 0; i < repository.size(); i++) {
				System.out.println(repository.get(i));
				
			}
		}
		else {System.out.println("Error cannot find possible answers for this question");};
		
	}
	
	
	
	public void UserInput(String a) {
		this.user_input = a;
	}
	
	
	
	public String getUserInput() {
		return user_input;
	}
	
	
	
	//Correct Answers set based on question type
	public void correct(String a)
	{
		this.answer = a;
	}
	
		
	public String getAnswer() {
		return answer;
	}
	

	


}
