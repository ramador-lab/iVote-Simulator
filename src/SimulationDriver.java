
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
		
		
		List<Question>Questions = new ArrayList();
		List<Answers>AnswerChoices = new ArrayList();

		
		Question q1 = new Single();
		q1.setQuestion("What was the year span for World War 1?");
		Questions.add(q1);
		
		Answers answer_q1 = new Answers();
		List <String> possible_answers_one = new ArrayList <String> ();
		possible_answers_one.add("A. 1912-1914");
		possible_answers_one.add("B. 1812-1814");
		possible_answers_one.add("C. 1914-1918");
		possible_answers_one.add("D. 1912-1920");
		possible_answers_one.add("E. 1900-1914");
		
		answer_q1.answer_choices(possible_answers_one);
		AnswerChoices.add(answer_q1);
		answer_q1.correct("C");
		
		
		
		Question q2 = new Single();
		q2.setQuestion("What is the proper syntax for generating an int random number no greater than 1000 in Java? "
				+ "\nAssume instance of Random Class has been created as (Random rand = new Random();");
		Questions.add(q2);
		Answers answer_q2 = new Answers();
		List <String> possible_answers_two = new ArrayList <String> ();
		possible_answers_two.add("A. int rand_int1 = rand.nextInt(1000);");
		possible_answers_two.add("B. int rand_int1 = rand.Int(1000);");
		possible_answers_two.add("C. int rand_int1 = rand.Int(100000);");
		possible_answers_two.add("D. int rand_int1 = rand.nextInt(10000);");
		possible_answers_two.add("E. int rand_int1 = rand.nextDouble(1000);");
		
		answer_q2.answer_choices(possible_answers_two);
		AnswerChoices.add(answer_q2);
		answer_q2.correct("A");
		
		
		
		Question q3 = new Multiple();
		q1.setQuestion("How are you feeling right now?");
		Questions.add(q3);
		
		Answers answer_q3 = new Answers();
		List <String> possible_answers_three = new ArrayList <String> ();
		possible_answers_three.add("A. Happy");
		possible_answers_three.add("B. Glad");
		possible_answers_three.add("C. Motivated");
		possible_answers_three.add("D. Tired");
		possible_answers_three.add("E. Sad");
		
		answer_q3.answer_choices(possible_answers_three);
		AnswerChoices.add(answer_q3);
		
		
		
		
		Question q4 = new Multiple();
		q4.setQuestion("What is your favoeite Food?");
		Questions.add(q4);
		Answers answer_q4 = new Answers();
		List <String> possible_answers_four = new ArrayList <String> ();
		possible_answers_four.add("A. Pizza");
		possible_answers_four.add("B. Hamburger");
		possible_answers_four.add("C. Ice Cream");
		possible_answers_four.add("D. Sandwich");
		possible_answers_four.add("E. Other");
		
		
		answer_q4.answer_choices(possible_answers_four);
		AnswerChoices.add(answer_q4);
		answer_q4.correct("A");
		
		
		int CorrectAnswers = 0;
		int Total = Questions.size() + Questions.size();
		int i = 0;
	
		for ( i = 0; i < Questions.size(); i++ )
		{
			if(i == 0) {
			
			System.out.println("Student: ");
			student1.DisplayId();
				
			System.out.println("--------------------------------------------------------------------------------------");	
				
			System.out.println("\nPlease Submit Answer Choice As Capital Letter");
			
			
			};
			Game1.Display(Questions.get(i));
			
			AnswerChoices.get(i).display_answer_choices();
			
			Scanner myObj = new Scanner(System.in); 
			
			System.out.println("Submit Answer: ");
			String givenAnswer = myObj.nextLine();
		
			Answers temp = new Answers();
			temp.UserInput(givenAnswer);
			student1.Submit_Answer(temp);
			boolean test = Game1.UserSingleCompare(temp.getUserInput(),AnswerChoices.get(i).getAnswer());
		
			
			if(test == true)
			{
				CorrectAnswers++;
				System.out.println("Correct!");
				System.out.println("");
			}
			else {
				System.out.println("Incorrect");
			}
			
			System.out.println(" ");
			System.out.println("--------------------------------------------------------------------------------------");
			
			
			
		}
		

		
		
		
		double score = (CorrectAnswers/Total)*100;
		
		System.out.println("Score: " + score + "%");
		
	}

}
