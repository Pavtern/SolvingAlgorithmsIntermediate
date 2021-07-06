import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        List<Character> currentSub = new LinkedList<>();
        int longestSub = 0;

        int startSubIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!currentSub.contains(s.charAt(i))) {
                if(currentSub.isEmpty()){
                    startSubIndex = i;
                }
                currentSub.add(s.charAt(i));
                continue;
            }
            if(currentSub.size() > longestSub){
                longestSub = currentSub.size();
            }
            currentSub.clear();
            i = startSubIndex;
        }

        if(longestSub < currentSub.size())
            return currentSub.size();

        return longestSub;
    }
}
