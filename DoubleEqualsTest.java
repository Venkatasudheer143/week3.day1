package day1.week3.assignment;

public class DoubleEqualsTest {

	
	public static void main(String[] args) {
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");
		String str5 = "Kutty";
		
		System.out.println("str3 address: "+str3.hashCode());
		System.out.println("str3 object : "+System.identityHashCode(str3));
		System.out.println("St4 address: "+str4.hashCode());
		System.out.println("Str4 object : "+System.identityHashCode(str4));
		System.out.println("Str5 address: "+str5.hashCode());
		System.out.println("Str5 Object referce: "+System.identityHashCode(str5));
		// == -> compares the object reference values but not content
		if(str3==str4) 
			System.out.println("Same Text");
		else
			System.out.println("Different Text");
		if(str3.equals(str4))
			System.out.println();
	}

}
