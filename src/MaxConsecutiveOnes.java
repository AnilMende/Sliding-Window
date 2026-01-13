public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        System.out.println(maxOnes(nums));
    }

    static int maxOnes(int nums[]){

        int count = 0;
        int maxOnes = 0;
        for(int num : nums){
            if(num == 1){
                count++;
            }
            else{
                //this is the count of ones before the 0 is occurred
                maxOnes = Math.max(count, maxOnes);
                //then initialize the count to 0
                count = 0;
            }
        }
        //if in case all the values of nums are 1's we dont have any step in
        //calculating the maxOnes so using Math.max between maxOnes, count
        return Math.max(maxOnes, count);
    }

}
