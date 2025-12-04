import java.util.HashMap;

public class HashMaps {

  public static void main(String[] args) {

    HashMap<String,Integer> hm = new HashMap<>();
    hm.put("Apples", 2);
    hm.put("Banana", 3);
    hm.put("Kiwi", 1);
    hm.put("Papaya",6);

    System.out.println(hm);
    System.out.println(hm.size());
    System.out.println(hm.get("Banana"));
    System.out.println(hm.containsKey("Papaya"));

    for(String s: hm.keySet()){
      System.out.println(s);
    }

    System.out.println(hm.remove("Banana"));
    System.out.println(hm.containsKey("Banana"));

    int[] array1 = new int[]{1,2,10,-2,3};
    int[] array2 = new int[]{3,4,1,11,13};

    getMaxFreq("aaaacbccddefbcfb");
    getCommon(array1,array2);

  }

  public static void getMaxFreq(String inputString){

    HashMap<Character,Integer> freqMap = new HashMap<>();

    char[] ch = inputString.toCharArray();

    for (char key : ch) {
        if(freqMap.containsKey(key)){
          int freq = freqMap.get(key);
          freqMap.replace(key, freq+1);
        }
        else{
          freqMap.put(key, 1);
        }
    }
    System.out.println(freqMap);

    char maxChar = '\0';
    int maxFreq = 0;

    for(char key : freqMap.keySet()){

      if(freqMap.get(key) > maxFreq){
          maxFreq = freqMap.get(key);
          maxChar = key;

      }
    }

    System.out.println("Max key is "+ maxChar+ " Max value is "+ maxFreq);

  }
  
  public static void getCommon(int[] array1, int[] array2){

    HashMap<Integer,Integer> result = new HashMap<>();

    for(int i =0;i<array1.length;i++){
      result.put(array1[i],0);
    }
    for(int i =0;i<array1.length;i++){
      if(result.containsKey(array2[i])){
        System.out.println(array2[i]);
      }
    }
  }
}
