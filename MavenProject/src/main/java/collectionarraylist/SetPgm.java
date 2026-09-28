package collectionarraylist;

import java.util.HashSet;
import java.util.Set;

public class SetPgm {

	public static void main(String[] args) {
		
		Set<String>fruits=new HashSet<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Orange");  //duplicate value is not printed
		
		
		System.out.println(fruits);
		
		//remove()
		fruits.remove("Mango");
		System.out.println(fruits);
		
		//contains
		
		System.out.println(fruits.contains("Orange"));
		
		//size
		
		System.out.println(fruits.size());
		
		//isEmpty
		System.out.println(fruits.isEmpty());
		
		//clear
		fruits.clear();
		System.out.println(fruits);
		

	}

}
