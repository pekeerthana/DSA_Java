import java.util.*;

public class HashSets {

  public static void main(String[] args) {
    
    HashSet<Integer> set = new HashSet<>();

    set.add(1);
    set.add(-11);
    set.add(10);
    set.add(1);
    set.add(20);

    System.out.println(set);

    System.out.println(set.contains(10));
    System.out.println(set.remove(1));
    System.out.println(set.remove(2));
    System.out.println(set.contains(1));

    getFirstRepeating("abcdefkek");

  }

  public static void getFirstRepeating(String input){

    char[] chars = input.toCharArray();
    HashSet<Character> rSet = new HashSet<>();

    for(char key : chars){
      if(rSet.contains(key)){
        System.out.println("The first repeating char is "+key);
        break;
      }
      else{
        rSet.add(key);
      }

    }


  }
  
}
