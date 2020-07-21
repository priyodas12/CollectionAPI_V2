package list.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
 * Underlying DataStructure: Dynamic array
 * Implements: RandomAccess,Cloneable,Serializable
 * Initial Capacity: 10 increased capacity:(10*3/2)+1
 * Insertion order: indexed, same as inserted.
 * Space complexity: O(n)
 *
 * add() – takes O(1) time
   add(index, element) – in average runs in O(n) time
   get() – is always a constant time O(1) operation
   remove() – runs in linear O(n) time. We have to iterate the entire array to find the element qualifying for removal
   indexOf() – also runs in linear time. It iterates through the internal array and checking each element one by one. So the time complexity for this operation always requires O(n) time
   contains() – implementation is based on indexOf(). So it will also run in O(n) time
 */

public class ArrayListImpl {

	public static void main(String[] args) {
		List l=new ArrayList<Integer>();
		l.add(10);
		l.add(21);
		l.add(23);
		l.add(32);
		
		l.remove(2);
		
		l.stream().forEach(x->System.out.println(x));

	}

}
