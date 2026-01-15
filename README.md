Fixed Size Wndow :
Window Size is Fixed
Ex : Maximum Sum of Subarray of Size K, Average of size K
Window size never changes, both pointers move together
Logic => Add new element at right, Remove Old Element at left

Variable Size Window:
Window size is not fixed
Ex : Longest Subarray with sum <= K, Longest Substring Without Repeating Characters.
Logic => Expand to include more elements, Shrink window when condition breaks.
right moves -> Grow
left moves -> fix voilation.

1. Minimum Size Subarray of Sum K
2. First Negative Number in Every Window of Size K
3. Longest Subarray with Sum K
4.Maximum Sum of Subarray K
5.Max Consecutive Ones
6.Substrings of Size 3 with Distinct Chracters.

7.Count Number of Nice Subarrays.(Variable Size)
8.Count Complete Subarrays in an array.(Variable Size)

7 and 8 are variable size window problems, where we have exactly K  condition and find the count of subarrays,
if a window from left to right is valid, then all the subarrays ending on right will also be valid subarrays,
=> Exactly(K) = atMost(K) - atMost(K-1) = 0,1,2,3,...(K) - 0,1,2,3,.. (K-1) = K
=> so we can use atMost(K) means <= K example atMost(3) => 0,1,2,3
For counting use count += right - left + 1; here we are counting all the subarrays which holds the condition and ending at right.
If the conditions i.e. oddCount > K or map.size() > K we need to shrink that is move the left and remove nums[left].
and increment left, perform this untill the while(condition) becomes false.
Then return count;

