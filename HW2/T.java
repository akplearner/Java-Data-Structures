import java.util.*;

public class T{
    public static void main(String[] args){
        //fast methods
        //Set<Integer> set = new TreeSet<>(); //order with O(log n) average
        Set<Integer> set = new HashSet<>(); //prints unorder with O(1) average 
        
        
        //add and remove
        set.add(3); //size is 1
        set.add(3); //does not allow duplicates in sets
        set.remove(3); //removes 3 from set, therefor size is 0 now
        set.remove(4); //will not thow exception, will not do anything
        System.out.println("Size: "+set.size());

        //contains
        System.out.println("boolean contains: "+set.contains(4));
        System.out.println("boolean contains: "+set.contains(3));
        
        //iterations 
        set.add(3);
        set.add(238);
        set.add(554);
        set.add(123);

        for(int i: set){
            System.out.println(i);
        }

        //method comparable
        /*
        Integer a=3;
        Integer b=5;
        a.compareTo(b);
        returns negative number if a<b
        returns 0 if a==b   
        returns positive number if a>b 
        */
        
        List<Integer> list = new ArrayList<>(10);
        list.add(3);
        list.add(4);
        list.add(4);
        Set<Integer> set2 = new TreeSet<>();
          for(list: set2){
            System.out.println(list);
        }

        
    }
}