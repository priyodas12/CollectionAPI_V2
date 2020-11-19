package list.ArrayList;

import java.util.*;

public class SortingInArrayList {

	public static void main(String[] args) {
		Integer [] a= {12,3,14,52,31};
		List <Integer> l=new ArrayList<Integer>();
		l=Arrays.asList(a);
		System.out.println("Ascending order");
		Collections.sort(l, Comparator.naturalOrder());
		l.stream().forEach(System.out::println);
		System.out.println("Descending order");
		Collections.sort(l, Comparator.reverseOrder());
		l.stream().forEach(System.out::println);
	}

}
