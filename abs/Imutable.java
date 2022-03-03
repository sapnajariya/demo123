package abs;

public final class Imutable {
private static String COLGNAME="nit Bhopal";
private static int fee=300000;
public Imutable(String COLGNAME,int fee)
{
	
}

	private static String getColgname() {
	return COLGNAME;
}



private static int getFee() {
	return fee;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imutable i=new Imutable("COLGNAME",fee);
		System.out.print(i.getColgname()+" "+i.getFee());

	}

}
