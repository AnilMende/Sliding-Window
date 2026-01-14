import java.util.HashSet;

public class SubstringofSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        String s = "xyzzyxxx";
        System.out.println(countGoodSubstring(s));
    }
    //a substring is called as Good Substring
    //if the substring contains all the distinct characters
    //and the length of the substring in this case is 3
    //so it is a fixed size window problem

    static int countGoodSubstring(String s){
        int count = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();

        for(int right=0;right < s.length();right++){

            //if the element is already in the set
            //remove it's prevois occurrence or to make the window valid
            //shrink it, by removing element at left and incrementing left
            //then checking again if the element is in the set or not
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            //if the element is unique i.e. not in the set add it to set
            set.add(s.charAt(right));

            if(right - left + 1 == 3){
                if(set.size() == 3){
                    count++;
                    set.remove(s.charAt(left));
                    left++;
                }

            }
        }
        return count;
    }
}
