public class SumFirstAndLastDigit {
    public static void main(String args[]){
    int x = sumFirstAndLastDigit(152);
        System.out.println(x);
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0)
            return -1;

        int lastDigit = number % 10;
        while(number > 9) {
            number= number / 10;
        }
        int sum = number + lastDigit;
        return sum;
    }
}
