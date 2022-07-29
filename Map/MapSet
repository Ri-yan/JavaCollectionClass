package CollectionPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSet {
	public static void main(String []args) {
		//Map consist of key,pairs
		//keys only unique allowed if same key value is added then it will override
		
		//HashMap
		Map<String,Integer> m =new HashMap<>();
		//put will override present value
		m.put("India", 1);
		m.put("Usa", 2);
		m.put("Russia", 3);
		m.put("India", 5);
		//add element if not already in map
		m.putIfAbsent("Brazil", 5);
		System.out.println(m);
		
		//To iterate
		
		for(Map.Entry<String,Integer> e: m.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		//Provide only key set
		System.out.println(m.keySet());
		//Provide only value set
		System.out.println(m.values());
		
		//to check or search value
		//contains Key
		System.out.println(m.containsKey("India"));
		//Contains Value
		System.out.println(m.containsValue(1));
		
		//to check empty
		System.out.println(m.isEmpty());
		
		//to remove key value pair
		System.out.println(m.remove("Brazil"));
		
		System.out.println(m);
		//to clear map
		m.clear();
		System.out.println(m);
		
		//in TreeMap elements are sorted according to keys
		//TreeMap
				Map<String,Integer> Tm =new TreeMap<>();
				//put will override present value
				Tm.put("India", 1);
				Tm.put("Usa", 2);
				Tm.put("Russia", 3);
				Tm.put("India", 4);
				//add element if not already in map
				Tm.putIfAbsent("Brazil", 5);
				System.out.println(Tm);
		
				// in LinkedHashMap items are added in the end 	
				//LinkedHashMap
				Map<String,Integer> Lm =new LinkedHashMap<>();
				//put will override present value
				Lm.put("India", 1);
				Lm.put("Usa", 2);
				Lm.put("Russia", 3);
				Lm.put("India", 5);
				//add element if not already in map
				Lm.putIfAbsent("Brazil", 5);
				System.out.println(Lm);		
				
	}
	
	
	
}
