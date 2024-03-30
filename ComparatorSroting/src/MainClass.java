import java.util.ArrayList;
import java.util.Collections;

public class MainClass 
{

	public static void main(String[] args) {
		ArrayList<Student >al = new ArrayList<>();
		al.add(new Student(15, "chintu"));
		al.add(new Student(2, "rahul"));
		al.add(new Student(3, "mahesh"));
		al.add(new Student(4, "ganesh"));
		al.add(new Student(10,  "bhagat"));
		al.add(new Student(7, "sham"));
		System.out.println("before sorting list-> "+al);
		Collections.sort(al, new ComparatorClass());
		for(Student s: al)
		{
			System.out.println(s.rollNumber+"    "+s.name);
		}
	}
}
