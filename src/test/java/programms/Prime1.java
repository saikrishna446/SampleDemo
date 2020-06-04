package programms;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {


		int num, temp;
		boolean Isprime =true;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
		for (int i = 2; i<=num%2; i++) {
			
			temp= num%i;
			if (temp==0) {
				Isprime = false;
				break;
			}
			
		}
		
		if (Isprime) {
			
			System.out.println("Is a Prime nnumber");
		}
		else {
			System.out.println("Is not a prime number");
		}
	}

}
