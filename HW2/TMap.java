import java.util.*;

public class TMap{
    public static void main(String[] args){
       Map<Integer, String> map = new HashMap<>(); //two types only where 1st is key and 2nd is value
       map.put(34,"hello");
       map.put(37,"hello");
       map.put(34,"goodbye");
       System.out.println(map.size());
       System.out.println(map);

       //get method to find value associated with key
       System.out.println(map.get(34)); 
       System.out.println(map.containsKey(34));

        //containsKey
       System.out.println(map.containsKey(32));   

        //remove
        map.remove(34);
       System.out.println(map);

        map.put(123,"New One");
        //cant use for(each) to iterate throug map
        for(Map.Entry<Integer,String> i : map.entrySet()){
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }
        
    }
}