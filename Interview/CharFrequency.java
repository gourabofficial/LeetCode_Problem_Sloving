// input = "aabbccdde"
// output = {'a': 2, 'b': 2, 'c': 2, 'd': 2, 'e': 1}

import java.util.HashMap;

public class CharFrequency {
     public static void charFrequency(String str) {
          HashMap<Character, Integer> map = new HashMap<>();
          for(int i=0; i<str.length(); i++){
               char ch = str.charAt(i);

               if(map.containsKey(ch)){
                    map.put(ch, map.get(ch)+1);
               }else{
                    map.put(ch, 1);
               }
          }

          for (char key : map.keySet()) {
               System.out.println(key + "-> " + map.get(key));
          }

     }

     public static void main(String[] args) {
          String str = "aabbccdde";
          charFrequency(str);
     }
}
