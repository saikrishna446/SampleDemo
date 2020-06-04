package programms;

public class Palindrome {

	public static void main(String[] args) {


		String str= "amma";
		String reverse = "";
		char Char[] = str.toCharArray();
		for (int i =Char.length-1; i>=0; i--) {
			
			reverse = reverse+Char[i];
			System.out.println(reverse);
			
		}
		
		
		if (reverse.equals(str)) {
			System.out.println("is a palidrome");
		} else {

			System.out.println("is not a palidrome");
		}
		
	}

}
