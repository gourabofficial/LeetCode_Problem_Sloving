
import java.util.Arrays;
import java.util.Stack;

// For each element, you must find the next element on the right that is greater than it.
// Input:  [4, 5, 2, 25]
// Output: [5, 25, 25, -1]

public class nextGretterElement {
    public static int[] nextGretterElementFind(int[] arr) {
        int size = arr.length;
        int []result = new int[size];

        Stack<Integer> stack = new Stack<>();

        for(int i=size-1; i>=0; i--){
            while (!stack.isEmpty() && stack.peek() <= arr[i]) { 
                stack.pop();
            }
            if(stack.isEmpty() ){
                result[i] = -1;
            }else{
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 25 };
        int[] result = nextGretterElementFind(arr);
        System.out.println(Arrays.toString(nextGretterElementFind(arr)));

    }
}


// must do Dry Run for good understanding.