
import java.util.HashMap;



// Example:
// arr = [2, 7, 11, 15], target = 9
// Output: 2 + 7

public class TwoSum {
    public static void twoSum(int arr[], int target) {
       HashMap <Integer,Integer> map = new HashMap<>();

       for(int i=0; i<arr.length; i++){
        int second = target - arr[i];

        if(map.containsKey(second)){
            System.out.println("Pair " + second + " , " + arr[i]);
        }

        map.put(arr[i], i);
       }
       
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 7 };
        twoSum(arr, 9);

    }
}
