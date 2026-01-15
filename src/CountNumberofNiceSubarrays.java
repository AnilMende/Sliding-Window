public class CountNumberofNiceSubarrays {
    public static void main(String[] args) {
        int nums[] = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        int res = countNiceSubarrays(nums,k) - countNiceSubarrays(nums,k-1);
        System.out.println(res);
        //System.out.println(countNiceSubarrays(nums,k));
    }

    static int countNiceSubarrays(int nums[], int k){

        int count = 0;
        int oddCount = 0;

        int left = 0;

        for(int right = 0;right < nums.length;right++){
            if(nums[right] % 2 != 0){
                oddCount++;
            }

            while(oddCount > k){
                if(nums[left] % 2 != 0){
                    oddCount -= 1;
                }
                left++;
            }

            count += right - left + 1;
        }
        return count;
    }
}
