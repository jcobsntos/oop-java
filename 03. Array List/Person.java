package collections.list.set;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Person {
	public Set<String> nameInput(List<String> name) {
		Set<String> set  = new TreeSet<String>(name);
		Iterator<String> itr = set.iterator();
        	while(itr.hasNext()) {
        		System.out.println(itr.next());
        	}
        	return set;
		}
}
