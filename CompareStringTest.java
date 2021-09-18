package day1.week3.assignment;

public class CompareStringTest {

	public static void main(String[] args) {
		String str1="I am Learning Java";
		String str2="I am learning java";   
		
		if(str1 == str2)
			System.out.println("==");
		else if(str1.equals(str2))
		System.out.println("equals");
		else if(str1.equalsIgnoreCase(str2))
			System.out.println("equalsIgnoreCase");
	
		//==  -> compares the object references
		//.equals() ->  compares the object content/value - considers the case sensitive letters
		//equalsIgnoreCase -> ignore the case sensitive of letters 


	}

}
