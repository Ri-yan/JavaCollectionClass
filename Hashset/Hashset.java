package CollectionPackage;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {
public static void main(String []args) {
	//duplicate elements not allowed in set
	HashSet<Integer> h = new HashSet<>();
	
	h.add(7);
	h.add(2);
	h.add(77);
	h.add(8);
	h.add(1);
	System.out.println(h);
	h.remove(77);
	System.out.println(h);
	System.out.println(h.contains(7));
	System.out.println(h.isEmpty());
	System.out.println(h.size());
	h.clear();
	System.out.println(h);
	//duplicate elements not allowed in set
	//inherit linked list properties and every element is added in order
	HashSet<Integer> Lh = new LinkedHashSet<>();
	Lh.add(7);
	Lh.add(2);
	Lh.add(77);
	Lh.add(8);
	Lh.add(1);
	System.out.println(Lh);
	Lh.remove(77);
	System.out.println(Lh);
	System.out.println(Lh.contains(7));
	System.out.println(Lh.isEmpty());
	System.out.println(Lh.size());
	Lh.clear();
	
	//implement set as tree which makes set in sorted order.
	HashSet<Integer> Th = new LinkedHashSet<>();
	Th.add(7);
	Th.add(2);
	Th.add(77);
	Th.add(8);
	Th.add(1);
	System.out.println(Th);
	Th.remove(77);
	System.out.println(Th);
	System.out.println(Th.contains(7));
	System.out.println(Th.isEmpty());
	System.out.println(Th.size());
	Th.clear();
}
}
