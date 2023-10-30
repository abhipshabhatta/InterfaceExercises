package setInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public void hashing() {
		Set<String> set = new HashSet<String>();
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("apple");
		ts.add("mango");
		ts.add("orange");
		
		
		lhs.add("cat");
		lhs.add("bat");
		lhs.add("rat");
		
			System.out.println(ts.last());
		
	}
}
