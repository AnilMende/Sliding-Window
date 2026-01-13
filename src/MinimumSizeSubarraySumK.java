public class MinimumSizeSubarraySumK {
    public static void main(String[] args) {
        int nums[] = {1,2,3,2,4,3};
        System.out.println(minSubArrayLen(nums,7));
    }

    static int minSubArrayLen(int nums[] , int target){

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        for(int right = 0;right < nums.length;right++){
            sum += nums[right];

            while(sum >= target){
                minLen = Math.min(minLen,right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if(minLen == Integer.MAX_VALUE){
            return 0;
        }
        return minLen;
    }
}
