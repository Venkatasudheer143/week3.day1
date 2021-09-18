package day1.week3.assignment;

public class IndexOfAString {

	public static void main(String[] args) {
		String text = "Java Exercise" ;
		// output ->Index for character E and s 
		
		int strLength =  text.length();
		System.out.println("text length: "+strLength);
		int EIndex = text.indexOf("E");
		System.out.println("E Index: "+EIndex);
		
		int sIndex = text.indexOf("s");
		System.out.println("s index: "+sIndex);
		

	}

}
