package firstDutyCampJava;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + Angular)", "Engin Demiro�");
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java + React)", "Engin Demiro�");
	
		
		Course[] courses = {course1, course2};
		
		for(Course course : courses) {
			System.out.println(course.id);
			System.out.println(course.courseName);
			System.out.println(course.teacherName);	
		}
		
		
	}

}
