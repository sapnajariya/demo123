package abs;

public class PChild extends Parent {
	public static void add()
	{
		System.out.println("I am child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		p.add();
		PChild pc=new PChild();
		pc.add();
		Parent p1=new PChild();
		p1.add();

	}

}
