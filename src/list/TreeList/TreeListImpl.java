package list.TreeList;
import org.apache.commons.collections4.list.TreeList;
/*
* A List implementation that is optimised for fast insertions and removals at any index in the list.
* This list implementation utilises a tree structure internally to ensure that all insertions and removals are O(log n).
* This provides much faster performance than both an ArrayList and a LinkedList where elements are inserted and removed repeatedly from anywhere in the list.
*
*               get  add  insert  iterate  remove
 TreeList       3    5       1       2       1
 ArrayList      1    1      40       1      40
 LinkedList  5800    1     350       2     325
 */
public class TreeListImpl {
    public static void main(String[] args) {
        TreeList treeList=new TreeList();

        treeList.add(12);
        treeList.add(42);
        treeList.add(19);

        treeList.forEach(System.out::println);

    }
}
