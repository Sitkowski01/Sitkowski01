public class PlayingCat {
    public static void main(String[] args){
    boolean x = isCatPlaying(true,10);
        System.out.println(x);
    }
        public static boolean isCatPlaying(boolean summer, int temperature) {
            if (summer) {
                return temperature >= 25 && temperature <= 45;
            }
            else {
                return temperature >= 25 && temperature <= 35;
            }
        }
    }
