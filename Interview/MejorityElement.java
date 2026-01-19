
import java.util.HashMap;

/* 
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/

public class MejorityElement {


    public static void mejorityElement(int nums[]){
        int size = nums.length / 2;
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key) > size){
                System.out.println("Majority element : " +key);
            }
        }

    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        mejorityElement(nums);
    }
}
