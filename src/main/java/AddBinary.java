import java.util.Objects;

/*
Given two binary strings a and b, return their sum as a binary string.



        Example 1:

        Input: a = "11", b = "1"
        Output: "100"

        Example 2:

        Input: a = "1010", b = "1011"
        Output: "10101"



        Constraints:

        1 <= a.length, b.length <= 104
        a and b consist only of '0' or '1' characters.
        Each string does not contain leading zeros except for the zero itself.

*/

public class AddBinary {
    public String addBinary(String a, String b) {
        if (Objects.equals(a, "0"))
            return b;
        if (Objects.equals(b, "0"))
            return a;
        StringBuilder result = new StringBuilder();
        int aL = a.length();
        int bL = b.length();

//        check if aL and bL are not equal. and if not add zeros
        if (aL > bL) {
            StringBuilder bBuilder = new StringBuilder(b);
            for (int i = 0; i < aL - bL; i++) {
                bBuilder.insert(0, "0");
            }
            b = bBuilder.toString();
        } else if (aL < bL) {
            StringBuilder bBuilder = new StringBuilder(a);
            for (int i = 0; i < bL-aL; i++) {
                bBuilder.insert(0, "0");
            }
            a = bBuilder.toString();
        }
        byte carry = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            byte aByte = (byte) Character.getNumericValue(a.charAt(i));
            byte bByte = (byte) Character.getNumericValue(b.charAt(i));
            byte sum = (byte) (aByte + bByte + carry);
            if (sum < 2) {
                result.insert(0, sum);
                carry = 0;
            } else if (sum == 2) {
                result.insert(0, '0');
                carry = 1;
            } else {
                result.insert(0,'1');
                carry = 1;
            }
        }
        if (carry == 1){
            result.insert(0,'1');
        }

        return result.toString();
    }
}



