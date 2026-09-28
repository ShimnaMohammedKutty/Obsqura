package collectionarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPgm {

	public static void main(String[] args) {

		ArrayList<Integer> num=new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		
		System.out.println(num);
		
		Iterator<Integer> it= num.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
