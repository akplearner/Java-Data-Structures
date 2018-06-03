import java.io.*;
import java.util.*;

public class HW2 {
   
   // Prints a list of words that appear in both files.
   public static void intersection(String filename1, String filename2) {
      try (Scanner in1 = new Scanner(new FileReader(filename1));
            Scanner in2 = new Scanner(new FileReader(filename2))) {
// Fill in.
            System.out.println("------------");
           Set<String> set1 = new HashSet<>();
           Set<String> set2 = new HashSet<>();
            //adding data to sets
            while (in1.hasNextLine() ) {
                  String line1= in1.nextLine();
                  set1.add(line1);
            //1999      System.out.println(line1 + set1.size() + set1.contains("lady"));   
	      }
            
            while (in2.hasNextLine() ) {
                  String line2= in2.nextLine();
                  set2.add(line2);
            //1862      System.out.println(line2 + set2.size() + set2.contains("royale"));
	      }
            
            //finding biggest set for iteration
            Set<String> bigSet;
            Set<String> smallSet;
            if(set1.size()>set2.size()){
                  bigSet = set1;
                  smallSet = set2;
            }else{
                  bigSet = set2;
                  smallSet = set1;
            }

            //printing compared strings
            int count = 0;
            for(String i: smallSet){ //1862
                  if(bigSet.contains(i) ){
                        System.out.println( i + " "+ ++count); // 88/94
                  }
            }

            System.out.println("------------");
            
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   }  
   
   // Prints all words in the file that occur at least k times
   // (print the word followed by the number of occurrences in parentheses).
   // Each line in the file contains only one word.
   public static void frequentWords(String filename, int k) {
      try (Scanner in = new Scanner(new FileReader(filename))) {
// Fill in.
            System.out.println("------------");
            Map< String, Integer > map = new HashMap<>();
            while (in.hasNextLine() ) {
                  String line= in.nextLine();
                  //String sortLine = sortString(line);
                  if(!map.containsKey(line) ){
                        map.put(line,1);
                  }else{
                        int i= map.get(line);
                        map.put(line,++i);
                  }
            }
            int count =0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                  //if( entrySet.getValue ==2 ){
                        if(entry.getValue() >= 2 ){
                              count++;
                              System.out.println(entry.getKey() + "  (" + entry.getValue() + ") ");
                        }
                  //}
            }
            System.out.println("\n{Count = "+count+"}");
            System.out.println("------------");
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   }
   
   // Returns the string with the characters sorted alphabetically.
   private static String sortString(String s) {
      char[] array = s.toCharArray();
      Arrays.sort(array);
      return new String(array);
   }
   
   // Prints all sets of anagrams, one set per line.
   // Each line in the file contains only one word.
   public static void anagrams(String filename) {
      try (Scanner in = new Scanner(new FileReader(filename))) {
// Fill in.
            System.out.println("------------");
            Map<String, Set<String> > map = new HashMap<>();
            while( in.hasNextLine() ){
                  String line = in.nextLine();
                  String lineSorted = sortString(line);
                  HashSet<String> set = new HashSet<String>();
                  if ( !map.containsKey(lineSorted) ){
                        map.put(lineSorted, new HashSet<String>()); 
                        map.get(lineSorted).add(line);
                        //System.out.println( "if: "+lineSorted +" =" + map.get(lineSorted) );
                  }
                  else{
                        map.get(lineSorted).add(line);
                        if( map.get(lineSorted).size() == 2 ) {
                              System.out.println( /*"else: "+ */lineSorted +" =" + map.get(lineSorted) );
                        }
                  }
            }
            System.out.println("------------");
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      intersection("english_words.txt", "french_words.txt");
      frequentWords("english_words.txt", 2);
      anagrams("english_words.txt");
   }
}