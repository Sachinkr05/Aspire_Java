import java.util.Scanner;

public class Choose extends viewDetails

{
	
	Scanner scanner=new Scanner(System.in);
	int choose;

	
	public void choise()
	{
	
	System.out.println("\t\t-----------Student Management System-----------\n------------------------------------------------------------------------------------\n");
	System.out.println("\t\t\t\t1.Add new Student\n\t\t\t\t2.View Sudent Details\n\t\t\t\t0:Exit");
	choose=scanner.nextInt();
	
	switch(choose)
	{
	case 1:addStudent();
		break;
		
	case 2:viewAll();
	break;
		
	case 0:System.out.println("Application Clossed");
		break;
		
	default:System.out.println("Enter a valid choice");
		break;
	}
	while(choose>0)
	{
	choise();
	}
	}

}
