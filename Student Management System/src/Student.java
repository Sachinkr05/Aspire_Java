

//entity class


public class Student
{

//	-----Variables-------
	
	private String studentId,studentName,course,emailid,address1,address2;
	private String phone;
	
	
//	----------Getters And Setters--------

	public String getstudentId() {
		return studentId;
	}

	public void setstudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getstudentName() {
		return studentName;
	}

	public void setstudnetName(String studentName) {
		this.studentName = studentName;
	}

	public String getcourse() {
		return course;
	}

	public void setcourse(String course) {
		this.course = course;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	public String getPhone() {
		return  phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

//	-------ToString for display purpose--------
	
	@Override
	
	public String toString()
	{
		return "Student Id:"+ studentId+"\n"
				+"student Nmae:"+ studentName+"\n"
				+"course:"+ course+"\n"
				+"Email ID:"+ emailid +"\n"
				+"Address:"+ address1 +"\n"
				+"Permenent Address:"+ address2 +"\n"
				+"Mobile :" + phone +"\n"
				
				;
		
	}
	
	
	
//	---------constructor--------
	
	public Student(String studentId,String studentName,String course,String emailid,String address1,String address2,String phone)
	{
		super();
		
		this.studentId=studentId;
		this.studentName=studentName;
		this.course=course;
		this.emailid=emailid;
		this.address1=address1;
		this.address2=address2;
		this.phone=phone;
		
		
		
	}

	

	
	
	
	
	
	
	
	
	
	
	
}
