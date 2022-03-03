package abs;

public class Student  extends BussinessMan implements RichMan{
	public void donation()
	{
		System.out.println("give saome donation");
		
	}
	public void party()
	{
		System.out.println("enjpy party");
	}
	public static void main(String[] args) {
//dynamic polymorphism	
BussinessMan b=new Student();
b.donation();
// data abtraction
Student s=new Student();
s.party();

	}

}
