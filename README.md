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
