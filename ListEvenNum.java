import java.util.*;

public class ListEvenNum {
    public static void main(String [] args){
        System.out.println("Hello");
        List<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(4);
        num.add(3);
        num.add(2);
        num.add(1);
        System.out.println(num);
        System.out.println(Even(num));
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