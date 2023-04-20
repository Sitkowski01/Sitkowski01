public class IsPalindrome {

    public static void main(String args[]){
       boolean cos = isPalindrome(-101);
        System.out.println(cos);
    }

    public static boolean isPalindrome(int number) {
            number = Math.abs(number);
            int reverse = 0,numberCopy = number, lastDigit;
        while (numberCopy > 0) {
            lastDigit = numberCopy % 10;
            reverse = reverse * 10 + lastDigit;
            numberCopy /= 10;
        }
            if (reverse == number) {
                return true;
            }else {
                return false;
            }
        }
    }

