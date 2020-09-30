
public class VotingService  {
	
//Attributes for two question type one for multiple answers the other for single answers
private Single question_type1;
private Multiple question_type2;


//Answer Submitted 
private Answers answer_type1;
private Answers answer_type2;


//Each method will receive each question type and display when called 

public void Display_Single(Question q1)
{
	this.question_type1 = (Single)q1;
	System.out.println(question_type1.getQuestion());
}

public void Display_Multiple(Multiple q2)
{
	this.question_type2 = q2;
	System.out.println(question_type2);
}


public static boolean UserSingleCompare(String A, String B)
{
	return A.charAt(0) == B.charAt(0);
}

public void UserMultipleChoice(Answers a2)
{
	this.answer_type2 = a2;
}

}
