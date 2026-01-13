public class FixedSize {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        System.out.println(fixed(nums,3));
    }

    static int fixed(int nums[], int k){


        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int left = 0;

        for(int right = 0;right < nums.length;right++){
            sum += nums[right];

            if(right -  left + 1 == k){
                maxSum = Math.max(maxSum, sum);
                sum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}
