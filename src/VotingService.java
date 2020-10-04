
public class VotingService  {
	
//Attributes for two question type one for multiple answers the other for single answers
private Question question_type1;


//Answer Submitted 
private Answers answer_type1;
private Answers answer_type2;


//Each method will receive each question type and display when called 

public void Display(Question q1)
{
	this.question_type1 = q1;
	System.out.println(question_type1.getQuestion());
}



public static boolean UserSingleCompare(String A, String B)
{
	System.out.println(A);
	System.out.println(B);
	if( A.equals(B)) {
		System.out.println("True");
	return true;	
	}
	System.out.println("False");
	return false;
}

public void UserMultipleChoice(Answers a2)
{
	this.answer_type2 = a2;
}

}
