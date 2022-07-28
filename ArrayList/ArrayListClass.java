package CollectionPackage;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String []args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);//adds at end of list
		a.add(2);
		a.add(1,3);//adds at specific index
		System.out.println("a: "+a);
		System.out.println("size of list a.size() "+a.size());
		ArrayList<Integer> b = new ArrayList<>();
		b.add(10);
		b.add(9);
		System.out.println("b: "+b);
		a.addAll(b); //to join two list
		System.out.println("new a: "+a);
		//to get an element from an index
		System.out.println(a.get(4));
		
		//to remove from index
		a.remove(2);
		System.out.println("a: "+a);
		
		//to remove from type
		a.remove(Integer.valueOf(10));
		System.out.println("a: "+a);
		
		//to update value of a position
		System.out.println("before update a: "+a);
		a.set(1, 30);
		System.out.println("after update a: "+a);
		
		//to check if element in list it returns true false
		System.out.println("30 in a: "+a.contains(0));
		
		//looping in list
		for(int i:a) {
			System.out.println(i);
		}
		//to empty list
		a.clear();
		System.out.println("a: "+a);
	}
}
