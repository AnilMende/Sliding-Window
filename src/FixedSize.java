public class FixedSize {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        System.out.println(fixed(nums,3));

        int arr[] = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println(noOfSubarrays(arr,k,threshold));

        String blocks = "WBBWWBBWBW";
        System.out.println(minimumRecolors(blocks,7));
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

    //no.of.subarrays of Size K and Average greater than or equal to threshold
    static int noOfSubarrays(int nums[], int k, int threshold){

        int count = 0;
        int sum = 0;
        int left = 0;

        for(int right = 0;right < nums.length;right++){
            sum += nums[right];

            if(right - left + 1 == k){
                if((sum / k) >= threshold){
                    count++;
                }
                sum -= nums[left];
                left++;
            }
        }
        return count;
    }

    //Minimum Recolors to Get K consecutive black blocks
    static int minimumRecolors(String blocks, int k){

        int countW = 0;
        int minW = blocks.length();

        int left = 0;
        for(int right = 0;right < blocks.length();right++){
            if(blocks.charAt(right) == 'W'){
                countW++;
            }

            if(right - left + 1 == k){
                minW = Math.min(minW, countW);
                if(blocks.charAt(left) == 'W'){
                    countW--;
                }
                left++;
            }
        }
        return minW;
    }
}
