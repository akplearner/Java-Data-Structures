import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class Timer{
    public static void main(String[] args){
        long start,end;
        
        List<Integer> arrayList = new ArrayList<>(); // slower data structure
        start = System.currentTimeMillis();
        for(int i = 0; i < 10000000; ++i){
                arrayList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("arrayList: "+(end-start)/1000.0);

        List<Integer> linkedList = new LinkedList<>(); //faster data structure
        start = System.currentTimeMillis();
        for(int i = 0; i < 10000000; i++){
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinekedList: "+(end-start)/1000.0);
        
        //System.out.println(System.currentTimeMillis()/1000/60/60/24/365);//yr
    }   
}