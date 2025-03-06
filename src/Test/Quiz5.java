package Test;

public class Quiz5 {

	public static void main(String[] args) {
		Student student = new Student(1001, "둘리");
		Student student2 = new Student(1002, "또치");
		Student student3 = new Student(1003, "도우너");
		
		System.out.println("Student [ studentId=" + student.studentHakbun + "," +"studentName=" + student.studentName + "]" );
		System.out.println("Student [ studentId=" + student2.studentHakbun + "," +"studentName=" + student2.studentName + "]" );
		System.out.println("Student [ studentId=" + student3.studentHakbun + "," +"studentName=" + student3.studentName + "]" );

	}

}

class Student{
	int studentHakbun;
	String studentName;
	public Student(int studentHakbun, String studentName) {
		super();
		this.studentHakbun = studentHakbun;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentHakbun=" + studentHakbun + ", studentName=" + studentName + "]";
	}
	
}