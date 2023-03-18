package keywords.program;

//Representing the static variable usage in the java program:
class Student
{
	int roll_no;
	String name;
	static String College="GSKSJTI";
	
	Student(int r,String s)
	{
		roll_no = r;
		name = s;
		
	}
	public void display()
	{
		System.out.println(roll_no+ " "+name+ " "+College);
	}
}
public class StaticVariable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101," Pooja");
		s1.display();
		Student s2 = new Student(102,"Kavya");
		s2.display();

	}

}
