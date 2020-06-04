package programms;

public class Armstrong {

	public static void main(String[] args) {


		int c=0, a, temp;
		int num = 1634;
		temp=num;
		while(num>0) {
			
			a= num%10;
			num= num/10;
			c= c+(a*a*a*a);
			
		}
		
		if (temp==c) {
			System.out.println("Armsrong");
		} else {
			System.out.println("not aramstrong");
		}
		
		
	}

}
