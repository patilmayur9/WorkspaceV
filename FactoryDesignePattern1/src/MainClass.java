import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	
	System.out.println("Which class Ticket you have to book  Genral OR  Bussiness class ");
	String str=scanner.next();
	
	Booking b=BookingFactory.bookMyTicket(str);

	System.out.println(b.bookTicket());
}
}
