package Questions.Hashing;
import java.util.*;
public class hashset {
    public static void main (String[] args) {
        // Creating a HashSet
        HashSet<Integer> set =new HashSet<>();
        // Adding elements to the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);
        System.out.println("size :"+set.size());  // to find the size of set
        System.out.println(set);         // to print the set
        set.remove(4);
        System.out.println(set);         // to print the set after removing an element

        // Iterator for traversal
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {    // to check if the set has more elements
            System.out.println(it.next());
        }                   
                            // set initaize with 1,2,3
    }                       // set=>Null-->1-->2-->3
}                           // next is used to get the next element from the set
