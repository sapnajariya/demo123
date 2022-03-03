package abs;

public class Person {
private String firstName;
private String lastName;
String result;
Person(String fname, String lname)
{
	firstName =fname;
	lastName=lname;
}
public String toString()
{

 result=firstName+lastName;
return result;
}
}

