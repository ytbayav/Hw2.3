package campDay3Hw2;

public class StudentManager {
	
	public void listSuccessfullStudents(Student[] studentList) {
		
		for (Student student : studentList) {
			if(student.getNot()>30){
				System.out.println("id: " + student.getId() + "Name: " + student.getFirstName()+ "Not: "+ student.getNot());
				
			}
			
		}
		
	
		
		
	}
	
	public void listStudentsByClass(String classRoom, Student[] studentList) {
		

		for (Student student : studentList) {
			if(student.getClassRoom().equals(classRoom)){
				System.out.println("id: " + student.getId() + "Name: " + student.getFirstName());
				
			}
			
		}
		
		
		
	}

}
