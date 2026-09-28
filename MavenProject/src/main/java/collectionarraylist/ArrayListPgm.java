package collectionarraylist;

import java.util.ArrayList;

public class ArrayListPgm {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<>();
		
		names.add("Anu");
		names.add("Manu");
		names.add("Sangeetha");
		names.add("Asna");
		
		//add()
		names.add("Sinu");
		System.out.println(names);
		
		//add(index,element)
		names.add(2, "Anju");
		System.out.println(names);
		
		//get()
		System.out.println(names.get(3));
		
		//set()
		names.set(2, "Rani");
		System.out.println(names);
		
		//remove()
		names.remove(2);
		System.out.println(names);
		
		//contains()
		System.out.println(names.contains("Anu"));
		
		//size()
		System.out.println(names.size());
		
		//isEmpty()
		System.out.println(names.isEmpty());
		
		//clear()
		/*names.clear();
		System.out.println(names);*/
		
		//for iterartion
		//for loop
		
		/*for (int i=0;i<names.size();i++) {
			
			System.out.println(names.get(i));
			
		}*/
		
		//for each
		
		for(String j:names) {
			
			System.out.println(j);
		}
		
		
		
		
		

	}

}
