import java.util.*;

public class ListEvenNum {
    public static void main(String [] args){
        System.out.println("Testing properties for adding and iterating through array to linkedList.\n\nArray is:");
        List<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(4);
        num.add(3);
        num.add(2);
        num.add(1);
        System.out.println(num); //prints array.
        System.out.println("\nEven Array:\n"+Even(num)); //prints only the elements of return temp array which are even only.
    }

    public static List<Integer> Even (List<Integer> input){
        List<Integer> temp = new ArrayList<Integer>();
        for(int i : input){
            if(i%2 == 0){
                temp.add(i);
            }
        }
        return temp;
    }

}