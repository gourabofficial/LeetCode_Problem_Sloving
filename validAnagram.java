
import java.util.Arrays;

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 
// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

public class validAnagram {
    public static void main(String[] args) {
      String  s = "anagram";
      String t ="nagaram";

      System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

       char arr1 [] = s.toCharArray();
       char arr2 [] = t.toCharArray();

       Arrays.sort(arr1);
       Arrays.sort(arr2);

       return Arrays.equals(arr1,arr2);


    }
}
