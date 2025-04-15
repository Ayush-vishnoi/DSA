package Questions.Hashing;
import java.util.*;
public class hashmap {
    public static void main(String[] args){

        // Declaration of HashMap
        HashMap<String,Integer> map=new HashMap<>();
        // Insertion of elements
        map.put("Apple",10);
        map.put("Banana",20);
        map.put("Cherry",30);
        map.put("Date",40);
        // printing of elements
        System.out.println(map);

        // update of values
        map.put("Apple",50);    // if key is already present then it will update the value else it will add new key-value pair
        System.out.println(map);

        // deletion of elements
        map.remove("Banana");
        System.out.println(map);

        // searching of key 
        System.out.println(map.containsKey("Apple"));  // returns true if key is present else false

        // to get the value of the key 
        System.out.println(map.get("Banana"));   // if not exist then print "null"

        // to get the size of the map
        System.out.println("Size: "+map.size());
        
        // Travesal of map(Iteration using for-each loop)
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
