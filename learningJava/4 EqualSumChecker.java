public class equalSumChecker {
    
    public static void main(String args[]){
       boolean cos = hasEqualSum(1,1,1);
        System.out.println(cos);
    }
    public static boolean hasEqualSum(int first,int second,int score){
        if(first + second == score) {
            return true;
        }
        else
            return false;
    }
}
