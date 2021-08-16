package campDay3Hw2;

public class Main {

	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		
		Student student1 = new Student();
		student1.setFirstName("Taha");
		student1.setId(10);
		student1.setNot(60);
		student1.setClassRoom("A");
		
		Student student2 = new Student();
		student2.setFirstName("Megmet");
		student2.setId(15);
		student2.setNot(40);
		student2.setClassRoom("B");
		
		Student student3 = new Student();
		student3.setFirstName("Anil");
		student3.setId(20);
		student3.setNot(60);
		student3.setClassRoom("A");
		
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		
		StudentManager stdmng = new StudentManager();
		stdmng.listSuccessfullStudents(students);
		stdmng.listStudentsByClass("B", students);
	
		UserManager usmng = new UserManager();
		usmng.add(student1);
		
		Instructor ins = new Instructor();
		ins.getExperience();
		
	}

}
