// question -> 
// input -> level
// output -> true 
// input -> hello
// output -> false

public class Palindrom {
 public static void main(String[] args) {
    String str = "level";
    System.out.println(isPalindromString(str));

 }   

 public static boolean isPalindromString(String str){
    int left=0;
    int right= str.length()-1;
    while (left<right) {
            if(str.charAt(left) == str.charAt(right))
                return true;

            left++;
            right--;
    }   
    return false;
 }
}
