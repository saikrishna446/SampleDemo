package programms;

public class SecondLargstarry {

	public static void main(String[] args) {


		int arr[] = {10,25,56,65,97,154};
		int largeset= arr[0];
		int second= arr[0];
		System.out.println("The given array is:- ");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]+ "\t");
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>largeset) {
				
				second = largeset;
				largeset= arr[i];
				
				System.out.println(largeset);
			}
			else if (arr[i]>largeset && arr[i]!=largeset) {
				
				second = arr[i];
				
			}
		}
		
		System.out.println("The secons largest array is "+second);
		
		
		
		
	}

}
