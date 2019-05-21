package Day39;

public class School {
public static void main(String[] args) {
	Student student=new Student();
	student.name="Roman";
	student.age=25;
	student.subject="Java";
	
	System.out.println("Name: "+student.name);
	System.out.println("Age: "+student.age);
	System.out.println("Subject: "+student.subject);
	
	
	Student student2=new Student();
	System.out.println(student2.name);
	student2.name="Cleetus";
	student2.age=33;
	student.subject="Selenium";
	
	System.out.println("Name: "+student.name);
	System.out.println("Age: "+student.age);
	System.out.println("Subject: "+student.subject);
	
	System.out.println(student.name);
}
}
