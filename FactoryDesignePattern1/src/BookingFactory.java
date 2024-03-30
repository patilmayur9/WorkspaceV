
public class BookingFactory 
{
	public static Booking bookMyTicket(String abc)
	{
		if("Genral".equalsIgnoreCase(abc))
		{
			return new GenralClass();
		}
		else if("Bussiness".equalsIgnoreCase(abc))
		{
			return new BussinessClass();
		}
		else
		 
			throw new IllegalArgumentException("Invalid Choise please Enter correct Choise...");
		
	}
}
