public class ImplementStr {
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;

        int result = findAFirst(haystack, needle, 0);
        if (result == -1) return result;

        int j = 1;
        for (int i = result + 1; i < haystack.length() && j < needle.length(); i++) {
            if (needle.charAt(j) == haystack.charAt(i)) {
                j++;
            } else {
                result = findAFirst(haystack, needle, result + 1);
                if (result == -1) return result;
                j = 1;
                i = result;
            }
        }

        return result;
    }

    private int findAFirst(String haystack, String needle, int n) {
        for (int i = n; i < haystack.length() - needle.length() + 1; i++) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

}


//        int result = -1;
//        for (int i = 0; i < needle.length(); i++) {
//        for (int j = 0; j < haystack.length(); j++) {
//        if (needle.charAt(i) == haystack.charAt(j) && result == -1) {
//        result = j;
//        break;
//        } if (j + 1 < haystack.length()) {
//        result = -1;
//        } else {
//        i = 0;
//        break;
//        }
//        }
//        if (result == -1) return result;

//    Implement strStr().
//
//        Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//        Clarification:
//
//        What should we return when needle is an empty string? This is a great question to ask during an interview.
//
//        For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
//
//
//
//        Example 1:
//
//        Input: haystack = "hello", needle = "ll"
//        Output: 2
//
//        Example 2:
//
//        Input: haystack = "aaaaa", needle = "bba"
//        Output: -1
//
//
//
//        Constraints:
//
//        1 <= haystack.length, needle.length <= 104
//        haystack and needle consist of only lowercase English characters.
//
