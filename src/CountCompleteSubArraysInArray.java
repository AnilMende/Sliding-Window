import java.util.HashMap;
import java.util.HashSet;

public class CountCompleteSubArraysInArray {
    public static void main(String[] args) {

        //int nums[] = {1,3,1,2,2};
        int nums[] = {5,5,5,5,5};
        int k = FindDistinctCount(nums);
        int res = CompleteSubArrayCount(nums,k) - CompleteSubArrayCount(nums,k-1);

        System.out.println("Complete Subarrays count is " + res);
    }

    static int FindDistinctCount(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        return set.size();
    }

    static int CompleteSubArrayCount(int nums[], int k){

        int count = 0;
        int left = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int right = 0;right < nums.length;right++){

            map.put(nums[right], map.getOrDefault(nums[right],0)+1);

            //map.size() corresponds to number of distinct elements in the window from the left to right
            //in this case we need to shrink that is move left poninter to right side
            //decrease the nums[left] count by 1 in the map
            //if it's count is 0 then remove it from the map
            //and increment left by 1
            //continue this process untill the map.size is <= k
            while(map.size() > k){
                map.put(nums[left], map.get(nums[left])-1);

                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }

            count += right -  left + 1;
        }
        return count;
    }
}
