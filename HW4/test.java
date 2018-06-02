//import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import java.util.Scanner;

public  class test{
    public static void main(String[] arg){
        int array1 [][] = {{0,1,2,3},
                            {4,5,6,7},
                            {8,9,10,11}
                        };
        System.out.println("---->"+array1.length+" | "+ array1[0].length);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter max heart rate: ");
        double age = input.nextDouble();
    
        for(int row=0; row<3;row++){
            for(int col=0; col<4;col++){
                System.out.print(array1[row][col]+",");
                if(row==array1.length-1 && col==array1[0].length-1 ){
                    System.out.println("End");
                }
            }
            System.out.println();
        }
    }
}