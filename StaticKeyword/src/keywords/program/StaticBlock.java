package keywords.program;

class Students1
{
	int roll_no;
	String name;
	static String College;
	
	static 
	{
		College = "TNF";
	}
	Students1(int r,String s)
	{
		roll_no = r;
		name = s;
		
	}
	static void change()
	{
		College="GSKSJTI";
	}
	void display()
	{
		System.out.println(roll_no+ " "+name+ " "+College);
	}
	
}


public class StaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students1 s1 = new Students1(109," Pooja");
		Students1 s2 = new Students1(100,"Kavya");
		s1.display();
		s2.display();

	}

}
