public class ImplementStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int result = -1;
        for (int i = 0; i < needle.length(); i++) {
            System.out.print("result = " + result + "; i = " + i);
            for (int j = 0; j < haystack.length(); j++) {
                if (needle.charAt(i) == haystack.charAt(j)) {
                    if (result == -1) {
                        result = j;
                    }
                } else {
                    result = -1;
                }
            }
            if (result == -1) return result;
        }
        return result;
    }
}

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
