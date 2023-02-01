public class teenNumberChecker {
    public static void main(String args[]){
    boolean a = isTeen(13);
        System.out.println(a);
        boolean b = hasTeen(22,23,34);
        System.out.println(b);
    }
    public static boolean hasTeen(int first,int second,int third){
        if(isTeen(first) || isTeen(second) || isTeen(third)){
            return true;
        }
return false;
    }
    public static boolean isTeen(int teen){
        if(teen < 13 || teen > 19){
            return false;
        }
        else{
            return true;
        }
    }
}
