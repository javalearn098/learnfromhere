package university.admin;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		ArrayList<String> nameList = new ArrayList<>();
		
		ArrayList<String> nameListtest = new ArrayList<>();

		nameList.add("Kalyan");
		nameList.add("Shankar");
		nameList.add("Satya");
		nameList.add("Hema");
		nameList.add("Hemanth");
		
		
		//isEmpty()
		boolean empty = nameList.isEmpty();
		
		System.out.println(empty);
		
		boolean empty2 = nameListtest.isEmpty();
		
		System.out.println(empty2);
		
		
		
		
		
		//remove()
		System.out.println("BEFORE REMOVE");
		System.out.println(nameList);
		nameList.remove(3);
		System.out.println("AFTER REMOVE");
		System.out.println(nameList);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//CLEAR()
		System.out.println("BEFORE CLEARING.......");
		System.out.println(nameList);
		nameList.clear();
		System.out.println("AFTER CLEARING.......");
		System.out.println(nameList);
		
	}
}
