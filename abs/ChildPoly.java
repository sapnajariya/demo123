package abs;

public class ChildPoly extends ExmPoly {
	public int m1(double balance,int pinnm)
	{
		
		pinnum=pinnm;
		return pinnum;
		
	}
	public String m2(String add,String Name)
	{
		address=add;
		return address;
		
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
ExmPoly e=new ExmPoly();
//static polymrphism
ExmPoly cp=new ChildPoly();
ChildPoly c=new ChildPoly();
System.out.println(cp.m1(23457));
System.out.println(cp.m2("Indore"));
System.out.println(e.m1(45678));
System.out.print(c.m2("sapnA","Mhow"));
	}

}
