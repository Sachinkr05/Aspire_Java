//Implementation class



import java.util.LinkedHashSet;
import java.util.Scanner;

public class CollectDetails implements Collectable
{

	String studentId,studentName,course,emailid,address1,address2;
	String phone;
	
	LinkedHashSet <Student> studentCollection=new LinkedHashSet <Student>();
	
	
	Scanner scanner=new Scanner(System.in);

	public void addStudent() 
	{
		
		System.out.println("Enter Student Id: ");
		studentId=scanner.next();
		
		System.out.println("Enter Student Name: ");
		scanner.nextLine();
		studentName=scanner.nextLine();
		
		System.out.println("Enter course: ");
		course=scanner.nextLine();
		
		System.out.println("Enter the Email ID:");
		emailid=scanner.next();
		
		System.out.println("Enter current Address:");
		scanner.nextLine();
		address1=scanner.nextLine();
		
		System.out.println("Enter permenent Address:");
		address2=scanner.nextLine();
		
		
		System.out.println("Enter the phone number:");
		phone=scanner.next();
		
		
		
		Student student=new Student(studentId, studentName, course,emailid,address1,address2,phone);
		
		studentCollection.add(student);
	
		
		
		
	}

	
	

}
	
