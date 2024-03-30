import java.util.Comparator;

public class ComparatorClass implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		if(arg0.rollNumber > arg1.rollNumber)
		{
		return 1;////if you put -1 here then list is sorted as 5,4,3,2,1...
		}
		else if(arg0.rollNumber  < arg1.rollNumber)
		{
			return -1;//if you put -1 here then list is sorted as 1,2,3,4,5...
		}
		else {
			return 0;
		}
		
//		return arg0.name.compareTo(arg1.name);//put negative  sign to start of return statement for descending order sorting z,y,x...
		
	}

}
