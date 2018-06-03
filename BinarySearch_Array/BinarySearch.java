import java.util.Scanner;

public class BinarySearch {

   public static void main(String[] args) {
      int[] array = {3, 7, 11, 23, 25, 31, 39, 43, 47};

      System.out.println("Please enter number: ");
      Scanner input = new Scanner(System.in);
      try{
            int num = input.nextInt();
            System.out.println("Index is found on = ");
            if(binarySearch(array, num)==-1){
                  //System.out.println("not in array");
                  throw new NumNotInArray();
            }
            System.out.println(binarySearch(array, num));
            System.out.println(binarySearchRecursive(array, num, 0, array.length-1));
            
      }
      catch(NumNotInArray e){
            System.out.println("Catch - Not in array");
      }
}
   
   // Returns the key's index if found.  Otherwise returns -1.
   public static int binarySearch(int[] a, int key) {
      int low = 0, high = a.length - 1;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         int midVal = a[mid];
         if (key < midVal) // key is in left half (eliminate right half)
            high = mid - 1;
         else if (key > midVal) // key is in right half (eliminate left half)
            low = mid + 1;
         else
            return mid; // key found
      }
      return -1; // key not found
   }
   
   // Returns the key's index if found.  Otherwise returns -1.
   public static int binarySearchRecursive(int[] a, int key, int low, int high) {
      if (low > high)
         return -1; // key not found
      int mid = low + (high - low) / 2;
      int midVal = a[mid];
      if (key < midVal) // key is in left half (eliminate right half)
         return binarySearchRecursive(a, key, low, mid-1);
      else if (key > midVal) // key is in right half (eliminate left half)
         return binarySearchRecursive(a, key, mid+1, high);
      else
         return mid; // key found
   }
}