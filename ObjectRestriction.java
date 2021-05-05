class Restriction{

	private static Restriction object;
	public static int objCount = 0;
	 
	private Restriction()
	{
	     System.out.println("Private constructor invoked");
	 
	     objCount  ++;
	}
	 
	public static Restriction getInstance()
	{
	 
		if (objCount < 3)
		{
		 
			object = new Restriction();
		 
		}
		 
		return object;
		 
		}
	 
	} 

public class ObjectRestriction{

	public static void main(String args[]) {
	 
		Restriction obj1= Restriction.getInstance();
		Restriction obj2= Restriction.getInstance();
		Restriction obj3= Restriction.getInstance();
		Restriction obj4= Restriction.getInstance();
		Restriction obj5= Restriction.getInstance();
	 
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());
 
}
}