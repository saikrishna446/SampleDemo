package Test1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test11 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("saikrishna");
		list.add("Ashu");
		list.add("friends");
		list.set(1, "Ashwini");
		list.remove(2);
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println("The names is "+itr.next());
		}
	}

}
