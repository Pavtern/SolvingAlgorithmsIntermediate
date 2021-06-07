import java.util.HashMap;
import java.util.Map;

public class CheckIfWordEqualsSummationOfTwoWords {
    public static void main(String[] args) {
        System.out.println(isSumEqual("acb", "cba", "cdb"));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return stringToInt(targetWord) == (stringToInt(firstWord) + stringToInt(secondWord));
    }

    public static int stringToInt(String string){
        StringBuilder s = new StringBuilder();
        Map<Character, Integer> myMap = new HashMap();
        int n = 0;
        for (int i = 'a'; i <= 'z'; i++, n++) {
            char myChar = (char) i;
            myMap.put(myChar, n);
        }
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            s.append(myMap.get(ch));
        }
        return Integer.parseInt(String.valueOf(s));
    }
}
