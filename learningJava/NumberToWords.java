public class NumberToWords {
    public static void main(String[] args){
    numberToWords(reverse(1234));
    int x = getDigitCount(1111);
        System.out.println(x);
    }
    public static void numberToWords(int number) {
        int remainder = 0;
        if (reverse(number) == 0) {
            System.out.println("Zero");
        }
            else if (reverse(number) == 1) {
                System.out.println("One");
        }

        else if (reverse(number)== 2) {
            System.out.println("Two");
        }

        else if (reverse(number) == 3) {
            System.out.println("Three");
        }

        else if (reverse(number) == 4) {
            System.out.println("Four");
        }

        else if (reverse(number) == 5) {
            System.out.println("Five");
        }

        else if (reverse(number) == 6) {
            System.out.println("Six");
        }

        else if (reverse(number) == 7) {
            System.out.println("Seven");
        }

        else if (reverse(number) == 8) {
            System.out.println("Eight");
        }

        else if (reverse(number) == 9) {
            System.out.println("Nine");
        }else {
            for (int i = 0; number*10 > 9; i++) {
                remainder = number % 10;
                number = number / 10;
                switch (remainder) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Value");
                        break;

                }
            }
        }
    }
    public static int reverse(int number){
        int reverse = 0;
        for( ;number != 0; number=number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        int remainder = 0,count = 0;
        if(number < 0)
            return -1;

        for(int i=0;number > 9;i++) {
            remainder = number % 10;
            number = number / 10;
            count++;
        }
        return count+1;
    }
}
