

public class viewDetails extends CollectDetails implements Viewable
{

//	LinkedHashSet <Student> studentCollection=new LinkedHashSet <Student>();
	@Override
	public void viewAll()
	{
		
		for(Student stu:studentCollection)
		{
			System.out.println(stu+"\n");
		
		}
	}
	
}