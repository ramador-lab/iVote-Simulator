import java.util.*;


public class Student {
	
	private String id;
	private List<Answers>StudentAnswers = new ArrayList <Answers> ();
	private List<List<Answers>> StudentAnswers2 = new ArrayList <List<Answers>>();


	
	
	//passes in id as String once Student Object is created
	public Student(String id, List<Answers> a2, List<List<Answers>> m){
		this.id = id;
		this.StudentAnswers = a2;
		this.StudentAnswers2 = m;
	
	}
	
	
	public Student() {};
	
	
	//Student Id can be set retrieved if not set as default when Student object was created
	private void setId(String id) {
		this.id = id;
	}
		
	
	public String getId () {
		return this.id;
	}
	
	
	
	
	//Student Object Methods for Student Objects for Answer Submission both multiple and single
	public void Submit_Answer(Answers a1) {
		this.StudentAnswers.add(a1);
		System.out.println("Answer has been recorded and submitted");
		
	}
	
	public void Submit_Multiple(List<List<Answers>> a2) {
		this.StudentAnswers2 =a2;
	}
	

}
