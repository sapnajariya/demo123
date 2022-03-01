package abs;
import java.io.*;
public interface RichMan {
public abstract void donation();
public abstract void party();
public class BussinessMAn implements RichMan{
	public void donation()
	{
		System.out.println("help to other by donation");
		
	}
	public void party()
	{
		System.out.println("Lets enjoy Party");
	}
}
	public class Student implements RichMan{
		public void donation()
		{
			System.out.println("give saome donation");
			
		}
		public void party()
		{
			System.out.println("enjpy party");
		}
}


}
