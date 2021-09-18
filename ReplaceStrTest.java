package day1.week3.assignment;

public class ReplaceStrTest {

	public static void main(String[] args) {
		String sentence = "I am working with Java8";
		/*
		 * replace 8 to 11 
		 * Print the characters from 5 to 14
		 */
		String replaced=sentence.replace("8", "11");
		System.out.println("Replaced: "+replaced);
		System.out.println("Length: "+sentence.length());
		String subString = sentence.substring(5, 13);
		System.out.println("sub string from 5 to 14: "+subString);


	}


}
