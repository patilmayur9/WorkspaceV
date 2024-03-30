import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorMainClass {
	
	public static void main(String[] args) {
		List<Employee> list =  new ArrayList<>();
		list.add(new Employee(1, "ku"));
		list.add(new Employee(2, "mayur"));
		list.add(new Employee(3, "patil"));
		list.add(new Employee(4, "bhosale"));
		Collections.sort(list, new EmployeeComparator());
		System.out.println(list);
	}
}
