package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class CollectionsAlgo {

	public static void sortAlgo() {
		// Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        // Using the sort() method
        Collections.sort(numbers);
        
        Collections.sort(numbers, new CollectionsAlgo.sortByNo());
        System.out.println("Sorted ArrayList: " + numbers);
	}
	
	static class sortByNo implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
				if(o1 < o2) {
					return 1;
				}else {
					return -1;
				}
		}
		
	}
	
	public static void disjointD() {
		// Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList1: " + numbers);

        int count = Collections.frequency(numbers, 2);
        System.out.println("Count of 2: " + count);

        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(5);
        newNumbers.add(6);
//        newNumbers.add(3); if two collection contain common then disjoint will return false;
        System.out.println("ArrayList2: " + newNumbers);

        boolean value = Collections.disjoint(numbers, newNumbers);
        System.out.println("Two lists are disjoint: " + value);
	}
	
	public static void listIter() {
		// Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(9);
        numbers.add(5);
        numbers.add(4);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();

        // Using the next() method
        int number1 = iterate.next();
        int number2 = iterate.next();
        System.out.println("Next Element: " + number1);
        System.out.println("Next Element: " + number2);
        System.out.println(numbers);
        // Using the nextIndex()
        int index1 = iterate.nextIndex();
        System.out.println("Position of Next Element: " + index1);

        // Using the hasNext() method
        System.out.println("Is there any next element? " + iterate.hasNext());
	}
	
	public static void prevIter() {
		// Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(9);
        numbers.add(5);
        numbers.add(4);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();

        iterate.next();
        iterate.next();
        iterate.next();

        // Using the previous() method
        int number1 = iterate.previous();
        System.out.println("Previous Element: " + number1);

        // Using the previousIndex()
        int index1 = iterate.previousIndex();
        System.out.println("Position of the Previous element: " + index1);
	}
	
	public static void main(String[] args) {
		sortAlgo();
//		disjointD();
//		listIter();
//		prevIter();
	}
	
}