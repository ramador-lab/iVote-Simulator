
import java.util.*;

public class Answers {
	//Answer Choices provided to for the user
	private List <String> repository = new ArrayList<String>();
	
	//Correct Answers that will be compared to submitted answers by the user
	private String answer_single;
	private List <String> answer_multiple = new ArrayList<String>();
	
	
	private String user_single;
	private List <String> user_multiple = new ArrayList<String>();
	
	
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
	
	
	//Correct Answers set based on question type
	public void correct_single(String a)
	{
		this.answer_single = a;
	}
	
	
	public void correct_multiple(List<String> a2)
	{
		this.answer_multiple = a2;
	}
	


}
