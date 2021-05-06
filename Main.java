package firstDutyCampJava;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý(C# + Angular)", "Engin Demiroð");
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(Java + React)", "Engin Demiroð");
	
		
		Course[] courses = {course1, course2};
		
		for(Course course : courses) {
			System.out.println(course.id);
			System.out.println(course.courseName);
			System.out.println(course.teacherName);	
		}
		
		
	}

}
