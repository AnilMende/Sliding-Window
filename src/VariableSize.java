public class VariableSize {
    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6};
        System.out.println(maxLength(nums,10));
    }
    static int maxLength(int nums[], int k){

        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for(int right = 0; right < nums.length;right++){
            sum += nums[right];

            while(sum > k){
                sum -= nums[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
