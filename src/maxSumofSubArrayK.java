public class maxSumofSubArrayK {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        System.out.println(maxSum(nums,5));
    }

    static int maxSum(int nums[], int k){

        int left = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int right = 0;right < nums.length;right++){
            sum += nums[right];

            int windowSize = right - left + 1;
            if(windowSize == k){
                maxSum = Math.max(sum, maxSum);
                sum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}
