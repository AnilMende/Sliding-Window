public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int nums[] = {0,2,3,1,1,4,3};
        System.out.println(maxSubArrayLength(nums,7));
    }

    static int maxSubArrayLength(int nums[], int k){
        int left = 0;
        int maxLen = 0;
        int sum = 0;

        for(int right = 0;right < nums.length;right++){
            sum += nums[right];

            while(sum >= k){
                maxLen = Math.max(maxLen, right-left+1);
                sum -= nums[left];
                left++;
            }
        }

        return maxLen;
    }
}
