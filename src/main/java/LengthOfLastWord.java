public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        boolean flag = false;
        int result = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) != ' '){
                result++;
                flag = true;
            } else if (flag) {
                return result;
            }
        }
        return result;
    }
}
