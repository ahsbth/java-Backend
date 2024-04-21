package inheritence;

public class Multilevel2 {

	public static void main(String[] args) {
		Person person = new Person("Alice", 30);
        System.out.println("Person Information:");
        person.displayinfo();
        System.out.println();

        Student student = new Student("Bob", 20, 12345, "Computer Science");
        System.out.println("Student Information:");
        student.displayinfo();
        System.out.println();

        GraduateStudent gradStudent = new GraduateStudent("Charlie", 25, 54321, "Engineering", "Machine Learning");
        System.out.println("Graduate Student Information:");
        gradStudent.displayinfo();

	}

}
class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void displayinfo() {
		System.out.println("name:"+name);
		System.out.println("Age:"+age);
	}
}
class Student extends Person{
	int roll;
	String course;
	public Student(String name, int age, int roll, String course) {
		super(name,age);
		this.roll=roll;
		this.course=course;
	}
	public void displayinfo() {
		System.out.println("Roll number:"+roll);
		System.out.println("Course:"+course);
	}
}
class GraduateStudent extends Student{
	String thesisTopic;
	public GraduateStudent(String name, int age, int roll, String course,String thesisTopic) {
		super( name, age, roll, course);
		this.thesisTopic=thesisTopic;
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("ThesisTopic:"+thesisTopic);
	}
}
