package mikolajsitek;

public class SumOdd {
    public static void main(String[] args){
       int x = sumOdd(1,100);
        System.out.println(x);
    }
    public static boolean isOdd(int number){
        if(number < 0)
            return false;

        if(number % 2 == 1)
            return true;
        else
            return false;
    }
    public static int sumOdd(int start,int end){

        int sum = 0;

        if(end < start || end < 0 || start < 0 ) {
            return -1;
        }
        else{
            for(int i=start;i<=end;i++){
                if(isOdd(i))
                {
                    sum += i;
                }
            }
        }

        return sum;
    }
}
