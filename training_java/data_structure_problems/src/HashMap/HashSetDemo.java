package HashMap;

import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.sun.source.tree.Tree;

enum Size{
	SMALL, MEDIUM, LARGE;
}

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> name = new HashSet<>();
		
		Integer[] intV = {1,2,23,4};
		name.add(1);
		name.add(2);
		name.add(3);
		
		name.addAll(name);
		System.out.println(name);
		
		EnumSet<Size> ename = EnumSet.allOf(Size.class);
		ename.removeAll(ename);
		
		Set<Integer> nameL = new LinkedHashSet(ename);
		
		nameL.add(1);
		nameL.add(2);
		nameL.add(1);
		
		System.out.println(nameL);
		
		SortedSet<Integer> nameT = new TreeSet(ename);
		nameT.add(13);
		nameT.add(32);
		nameT.add(3);
		nameT.add(1);
		nameT.add(2);
		nameT.add(1);
		
		System.out.println(nameT.headSet(32));
		System.out.println(nameT.tailSet(3));
		System.out.println(nameT.remove(2));
		System.out.println(nameT.subSet(1, 32));
	
		TreeSet<Integer> nameNS = new TreeSet(ename);
		nameNS.add(13);
		nameNS.add(32);
		nameNS.add(3);
		nameNS.add(1);
		nameNS.add(2);
		nameNS.add(1);
		
		System.out.println(nameNS);
		System.out.println(nameNS.descendingSet());
		System.out.println(nameNS.descendingIterator());
		
		Iterator<Integer> itr = nameNS.descendingIterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		System.out.println(nameNS.higher(3));
		
		TreeSet<String> nameTS = new TreeSet<String>();
		nameTS.add("B");
		nameTS.add("B");
		nameTS.add("A");
		nameTS.add("");
		System.out.println(nameTS);
		
		Iterator<String> itrN = nameTS.iterator();
		while(itrN.hasNext()) {
			System.out.println(itrN.next().hashCode());
		}
		
		// Creating a tree set with customized comparator
        TreeSet<String> animals = new TreeSet<>(new CustomComparator());

        animals.add("Dog");
        animals.add("Zebra");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("TreeSet: " + animals);
	}

	
	// Creating a comparator class
    public static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String animal1, String animal2) {
            int value =  animal1.compareTo(animal2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
	
	
}