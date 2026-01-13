import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class FirstNegativeFixedSize {
    public static void main(String[] args) {
        int nums[] = {12,-1,-7,8,-15,30,16,28};
        System.out.println(FirstNegative(nums,3));
    }

    static List<Integer> FirstNegative(int nums[], int k){
        List<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        int left = 0;

        for(int right = 0; right < nums.length;right++){
            //if current element is negative add it to deque
            if(nums[right] < 0){
                dq.addLast(nums[right]);
            }

            int windowSize = right - left + 1;

            if(windowSize == k){

                //if deque is empty no negative in window
                if(dq.isEmpty()){
                    list.add(0);
                }
                else{
                    list.add(dq.peekFirst());
                }

                if(!dq.isEmpty() && nums[left] == dq.peekFirst()){
                    dq.removeFirst();
                }
                left++;
            }
        }
        return list;
    }
}
