
import java.util.Random;
import java.util.*;
import java.util.Scanner;


public class SimulationDriver {
	
	public static String random_id_generator() {
		Random rand = new Random();
		int id = rand.nextInt(100000);
		
		return Integer.toString(id);
		
	}

	public static void main(String [] args) {
		
		
		List<Student> DataBase = new ArrayList<Student>();
		
		String id1 = random_id_generator();
		List<Answers>single1 = new ArrayList <Answers>();
		List<List<Answers>>m1 = new ArrayList <List<Answers>>();
		Student student1 = new Student(id1, single1, m1);
		DataBase.add(student1);
		
		
		
		VotingService Game1 = new VotingService();
		
		
		List<Question>SingleAnswerQuestion = new ArrayList();
		List<Question>MultipleAnsawerQuestion = new ArrayList();
		List<Answers>AnswerChoices = new ArrayList();

		
		Question q1 = new Single();
		q1.setQuestion("What was the year span for World War 1?");
		SingleAnswerQuestion.add(q1);
		
		Answers answer_q1 = new Answers();
		List <String> possible_answers_one = new ArrayList <String> ();
		possible_answers_one.add("A. 1912-1914");
		possible_answers_one.add("B. 1812-1814");
		possible_answers_one.add("C. 1914-1918");
		possible_answers_one.add("D. 1912-1920");
		possible_answers_one.add("E. 1900-1914");
		
		answer_q1.answer_choices(possible_answers_one);
		AnswerChoices.add(answer_q1);
		answer_q1.correct_single("C");
		
		
		
		Question q2 = new Single();
		q2.setQuestion("What is the proper syntax for generating an int random number no greater than 1000 in Java? "
				+ "\nAssume instance of Random Class has been created as (Random rand = new Random();");
		SingleAnswerQuestion.add(q2);
		Answers answer_q2 = new Answers();
		List <String> possible_answers_two = new ArrayList <String> ();
		possible_answers_two.add("A. int rand_int1 = rand.nextInt(1000);");
		possible_answers_two.add("B. int rand_int1 = rand.Int(1000);");
		possible_answers_two.add("C. int rand_int1 = rand.Int(100000);");
		possible_answers_two.add("D. int rand_int1 = rand.nextInt(10000);");
		possible_answers_two.add("E. int rand_int1 = rand.nextDouble(1000);");
		
		answer_q2.answer_choices(possible_answers_two);
		AnswerChoices.add(answer_q2);
		
		
		
	
		for (int i = 0; i < SingleAnswerQuestion.size(); i++ )
		{
			if(i == 0) {
				
			System.out.println("\nPlease Submit Answer Choice As Capital Letter");
			};
			Game1.Display_Single(SingleAnswerQuestion.get(i));
			
			AnswerChoices.get(i).display_answer_choices();
			
			Scanner myObj = new Scanner(System.in); 
			
			System.out.println("Submit Answer: ");
			String givenAnswer = myObj.nextLine();
			Answers temp = (Answers) givenAnswer;
			student1.Submit_Answer(temp);
			System.out.println(" ");
			System.out.println("--------------------------------------------------------------------------------------");
			
			
			
		}
		
	}

}
