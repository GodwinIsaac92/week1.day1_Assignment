package week1.day1;

public class A5_Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A5_Student student = new A5_Student();

        student.studentName = "Godwin Isaac";
        student.rollNo = 75;
        student.collegeName = "TestLeaf";
        student.markScored = 85;
        student.cgpa = 3.5;
        
        System.out.println("Student Name: " + student.studentName);
        System.out.println("Roll Number: " + student.rollNo);
        System.out.println("College Name: " + student.collegeName);
        System.out.println("Marks Scored: " + student.markScored);
        System.out.println("CGPA: " + student.cgpa);
	}

}
