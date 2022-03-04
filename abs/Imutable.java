package abs;

public final class Imutable {
private final String COLGNAME;
private final int fee;
public Imutable(String COLGNAME,int fee)
{
	
}

	public String getColgname() {
	return COLGNAME;
}



public int getFee() {
	return fee;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imutable i=new Imutable("nit Bhopal",300000);
		System.out.print(i.getColgname()+" "+i.getFee());

	}

}
