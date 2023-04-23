package week1.day1;

public class Student {
    String studName ="Ramya Mageshwaran";
	int rollNo = 15643;
	String collegeName ="Madras University";
	int markScore=90;
	float cgpa=9.2f;
			
			
	public static void main(String[] args) {
		Student std=new Student();
		System.out.println("STUDENT DETAILS");
		System.out.print("STUDENT NAME        :");
		System.out.print(std.studName);
		System.out.println();
		System.out.print("STUDENT ROLL NO     :");
		System.out.print(std.rollNo);
		System.out.println();
		System.out.print("STUDENT COLLEGE NAME:");
	    System.out.print(std.collegeName);
	    System.out.println();
	    System.out.print("STUDENT MARK SCORE  :");
	    System.out.print(std.markScore);
	    System.out.println();
	    System.out.print("STUDENT CGPA        :");
	    System.out.print(std.cgpa);
	    
		 

	}

}
