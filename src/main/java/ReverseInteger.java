/**
 * 7. Reverse Integer
 * Medium
  * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 *
 */
public class ReverseInteger {

    public int reverse(int x) {
        
        int negative = x;
        if(x < 0){
            x = x*(-1);
        }

        if(x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE){
            return 0;
        }

        long reverse = 0L;
        while (x > 0){long digits = x % 10;
            reverse = reverse*10 + digits;

            x = x/10;

            if (reverse >= Integer.MAX_VALUE){
                return 0;
            }
        }


        if (negative < 0){
            reverse = reverse * (-1);
        }
        return (int) reverse;
    }

    public int IntegerToString(int x){

        int negative = x;
        if(x < 0){
            x = x*(-1);
        }

        if(x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE){
            return 0;
        }

        String numberString = String.valueOf(x);
        StringBuilder reverse = new StringBuilder();
        while(!numberString.equals("")){
            reverse.insert(0, numberString.charAt(0));
            numberString = numberString.substring(1);
        }

        if (Long.parseLong(reverse.toString()) >= Integer.MAX_VALUE){
            return 0;
        }

        if (negative < 0){
            return Integer.parseInt(reverse.toString())*(-1);
        }

        return Integer.parseInt(reverse.toString());
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();

        System.out.println(reverseInteger.reverse(10));
        System.out.println(reverseInteger.reverse(Integer.MAX_VALUE));
        System.out.println(reverseInteger.reverse(Integer.MIN_VALUE));
        System.out.println(reverseInteger.reverse(2345455));

        System.out.println(reverseInteger.IntegerToString(10));
        System.out.println(reverseInteger.IntegerToString(Integer.MAX_VALUE));
        System.out.println(reverseInteger.IntegerToString(Integer.MIN_VALUE));
        System.out.println(reverseInteger.IntegerToString(2345455));
        System.out.println(reverseInteger.IntegerToString(-2345455));



    }
}
