package week1.day1;

public class student
{

		String name = "vijay";
		int rollNo = 5678;
		
	public void collegeName(String collegeName) 
	{
		
		System.out.println("collegeName:" +collegeName);
		
	}
	public void collegeaddress(String address) 
	{
		
		System.out.println("collegeaddress:" +address);
		
	}
		public static void main(String[] args) 
		{
			
			student std = new student();
			System.out.println("Student Name:" + std.name);
			std.collegeName("Anna University");
			std.collegeaddress("chennai");
			std.collegeName("BE");

		}

	}
